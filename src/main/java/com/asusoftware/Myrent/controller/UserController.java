package com.asusoftware.Myrent.controller;

import com.asusoftware.Myrent.model.dto.user.CreateUserDto;
import com.asusoftware.Myrent.model.dto.user.UserDto;
import com.asusoftware.Myrent.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.UUID;

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

    @GetMapping
    public List<UserDto> findAll() {
        return userService.findAll();
    }

    @DeleteMapping(path = "/{id}")
    public void delete(@PathVariable(name = "id") UUID id) {
        userService.delete(id);
    }
}
