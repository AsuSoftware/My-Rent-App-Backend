package com.asusoftware.Myrent.service.post.reservation;

import com.asusoftware.Myrent.model.dto.post.ReserveDto;

import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/4/2021
 */
public interface ReservationService {
    void create(UUID id, ReserveDto reserveDto);
    void delete(UUID id);
}
