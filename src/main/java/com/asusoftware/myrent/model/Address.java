package com.asusoftware.myrent.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * my-rent Created by Antonio on 1/7/2021
 */
@Component
@Getter
@Setter
@Scope(value = "prototype")
public class Address {

    private String city;
    private String country;
    private String zip;
    private String street;
    private String streetNumber;
    private String details;
}
