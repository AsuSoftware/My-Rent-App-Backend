package com.asusoftware.Myrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Embeddable;


/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Embeddable
@Getter
@Setter
public class Address {

    private String city;
    private String country;
    private String zip;
    private String street;
    private String streetNumber;
    private String details;
}
