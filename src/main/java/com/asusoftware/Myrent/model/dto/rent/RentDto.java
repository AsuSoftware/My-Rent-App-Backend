package com.asusoftware.Myrent.model.dto.rent;

import com.asusoftware.Myrent.model.Rent;
import com.asusoftware.Myrent.model.dto.post.PostDto;
import com.asusoftware.Myrent.model.dto.user.UserDto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/6/2021
 */
@Getter
@Setter
public class RentDto {
    @NotBlank private UUID id;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd") private Date startDate;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd") private Date endDate;
    @NotNull private PostDto postDto;
    @NotNull private UserDto userRenteredPost;

    public static RentDto toDto(Rent rent) {
        RentDto rentDto = new RentDto();
        rentDto.setId(rent.getId());
        rentDto.setStartDate(rent.getStartDate());
        rentDto.setEndDate(rent.getEndDate());
        rentDto.setPostDto(PostDto.toDto(rent.getPost()));
        rentDto.setUserRenteredPost(UserDto.toDto(rent.getUser()));
        return rentDto;
    }
}
