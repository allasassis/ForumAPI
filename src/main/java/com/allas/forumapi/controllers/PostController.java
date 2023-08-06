package com.allas.forumapi.controllers;

import com.allas.forumapi.dto.createPostDTO;
import com.allas.forumapi.entities.Post;
import com.allas.forumapi.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    private ResponseEntity<Post> createPost(@RequestBody createPostDTO dto) {
        return ResponseEntity.status(201).body(postService.createPost(dto));
    }
}
