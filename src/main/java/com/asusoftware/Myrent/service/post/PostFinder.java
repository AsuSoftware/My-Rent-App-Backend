package com.asusoftware.Myrent.service.post;

import com.asusoftware.Myrent.model.Post;
import com.asusoftware.Myrent.model.PostCategory;

import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
public interface PostFinder {
    List<Post> findAllByCategory(PostCategory postCategory);
    List<Post> findAll(int page, int size);
    Post findById(UUID id);
}
