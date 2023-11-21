package com.example.board.user.controller;

import com.example.board.user.controller.routes.UserSignUpRequest;
import com.example.board.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class UserController {
    private UserService userService;
    @PostMapping("/signup")
    public String signUp(UserSignUpRequest request, Model model) {
//        userService.signUp(request);
//        model.addAttribute();
        return "signup";
    }
}
