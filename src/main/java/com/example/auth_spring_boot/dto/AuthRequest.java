package com.example.auth_spring_boot.dto;

import lombok.Data;

@Data
public class AuthRequest {
    private String email;
    private String password;
}
