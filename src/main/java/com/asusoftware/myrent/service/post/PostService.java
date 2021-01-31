package com.asusoftware.myrent.service.post;

import com.asusoftware.myrent.model.Post;

import java.util.List;

/**
 * my-rent Created by Antonio on 1/31/2021
 */
public interface PostService {
    void create();
    List<Post> findAllPost();
    void delete();
}
