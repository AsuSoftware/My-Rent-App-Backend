package com.asusoftware.myrent.repository;

import com.asusoftware.myrent.model.Boat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * my-rent Created by Antonio on 1/31/2021
 */
@Repository
public interface BoatRepository extends JpaRepository<Boat, UUID> {
}
