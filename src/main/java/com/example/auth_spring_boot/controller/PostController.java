package com.example.auth_spring_boot.controller;

import com.example.auth_spring_boot.dto.PostRequest;
import com.example.auth_spring_boot.entity.Post;
import com.example.auth_spring_boot.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    // 📌 Create post
    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody PostRequest request) {
        Post created = postService.createPost(request);
        return ResponseEntity.ok(created);
    }

    // 📌 Get all posts by current user
    //@GetMapping
    //public ResponseEntity<List<Post>> getMyPosts() {
        //List<Post> posts = postService.getMyPosts();
        //return ResponseEntity.ok(posts);
    //}

    // 📌 Update post by ID (only if owned)
    //@PutMapping("/{id}")
    //public ResponseEntity<Post> updatePost(@PathVariable Long id, @RequestBody PostRequest request) {
        //Post updated = postService.updatePost(id, request);
        //return ResponseEntity.ok(updated);
    //}

    // 📌 Delete post by ID (only if owned)
    //@DeleteMapping("/{id}")
    //public ResponseEntity<?> deletePost(@PathVariable Long id) {
        //postService.deletePost(id);
        //return ResponseEntity.ok().build();
    //}
}
