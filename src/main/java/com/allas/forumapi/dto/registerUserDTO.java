package com.allas.forumapi.dto;

import java.time.LocalDate;

public record registerUserDTO(String name, String lastName, String email, String username, String password, LocalDate birthDate) {
}
