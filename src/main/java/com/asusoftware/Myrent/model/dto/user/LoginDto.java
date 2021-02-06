package com.asusoftware.Myrent.model.dto.user;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * My-rent Created by Antonio on 2/6/2021
 */
@Getter
@Setter
public class LoginDto {
    @NotBlank @Email private String email;
    @NotBlank private String password;
}
