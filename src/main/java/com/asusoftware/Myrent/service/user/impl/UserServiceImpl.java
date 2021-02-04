package com.asusoftware.Myrent.service.user.impl;

import com.asusoftware.Myrent.model.Post;
import com.asusoftware.Myrent.model.PostState;
import com.asusoftware.Myrent.model.User;
import com.asusoftware.Myrent.model.dto.post.ReserveDto;
import com.asusoftware.Myrent.model.dto.user.CreateUserDto;
import com.asusoftware.Myrent.model.dto.user.UserDto;
import com.asusoftware.Myrent.service.post.PostFinder;
import com.asusoftware.Myrent.service.post.reservation.ReservationService;
import com.asusoftware.Myrent.service.user.UserCreator;
import com.asusoftware.Myrent.service.user.UserFinder;
import com.asusoftware.Myrent.service.user.UserRemoval;
import com.asusoftware.Myrent.service.user.UserService;
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
public class UserServiceImpl implements UserService {

    private final UserCreator userCreator;
    private final UserFinder userFinder;
    private final UserRemoval userRemoval;
    private final ReservationService reservationService;

    @Override
    public void create(CreateUserDto createUserDto) {
       userCreator.create(createUserDto);
    }

    @Override
    public List<UserDto> findAll() {
        return userFinder.findAll().stream().map(UserDto::toDto).collect(Collectors.toList());
    }

    @Override
    public UserDto findById(UUID id) {
        return UserDto.toDto(userFinder.findById(id));
    }

    @Override
    public void delete(UUID id) {
       userRemoval.delete(id);
    }
}
