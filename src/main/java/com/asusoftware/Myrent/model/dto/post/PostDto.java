package com.asusoftware.Myrent.model.dto.post;

import com.asusoftware.Myrent.model.*;
import com.asusoftware.Myrent.model.dto.user.UserDto;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Getter
@Setter
public class PostDto {

    @NotBlank
    private UUID id;
    @NotNull
    private Address address;
    @NotBlank private String pricePerDay;
    @NotNull private PostState postState;
    @NotNull private PostCategory postCategory;
    @NotNull private List<Image> images;
    @NotNull private UserDto userDto;
    @NotNull private CarDto carDto;

    public static Post toPost(PostDto postDto) {
        Post post = new Post();
        post.setId(postDto.getId());
        post.setAddress(postDto.getAddress());
        post.setPricePerDay(postDto.getPricePerDay());
        post.setPostCategory(postDto.getPostCategory());
        post.setImages(postDto.getImages());
        post.setPostState(postDto.getPostState());
        post.setCar(CarDto.toEntity(postDto.getCarDto()));
        return post;
    }

    public static PostDto toDto(Post post) {
        PostDto postDto = new PostDto();
        postDto.setId(post.getId());
        postDto.setAddress(post.getAddress());
        postDto.setPricePerDay(postDto.getPricePerDay());
        postDto.setPostCategory(post.getPostCategory());
        postDto.setImages(post.getImages());
        postDto.setPostState(post.getPostState());
        postDto.setCarDto(CarDto.toDto(post.getCar()));
        return postDto;
    }
}