package com.example.auth_spring_boot.repository;

import com.example.auth_spring_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    Optional <User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
