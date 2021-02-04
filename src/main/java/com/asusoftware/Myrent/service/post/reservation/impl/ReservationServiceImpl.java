package com.asusoftware.Myrent.service.post.reservation.impl;

import com.asusoftware.Myrent.model.Post;
import com.asusoftware.Myrent.model.PostState;
import com.asusoftware.Myrent.model.Reservation;
import com.asusoftware.Myrent.model.User;
import com.asusoftware.Myrent.model.dto.post.ReserveDto;
import com.asusoftware.Myrent.repository.PostRepository;
import com.asusoftware.Myrent.repository.ReservationRepository;
import com.asusoftware.Myrent.service.post.PostFinder;
import com.asusoftware.Myrent.service.post.reservation.ReservationService;
import com.asusoftware.Myrent.service.user.UserFinder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/4/2021
 */
@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements ReservationService {

    private final PostFinder postFinder;
    private final PostRepository postRepository;
    private final UserFinder userFinder;
    private final ReservationRepository reservationRepository;

    @Override
    public void create(UUID id, ReserveDto reserveDto) {
        User user = userFinder.findById(reserveDto.getUserId());
        Post post = postFinder.findById(id);
        post.setPostState(PostState.RESERVED);
        Reservation reservation = new Reservation();
        reservation.setUser(user);
        reservation.setStartDate(reserveDto.getStartDate());
        reservation.setEndDate(reserveDto.getEndDate());
        post.setReservation(reservation);
        postRepository.save(post);
    }

    @Override
    public void delete(UUID id) {
        reservationRepository.deleteById(id);
    }
}
