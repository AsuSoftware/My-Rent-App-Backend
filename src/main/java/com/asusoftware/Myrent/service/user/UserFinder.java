package com.asusoftware.Myrent.service.user;

import com.asusoftware.Myrent.model.User;

import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
public interface UserFinder {
    List<User> findAll();
    User findById(UUID id);
}
