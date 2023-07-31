package com.allas.forumapi.repositories;

import com.allas.forumapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


    boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
