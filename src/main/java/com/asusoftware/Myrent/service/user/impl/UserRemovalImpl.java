package com.asusoftware.Myrent.service.user.impl;

import com.asusoftware.Myrent.repository.UserRepository;
import com.asusoftware.Myrent.service.user.UserRemoval;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Service
@RequiredArgsConstructor
public class UserRemovalImpl implements UserRemoval {

    private final UserRepository userRepository;

    @Override
    public void delete(UUID id) {
        userRepository.deleteById(id);
    }
}
