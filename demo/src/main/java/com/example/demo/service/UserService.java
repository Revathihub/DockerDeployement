package com.example.demo.service;

import com.example.demo.entity.UserOne;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserOne saveUser(UserOne user) {
        return  userRepository.save(user);
    }

    public UserOne findUserById(Long userId) {
        return  userRepository.findByUserId(userId);
    }
}
