package com.asusoftware.Myrent.service.post.impl;

import com.asusoftware.Myrent.exception.PostNotFoundException;
import com.asusoftware.Myrent.model.Post;
import com.asusoftware.Myrent.model.PostCategory;
import com.asusoftware.Myrent.repository.PostRepository;
import com.asusoftware.Myrent.service.post.PostFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Service
@RequiredArgsConstructor
public class PostFinderImpl implements PostFinder {

    private final PostRepository postRepository;

    @Override
    public List<Post> findAllByCategory(PostCategory postCategory) {
        // TODO: find post based on category and filtered from new post to old
       /* return postRepository.findAll(PageRequest.of(page, size)).stream()
                .filter(post -> post.getPostCategory().equals(postCategory))
                .collect(Collectors.toList()); */
        return null;
    }

    @Override
    public List<Post> findAll(int page, int size) {
        return postRepository.findAll(PageRequest.of(page, size)).toList();
    }

    @Override
    public Post findById(UUID id) {
        return postRepository.findById(id).orElseThrow(PostNotFoundException::new);
    }
}
