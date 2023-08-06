package com.allas.forumapi.services;

import com.allas.forumapi.dto.createPostDTO;
import com.allas.forumapi.entities.Post;
import com.allas.forumapi.entities.User;
import com.allas.forumapi.exception.CustomException;
import com.allas.forumapi.repositories.PostRepository;
import com.allas.forumapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private UserRepository userRepository;

    public Post createPost(createPostDTO dto) {

        Optional<User> user = userRepository.findById(dto.userId());
        if (user.isEmpty()) {
            throw new CustomException("This user doesn't exist!");
        }

        Post post = new Post();
        post.setTitle(dto.title());
        post.setDescription(dto.description());
        post.setUser(user.get());

        postRepository.save(post);
        return post;
    }
}
