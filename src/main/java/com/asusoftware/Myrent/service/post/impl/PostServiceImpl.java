package com.asusoftware.Myrent.service.post.impl;

import com.asusoftware.Myrent.model.PostCategory;
import com.asusoftware.Myrent.model.dto.post.CreatePostDto;
import com.asusoftware.Myrent.model.dto.post.PostDto;
import com.asusoftware.Myrent.service.post.PostCreator;
import com.asusoftware.Myrent.service.post.PostFinder;
import com.asusoftware.Myrent.service.post.PostService;
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
public class PostServiceImpl implements PostService {

    private final PostCreator postCreator;
    private final PostFinder postFinder;

    @Override
    public void create(UUID id, CreatePostDto createPostDto) {
      postCreator.create(id, createPostDto);
    }

    @Override
    public List<PostDto> findAllByCategory(PostCategory postCategory) {
        return postFinder.findAllByCategory(postCategory).stream().map(PostDto::toDto).collect(Collectors.toList());
    }
}
