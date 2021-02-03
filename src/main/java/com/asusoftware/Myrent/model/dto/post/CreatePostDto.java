package com.asusoftware.Myrent.model.dto.post;

import com.asusoftware.Myrent.model.*;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Getter
@Setter
public class CreatePostDto {
    @NotNull private Address address;
    @NotBlank private String pricePerDay;
    @NotNull private PostCategory postCategory;
    @NotBlank private List<String> images;
    @NotNull private CarDto carDto;

    public static Post toPost(CreatePostDto createPostDto) {
        Post post = new Post();
        post.setAddress(createPostDto.getAddress());
        post.setPricePerDay(createPostDto.getPricePerDay());
        post.setPostCategory(createPostDto.getPostCategory());
        post.setPostState(PostState.FREE);
        return post;
    }
}
