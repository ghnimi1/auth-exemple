package com.example.auth_spring_boot.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String role;
    @Column(unique = true,nullable = false)
    private String email;
    @Column()
    private String accessToken;
    @Column()
    private String refreshToken;
}
