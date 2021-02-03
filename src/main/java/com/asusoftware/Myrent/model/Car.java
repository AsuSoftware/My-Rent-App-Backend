package com.asusoftware.Myrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Getter
@Setter
@Entity
@Table(name = "cars")
public class Car {

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
    @Column(name = "tires")
    private String tires;

    @NotBlank
    @Column(name = "color")
    private String color;

    @OneToOne(mappedBy = "car", fetch = FetchType.LAZY)
    private Post post;
}
