package com.asusoftware.Myrent.controller.payload;

import com.asusoftware.Myrent.model.dto.post.PostDto;
import lombok.*;

/**
 * My-rent Created by Antonio on 2/6/2021
 */
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FindPostResponse {
    private int page;
    private int size;
    private long total;
    private Iterable<PostDto> posts;
}
