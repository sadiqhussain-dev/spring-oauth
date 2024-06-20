package com.coderbyte.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "external.api.go")
public class GoApiConfigProperties
{
    private String baseUrl;
    private String usersEndpoint;
    private String postsEndpoint;
    private String commentsEndpoint;
}
