package com.asusoftware.Myrent.service.user;

import com.asusoftware.Myrent.model.User;
import com.asusoftware.Myrent.model.dto.user.CreateUserDto;
import com.asusoftware.Myrent.model.dto.user.UserDto;

import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
public interface UserService {
    void create(CreateUserDto createUserDto);
    List<UserDto> findAll();
    UserDto findById(UUID id);
    void delete(UUID id);
}
