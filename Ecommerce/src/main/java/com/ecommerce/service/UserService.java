package com.ecommerce.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.entity.User;
import com.ecommerce.repository.UserRepository;
import com.ecommerce.request.UserRequest;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String createUser(UserRequest request) {

        String generatedPassword = UUID.randomUUID().toString().substring(0, 8);

        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(generatedPassword);

        userRepository.save(user);
        return generatedPassword;
    }

    public boolean login(UserRequest request) {

        User user = userRepository.findByUsername(request.getUsername());

        return user != null && user.getPassword().equals(request.getPassword());
    }

}
