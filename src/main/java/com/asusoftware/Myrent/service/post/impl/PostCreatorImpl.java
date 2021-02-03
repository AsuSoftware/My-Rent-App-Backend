package com.asusoftware.Myrent.service.post.impl;

import com.asusoftware.Myrent.model.Car;
import com.asusoftware.Myrent.model.Image;
import com.asusoftware.Myrent.model.Post;
import com.asusoftware.Myrent.model.User;
import com.asusoftware.Myrent.model.dto.post.CarDto;
import com.asusoftware.Myrent.model.dto.post.CreatePostDto;
import com.asusoftware.Myrent.model.dto.post.PostDto;
import com.asusoftware.Myrent.repository.CarRepository;
import com.asusoftware.Myrent.repository.ImageRepository;
import com.asusoftware.Myrent.repository.PostRepository;
import com.asusoftware.Myrent.service.post.PostCreator;
import com.asusoftware.Myrent.service.user.UserFinder;
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
public class PostCreatorImpl implements PostCreator {

    private final PostRepository postRepository;
    private final UserFinder userFinder;
    private final ImageRepository imageRepository;
    private final CarRepository carRepository;

    @Override
    public void create(UUID id, CreatePostDto createPostDto) {
        User user = userFinder.findById(id);
        Post post = CreatePostDto.toPost(createPostDto);
        Car car = carRepository.save(CarDto.toEntity(createPostDto.getCarDto()));
        post.setUser(user);
        post.setCar(car);
        List<Image> image = createPostDto.getImages().stream()
                .map(img -> {
                   Image imag = new Image();
                   imag.setValue(img);
                   imag.setPost(post);
                   return imag;
                })
                .collect(Collectors.toList());
        postRepository.save(post);
        imageRepository.saveAll(image);
    }
}
