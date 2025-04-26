package com.example.auth_spring_boot.service;
import com.example.auth_spring_boot.dto.PostRequest;
import com.example.auth_spring_boot.entity.Post;
import com.example.auth_spring_boot.entity.User;
import com.example.auth_spring_boot.repository.PostRepository;
import com.example.auth_spring_boot.utils.UserUtil;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    private final PostRepository postRepository;
    private final UserUtil userUtil;
//--------------------post------------------
    public PostService(PostRepository postRepository, UserUtil userUtil) {
        this.postRepository = postRepository;
        this.userUtil = userUtil;
    }
//-------------------create post-----------------
    public Post createPost(PostRequest request) {
        User user = userUtil.getCurrentUser();
        Post post = new Post();
        post.setTitle(request.getTitle());
        post.setContent(request.getContent());
        post.setUser(user);
        return postRepository.save(post);
    }
}
