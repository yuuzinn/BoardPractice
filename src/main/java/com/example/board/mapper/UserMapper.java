package com.example.board.mapper;

import com.example.board.user.controller.routes.UserLoginRequest;
import com.example.board.user.controller.routes.UserSignUpRequest;
import com.example.board.user.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserMapper {
    void signUp(@Param("userId")String userId,
                @Param("password")String password,
                @Param("nickname")String nickname);
//    void signUp(UserSignUpRequest request);
    UserLoginRequest isUserIdPasswordSame(@Param("userId")String userId,
                                          @Param("password")String password);
}
