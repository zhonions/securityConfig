package com.security.authy.dto;

import jakarta.persistence.Entity;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class CreateUserDto {
    private String username;
    private String password;
}
