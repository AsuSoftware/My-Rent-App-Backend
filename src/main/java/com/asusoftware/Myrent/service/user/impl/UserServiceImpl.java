package com.asusoftware.Myrent.service.user.impl;

import com.asusoftware.Myrent.exception.UserNotFoundException;
import com.asusoftware.Myrent.model.User;
import com.asusoftware.Myrent.model.dto.user.CreateUserDto;
import com.asusoftware.Myrent.model.dto.user.LoginDto;
import com.asusoftware.Myrent.model.dto.user.UserDto;
import com.asusoftware.Myrent.service.user.UserCreator;
import com.asusoftware.Myrent.service.user.UserFinder;
import com.asusoftware.Myrent.service.user.UserRemoval;
import com.asusoftware.Myrent.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserCreator userCreator;
    private final UserFinder userFinder;
    private final UserRemoval userRemoval;

    @Override
    public void create(CreateUserDto createUserDto) {
       userCreator.create(createUserDto);
    }

    @Override
    public String login(LoginDto loginDto) {
        User user = userFinder.findAll().stream()
                .filter(user1 -> user1.getEmail().equals(loginDto.getEmail()) && user1.getPassword().equals(loginDto.getPassword()))
                .findFirst()
                .orElseThrow(UserNotFoundException::new);
        // TODO: get token when we use security
        return null;
    }

    @Override
    public List<UserDto> findAll() {
        return userFinder.findAll().stream().map(UserDto::toDto).collect(Collectors.toList());
    }

    @Override
    public UserDto findById(UUID id) {
        return UserDto.toDto(userFinder.findById(id));
    }

    @Override
    public void delete(UUID id) {
       userRemoval.delete(id);
    }
}
