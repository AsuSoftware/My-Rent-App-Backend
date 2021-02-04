package com.asusoftware.Myrent.controller;

import com.asusoftware.Myrent.model.PostCategory;
import com.asusoftware.Myrent.model.dto.post.CreatePostDto;
import com.asusoftware.Myrent.model.dto.post.PostDto;
import com.asusoftware.Myrent.service.post.PostService;
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
@RequestMapping(path = "/api/v1/posts")
public class PostController {

    private final PostService postService;

    @PostMapping(path = "/{id}")
    public void create(@PathVariable(name = "id") UUID id, @Valid @RequestBody CreatePostDto createPostDto) {
        postService.create(id, createPostDto);
    }

    @GetMapping(path = "/{category}")
    public List<PostDto> findAllByCategory(@PathVariable(name = "category") PostCategory postCategory) {
        return postService.findAllByCategory(postCategory);
    }
}
