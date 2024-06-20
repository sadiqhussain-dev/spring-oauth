package com.coderbyte.client.service;

import org.springframework.stereotype.Service;

@Service
public class CommentService
{
    private final GoApiService apiService;

    public CommentService(GoApiService apiService) {
        this.apiService = apiService;
    }

    public String getAllComments()
    {
        return apiService.getAllComments();
    }

    public String getCommentsForPost(Long postId)
    {
        return apiService.getPostComments(postId);
    }
}
