package com.coderbyte.client.service;

import org.springframework.stereotype.Service;

@Service
public class PostService
{
    private final GoApiService apiService;

    public PostService(GoApiService apiService)
    {
        this.apiService = apiService;
    }

    public String getAllPosts()
    {
        return apiService.getAllPosts();
    }

    public String getPostsForUser(Long userId)
    {
        return apiService.getUserPosts(userId);
    }

    public String getPostComments(Long postId)
    {
        return apiService.getPostComments(postId);
    }
}
