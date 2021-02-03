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

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Getter
@Setter
public class CreateUserDto {
    @NotBlank private String firstName;
    @NotBlank private String lastName;
    @NotNull @JsonFormat(pattern="yyyy-MM-dd") private Date birthday;
    @Email @NotBlank private String email;
    @NotBlank private String phone;
    @NotBlank private String password;
    @NotNull private Address address;

    public static User toUser(CreateUserDto createUserDto) {
        User user = new User();
        user.setFirstName(createUserDto.getFirstName());
        user.setLastName(createUserDto.getLastName());
        user.setEmail(createUserDto.getEmail());
        user.setPhone(createUserDto.getPhone());
        user.setBirthday(user.getBirthday());
        return user;
    }
}
