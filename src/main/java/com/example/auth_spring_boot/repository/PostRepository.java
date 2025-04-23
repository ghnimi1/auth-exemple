package com.example.auth_spring_boot.repository;

import com.example.auth_spring_boot.entity.Post;
import com.example.auth_spring_boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

}
