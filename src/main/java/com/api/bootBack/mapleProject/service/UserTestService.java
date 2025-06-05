package com.api.bootBack.mapleProject.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.api.bootBack.mapleProject.entity.User;
import com.api.bootBack.mapleProject.repository.UserRepository;

@Service
public class UserTestService {

    private final UserRepository userRepository;

    public UserTestService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
