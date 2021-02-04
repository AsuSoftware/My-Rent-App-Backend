package com.asusoftware.Myrent.repository;

import com.asusoftware.Myrent.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/4/2021
 */
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, UUID> {
}
