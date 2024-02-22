package com.security.authy.role;

public enum Role {
    ADMIN("Admin");

    private String role;

    Role(String role) {
        this.role = role;
    }
}