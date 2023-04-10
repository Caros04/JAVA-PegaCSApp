package com.example.PegaCS.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.PegaCS.model.user;
import com.example.PegaCS.repository.UserRepository;

@RestController
@RequestMapping(value = "/api")
public class userController {
    private final UserRepository userRepository;

    public userController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/greet")
    public List<user> getNasabah() {
        return userRepository.findAllActiveUser();
        // return userRepository.findAll();
    }
}
