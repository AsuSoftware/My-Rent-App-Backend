package com.asusoftware.Myrent.service.post.impl;

import com.asusoftware.Myrent.model.Post;
import com.asusoftware.Myrent.model.PostCategory;
import com.asusoftware.Myrent.repository.PostRepository;
import com.asusoftware.Myrent.service.post.PostFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Service
@RequiredArgsConstructor
public class PostFinderImpl implements PostFinder {

    private final PostRepository postRepository;

    @Override
    public List<Post> findAllByCategory(PostCategory postCategory) {
        return postRepository.findAll().stream()
                .filter(post -> post.getPostCategory().equals(postCategory))
                .collect(Collectors.toList());
    }
}
