package com.asusoftware.Myrent.exception;

/**
 * My-rent Created by Antonio on 2/6/2021
 */
public class RentNotFoundException extends RentException{
    public RentNotFoundException() {
        super("Rent not found!");
    }
}
