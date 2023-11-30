package com.example.board.user.service;

import com.example.board.mapper.UserMapper;
import com.example.board.user.controller.routes.UserLoginRequest;
import com.example.board.user.controller.routes.UserSignUpRequest;
import com.example.board.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;
    /**
     * 로그인
     */
    public boolean login(UserLoginRequest request) {
        String userId = request.getUserId();
        String password = request.getPassword();
        UserLoginRequest userIdPasswordSame = userMapper.isUserIdPasswordSame(userId, password);
        if (userIdPasswordSame == null) {
            System.out.println("회원 정보 없음");
        }
        return true;
    }

    /**
     * 회원가입
     */
    public void signUp(UserSignUpRequest request) {
        String userId = request.getUserId();
        String password = request.getPassword();
        String nickname = request.getNickname();
        userMapper.signUp(userId, password, nickname);
    }
    /**
     * 회원조회
     */

    /**
     * 회원수정
     */

    /**
     * 회원탈퇴
     */
}
