package com.coderbyte.client.service;

import com.coderbyte.client.config.GoApiConfigProperties;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoApiService
{
    private final RestTemplate restTemplate;
    private final GoApiConfigProperties apiConfig;

    public GoApiService(RestTemplate restTemplate, GoApiConfigProperties goApiConfigProperties)
    {
        this.restTemplate = restTemplate;
        this.apiConfig = goApiConfigProperties;
    }

    public String getAllUsers()
    {
        String url = apiConfig.getBaseUrl() + apiConfig.getUsersEndpoint();
        return restTemplate.getForObject(url, String.class);
    }

    public String getAllPosts()
    {
        String url = apiConfig.getBaseUrl() + apiConfig.getPostsEndpoint();
        return restTemplate.getForObject(url, String.class);
    }

    public String getAllComments()
    {
        String url = apiConfig.getBaseUrl() + apiConfig.getCommentsEndpoint();
        return restTemplate.getForObject(url, String.class);
    }

    public String getUserPosts(Long userId)
    {
        String url = apiConfig.getBaseUrl() + apiConfig.getUsersEndpoint() + userId + apiConfig.getPostsEndpoint();
        return restTemplate.getForObject(url, String.class);
    }

    public String getPostComments(Long postId)
    {
        String url = apiConfig.getBaseUrl() + apiConfig.getPostsEndpoint() + postId + apiConfig.getCommentsEndpoint();
        return restTemplate.getForObject(url, String.class);
    }
}
