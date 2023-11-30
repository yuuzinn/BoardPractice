package com.example.board.user.controller;

import com.example.board.common.config.LoginCheck;
import com.example.board.user.controller.routes.UserLoginRequest;
import com.example.board.user.controller.routes.UserSignUpRequest;
import com.example.board.user.entity.User;
import com.example.board.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("/login")
    public String loginForm(Model model) {
        model.addAttribute("login", new UserLoginRequest());
        return "login";
    }
    @PostMapping("/login")
    public String login(UserLoginRequest login, HttpSession session) {
        if (!userService.login(login)) {
            return "redirect:/login";
        }
        session.setAttribute("user", login.getUserId());
        return "redirect:/loginSuccess";
    }
    @GetMapping("/loginSuccess")
    public String loginSuccess() {
        return "loginSuccess";
    }
    @PostMapping("/logout")
    @LoginCheck
    public String logOut(HttpSession session) {
        session.invalidate();
        System.out.println("로그아웃 성공");
        return "redirect:/";
    }
    @GetMapping("/logout")
    public String logOutForm() {
        return "logout";
    }
    @GetMapping("/signup")
    public String singUpForm(Model model) {
        model.addAttribute("request", new UserSignUpRequest());
        return "signup";
    }
    @PostMapping("/signup")
    public String signUp(UserSignUpRequest request) {
        userService.signUp(request);
        return "redirect:/signup";
    }
}
