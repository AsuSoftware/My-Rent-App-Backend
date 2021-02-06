package com.asusoftware.Myrent.repository;

import com.asusoftware.Myrent.model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/6/2021
 */
@Repository
public interface RentRepository extends JpaRepository<Rent, UUID> {
}
