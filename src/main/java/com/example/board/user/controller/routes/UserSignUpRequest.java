package com.example.board.user.controller.routes;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserSignUpRequest {
    private String userId;
    private String password;
    private String nickname;
}
