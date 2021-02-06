package com.asusoftware.Myrent.service.rent.impl;

import com.asusoftware.Myrent.exception.RentNotFoundException;
import com.asusoftware.Myrent.model.Post;
import com.asusoftware.Myrent.model.PostState;
import com.asusoftware.Myrent.model.Rent;
import com.asusoftware.Myrent.model.User;
import com.asusoftware.Myrent.model.dto.rent.CreateRentDto;
import com.asusoftware.Myrent.model.dto.rent.RentDto;
import com.asusoftware.Myrent.repository.PostRepository;
import com.asusoftware.Myrent.repository.RentRepository;
import com.asusoftware.Myrent.service.post.PostFinder;
import com.asusoftware.Myrent.service.rent.RentService;
import com.asusoftware.Myrent.service.user.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * My-rent Created by Antonio on 2/5/2021
 */
@Service
@RequiredArgsConstructor
public class RentServiceImpl implements RentService {

    private final RentRepository rentRepository;
    private final UserFinder userFinder;
    private final PostFinder postFinder;
    private final PostRepository postRepository;

    @Override
    public UUID rent(UUID id, CreateRentDto reserveDto) {
        User user = userFinder.findById(reserveDto.getUserId());
        Post post = postFinder.findById(id);
        post.setPostState(PostState.RESERVED);
        Rent rent = new Rent();
        rent.setPost(post);
        rent.setUser(user);
        rent.setStartDate(reserveDto.getStartDate());
        rent.setEndDate(reserveDto.getEndDate());
        rentRepository.save(rent);
        // TODO: sa vad daca sa returnez id sau nimic
        return rent.getId();
    }

    @Override
    public RentDto findRentById(UUID id) {
        return RentDto.toDto(rentRepository.findById(id).orElseThrow(RentNotFoundException::new));
    }

    @Override
    public List<RentDto> findAll(Iterable<UUID> ids) {
        return rentRepository.findAllById(ids).stream().map(RentDto::toDto).collect(Collectors.toList());
    }

    @Override
    public void deleteRent(UUID id) {
        Rent rent = rentRepository.findById(id).orElseThrow(RentNotFoundException::new);
        Post post = postFinder.findById(rent.getPost().getId());
        post.setPostState(PostState.FREE);
        postRepository.save(post);
        rentRepository.delete(rent);
    }
}
