package com.coderbyte.client.service;

import org.springframework.stereotype.Service;

@Service
public class UsersService
{
    private final GoApiService apiService;

    public UsersService(GoApiService apiService)
    {
        this.apiService = apiService;
    }

    public String getAllUsers()
    {
        return apiService.getAllUsers();
    }

    public String getUserPosts(Long userId)
    {
        return apiService.getUserPosts(userId);
    }
}
