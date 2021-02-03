package com.asusoftware.Myrent.controller;

import com.asusoftware.Myrent.model.dto.user.CreateUserDto;
import com.asusoftware.Myrent.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public void create(@Valid @RequestBody CreateUserDto createUserDto) {
        userService.create(createUserDto);
    }
}
