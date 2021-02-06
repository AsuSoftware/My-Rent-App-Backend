package com.asusoftware.Myrent.service.rent;

import com.asusoftware.Myrent.model.dto.rent.CreateRentDto;
import com.asusoftware.Myrent.model.dto.rent.RentDto;

import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/5/2021
 */
public interface RentService {
    UUID rent(UUID id, CreateRentDto reserveDto);
    RentDto findRentById(UUID id);
    List<RentDto> findAll(Iterable<UUID> ids);
    void deleteRent(UUID id);
}
