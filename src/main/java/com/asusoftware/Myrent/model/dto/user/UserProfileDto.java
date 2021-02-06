package com.asusoftware.Myrent.model.dto.user;

import com.asusoftware.Myrent.model.Address;
import com.asusoftware.Myrent.model.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/5/2021
 */
@Getter
@Setter
public class UserProfileDto {
    @NotBlank
    private UUID id;
    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @NotNull
    @JsonFormat(pattern="yyyy-MM-dd") private Date birthday;
    @Email
    @NotBlank private String email;
    @NotBlank private String phone;
    @NotNull private Address address;

    public static UserProfileDto toDto(User user) {
        UserProfileDto userProfileDto = new UserProfileDto();
        userProfileDto.setId(user.getId());
        userProfileDto.setFirstName(user.getFirstName());
        userProfileDto.setLastName(user.getLastName());
        userProfileDto.setEmail(user.getEmail());
        userProfileDto.setPhone(user.getPhone());
        userProfileDto.setBirthday(user.getBirthday());
        userProfileDto.setAddress(user.getAddress());
        return userProfileDto;
    }
}
