package com.allas.forumapi.entities;

import com.allas.forumapi.dto.registerUserDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String lastName;
    private String email;
    private String username;
    private String password;
    private LocalDate birthDate;

    public User(registerUserDTO dto) {
        this.name = dto.name();
        this.lastName = dto.lastName();
        this.email = dto.email();
        this.username = dto.username();
        this.password = dto.password();
        this.birthDate = dto.birthDate();
    }
}
