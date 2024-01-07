package com.rinvyssondev.paymentsystem.dto;

import com.rinvyssondev.paymentsystem.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record UserRequest(
        @NotNull(message = "The name is not null")
        @NotBlank(message = "The name is not blank")
        String name,
        @NotNull(message = "The email is not null")
        @NotBlank(message = "The email is not blank")
        @Email
        String email,
        @NotNull(message = "The password is not null")
        @NotBlank(message = "The password is not blank")
        @Size(min = 8, message = "The password must contain at least 8 characters")
        String password) {

    public User toModel(){
        return new User(name, email, password);
    }
}
