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
@Table(name = "images")
public class Image {

    // TODO: save images locally, not on db

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "value")
    private String value;
}
