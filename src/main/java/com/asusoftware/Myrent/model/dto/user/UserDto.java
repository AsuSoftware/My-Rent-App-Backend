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
 * My-rent Created by Antonio on 2/3/2021
 */
@Getter
@Setter
public class UserDto {
    @NotBlank private UUID id;
    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd") private Date birthday;
    @Email @NotBlank private String email;
    @NotBlank private String phone;
    @NotBlank private String password;
    @NotNull private Address address;

    public static UserDto toDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setId(user.getId());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setEmail(user.getEmail());
        userDto.setPhone(user.getPhone());
        userDto.setBirthday(user.getBirthday());
        return userDto;
    }

    public static User toUser(UserDto userDto) {
        User user = new User();
        user.setId(userDto.getId());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setEmail(userDto.getEmail());
        user.setPhone(userDto.getPhone());
        user.setBirthday(user.getBirthday());
        return user;
    }
}
