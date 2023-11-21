package com.example.board.user.entity;

import com.example.board.util.BaseEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class User extends BaseEntity {
    private Long id;
    private String userId;
    private String password;
    private String nickname;
}
