package com.asusoftware.Myrent.controller;

import com.asusoftware.Myrent.model.dto.rent.CreateRentDto;
import com.asusoftware.Myrent.service.rent.RentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/6/2021
 */
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/rents")
public class RentController {

    private final RentService rentService;

    @PostMapping(path = "/{id}")
    public UUID reserve(@PathVariable(name = "id") UUID id, @Valid @RequestBody CreateRentDto reserveDto) {
        return rentService.rent(id, reserveDto);
    }

    @DeleteMapping(path = "/{id}")
    public void deleteReservation(@PathVariable(name = "id") UUID id) {
        rentService.deleteRent(id);
    }
}
