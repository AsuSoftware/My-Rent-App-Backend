package com.asusoftware.myrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

/**
 * my-rent Created by Antonio on 1/7/2021
 */

@Entity
@Getter
@Setter
@Table(name = "boats")
public class Boat {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "brand")
    private String brand;

    @NotBlank
    @Column(name = "model")
    private String model;

    @NotBlank
    @Column(name = "engine")
    private String engine;

    @NotBlank
    @Column(name = "hp")
    private String hp;

    @NotBlank
    @Column(name = "year")
    private String year;

    @NotBlank
    @Column(name = "people_capacity")
    private String numberOfPeopleCapacity;

    @NotBlank
    @Column(name = "length")
    private String length;

    @NotBlank
    @Column(name = "number_of_cabins")
    private String cabins;

    @NotBlank
    @Column(name = "fuel_tank")
    private String fuelTank;

    @NotBlank
    @Column(name = "number_of_toilets")
    private String numberOfToilets;

    @NotBlank
    @Column(name = "color")
    private String color;

}
