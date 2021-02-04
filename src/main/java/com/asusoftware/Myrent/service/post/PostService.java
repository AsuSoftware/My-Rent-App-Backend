package com.asusoftware.Myrent.service.post;

import com.asusoftware.Myrent.model.PostCategory;
import com.asusoftware.Myrent.model.dto.post.CreatePostDto;
import com.asusoftware.Myrent.model.dto.post.PostDto;
import com.asusoftware.Myrent.model.dto.post.ReserveDto;

import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
public interface PostService {
    void create(UUID id, CreatePostDto createPostDto);
    List<PostDto> findAllByCategory(PostCategory postCategory);
    void reserve(UUID id, ReserveDto reserveDto);
}
