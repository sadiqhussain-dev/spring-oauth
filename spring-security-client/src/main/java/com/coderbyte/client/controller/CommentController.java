package com.coderbyte.client.controller;

import com.coderbyte.client.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentController {

    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping
    public ResponseEntity<?> getAllComments()
    {
        String comments = commentService.getAllComments();
        return ResponseEntity.ok(comments);
    }

    @GetMapping
    public ResponseEntity<?> getCommentByPostId(Long postId)
    {
        String comments = commentService.getCommentsForPost(postId);
        return ResponseEntity.ok(comments);
    }
}
