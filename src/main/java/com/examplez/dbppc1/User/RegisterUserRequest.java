package com.examplez.dbppc1.User;
import jakarta.*;
import java.util.*;
import lombok.*;
import org.hibernate.annotations.processing.Pattern;

@Data
public class RegisterUserRequest {
    @NotBlank(message = "Username cannot be blank")
    private String username;

    @NotBlank(message = "Email cannot be blank")
    private String email;

    @NotBlank(message = "Password cannot be blank")
    private String password;

    @NotBlank(message = "Choose a role")
    private String role;
}
