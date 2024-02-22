package com.security.authy.dto;

import jakarta.persistence.Entity;
import lombok.*;


@AllArgsConstructor
@Getter
@Setter
public class LoginUserDto {
    private String username;
    private String password;
}
