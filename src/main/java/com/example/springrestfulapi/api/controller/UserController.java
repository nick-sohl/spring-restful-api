package com.example.springrestfulapi.api.controller;

import com.example.springrestfulapi.api.model.User;
import com.example.springrestfulapi.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    List<User> all() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/users/{id}")
    public Optional<User> getUser(User user) {
        return userService.getUserById(user.getId());
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(User user) {
        userService.deleteUserById(user.getId());
    }
}
