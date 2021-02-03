package com.asusoftware.Myrent.service.user.impl;

import com.asusoftware.Myrent.model.dto.user.CreateUserDto;
import com.asusoftware.Myrent.repository.UserRepository;
import com.asusoftware.Myrent.service.user.UserCreator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Service
@RequiredArgsConstructor
public class UserCreatorImpl implements UserCreator {

    private final UserRepository userRepository;

    @Override
    public void create(CreateUserDto createUserDto) {
      userRepository.save(CreateUserDto.toUser(createUserDto));
    }
}
