package com.asusoftware.Myrent.service.post.impl;

import com.asusoftware.Myrent.model.Post;
import com.asusoftware.Myrent.model.User;
import com.asusoftware.Myrent.model.dto.post.CreatePostDto;
import com.asusoftware.Myrent.repository.PostRepository;
import com.asusoftware.Myrent.service.post.PostCreator;
import com.asusoftware.Myrent.service.user.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Service
@RequiredArgsConstructor
public class PostCreatorImpl implements PostCreator {

    private final PostRepository postRepository;
    private final UserFinder userFinder;

    @Override
    public void create(UUID id, CreatePostDto createPostDto) {
        // Siccome abbiamo messo la cascada, si occupera hibernate di salvare tutto per noi, cioè le entità correlate al specifico entity
        User user = userFinder.findById(id);
        Post post = CreatePostDto.toPost(createPostDto);
        post.setUser(user);
        postRepository.save(post);
    }
}
