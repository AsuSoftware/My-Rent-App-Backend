package com.asusoftware.myrent.model.dto;

import com.asusoftware.myrent.model.Address;
import com.asusoftware.myrent.model.PostCategory;
import com.asusoftware.myrent.model.PostType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;
import java.util.UUID;

/**
 * my-rent Created by Antonio on 1/31/2021
 */
@Getter
@Setter
@ToString
public class CreatePostDto {
    private UUID userId;
    private Address address;
    private String pricePerDay;
    private PostCategory postCategory;
    private List<String> images;
    private PostType postType;
}
