package com.asusoftware.Myrent.exception;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
public class UserNotFoundException extends RentException{
    public UserNotFoundException() {
        super("User not found");
    }
}
