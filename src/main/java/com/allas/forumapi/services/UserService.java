package com.allas.forumapi.services;

import com.allas.forumapi.dto.registerUserDTO;
import com.allas.forumapi.entities.User;
import com.allas.forumapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean registerUser(registerUserDTO dto) {

        if (userRepository.existsByUsername(dto.username())) {
            throw new RuntimeException("This username is already registered, please, choose another one!");
        }

        if (userRepository.existsByEmail(dto.email())) {
            throw new RuntimeException("This email is already registered!");
        }

        userRepository.save(new User(dto));
        return true;
    }
}
