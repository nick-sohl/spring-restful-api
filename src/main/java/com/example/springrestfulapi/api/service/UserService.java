package com.example.springrestfulapi.api.service;

import com.example.springrestfulapi.api.model.User;
import com.example.springrestfulapi.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Add a new user
    public User addUser(User user) {
        return userRepository.save(user);
    }

    // Get a specific user by ID
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

    // Delete a specific user by ID
    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }

}
