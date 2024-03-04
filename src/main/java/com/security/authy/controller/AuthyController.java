package com.security.authy.controller;

import com.security.authy.dto.LoginUserDto;
import com.security.authy.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
    public class AuthyController {

        @Autowired
        public AuthService authService;

        @PostMapping("/login")
        public String login(@RequestBody LoginUserDto loginUserDto) {
            return authService.login(loginUserDto);
        }
    }
