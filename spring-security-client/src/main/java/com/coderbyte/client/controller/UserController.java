package com.coderbyte.client.controller;

import com.coderbyte.client.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers()
    {
        String users = usersService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{userId}/posts")
    public ResponseEntity<?> getUserPosts(@PathVariable Long userId)
    {
        String userPosts = usersService.getUserPosts(userId);
        return ResponseEntity.ok(userPosts);
    }
}
