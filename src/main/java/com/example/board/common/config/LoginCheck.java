package com.example.board.common.config;

import java.lang.annotation.*;

@Inherited
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface LoginCheck {
}
