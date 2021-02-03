package com.asusoftware.Myrent.service.post;

import com.asusoftware.Myrent.model.Post;
import com.asusoftware.Myrent.model.PostCategory;

import java.util.List;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
public interface PostFinder {
    List<Post> findAllByCategory(PostCategory postCategory);
}
