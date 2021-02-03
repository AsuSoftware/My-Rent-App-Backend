package com.asusoftware.Myrent.service.user.impl;

import com.asusoftware.Myrent.exception.UserNotFoundException;
import com.asusoftware.Myrent.model.User;
import com.asusoftware.Myrent.repository.UserRepository;
import com.asusoftware.Myrent.service.user.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Service
@RequiredArgsConstructor
public class UserFinderImpl implements UserFinder {

    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(UUID id) {
        return userRepository.findById(id).orElseThrow(UserNotFoundException::new);
    }
}
