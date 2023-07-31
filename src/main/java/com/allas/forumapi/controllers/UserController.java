package com.allas.forumapi.controllers;

import com.allas.forumapi.dto.registerUserDTO;
import com.allas.forumapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<Boolean> registerUser(@RequestBody registerUserDTO dto) {
        return ResponseEntity.ok(userService.registerUser(dto));
    }
}
