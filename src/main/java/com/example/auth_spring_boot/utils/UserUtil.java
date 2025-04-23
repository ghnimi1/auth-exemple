package com.example.auth_spring_boot.utils;

import com.example.auth_spring_boot.entity.User;
import com.example.auth_spring_boot.repository.UserRepository;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class UserUtil {
    private final UserRepository userRepository;
    public UserUtil(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public User getCurrentUser() {
        String email = SecurityContextHolder.getContext().getAuthentication().getName();
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
