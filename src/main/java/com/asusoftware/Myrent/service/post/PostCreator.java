package com.asusoftware.Myrent.service.post;

import com.asusoftware.Myrent.model.dto.post.CreatePostDto;

import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
public interface PostCreator {
    void create(UUID id, CreatePostDto createPostDto);
}
