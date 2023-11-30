package com.example.board.user.controller.routes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginRequest {
    private String userId;
    private String password;
}
