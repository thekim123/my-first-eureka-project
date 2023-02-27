package com.thekim12.userservice.vo;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
public class RequestUser {

    @NotNull(message = "Username cannot be null")
    @Size(min = 2, message = "Username not be less than two characters.")
    private String name;

    @NotNull(message = "Password  cannot be null")
    @Size(min = 2, message = "Password must be equal or greater than two characters.")
    private String password;

    @NotNull(message = "Email cannot be null")
    @Size(min = 2, message = "Email not be less than two characters.")
    @Email
    private String email;
}
