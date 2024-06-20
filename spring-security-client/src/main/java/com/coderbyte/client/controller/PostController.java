package com.coderbyte.client.controller;

import com.coderbyte.client.service.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController
{
    private final PostService postService;

    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping
    public ResponseEntity<?> getAllPosts()
    {
        String posts = postService.getAllPosts();
        return ResponseEntity.ok(posts);
    }

    @GetMapping("/{postId}/comments")
    public ResponseEntity<?> getPostComments(@PathVariable Long postId)
    {
        String postComments = postService.getPostComments(postId);
        return ResponseEntity.ok(postComments);
    }
}
