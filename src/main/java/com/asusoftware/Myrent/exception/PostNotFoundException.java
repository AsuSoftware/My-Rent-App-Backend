package com.asusoftware.Myrent.exception;

/**
 * My-rent Created by Antonio on 2/4/2021
 */
public class PostNotFoundException extends RentException{
    public PostNotFoundException() {
        super("Post not found!");
    }
}
