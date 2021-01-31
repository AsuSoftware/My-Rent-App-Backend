package com.asusoftware.myrent.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * my-rent Created by Antonio on 1/31/2021
 */
@Component
@Scope(value = "singleton")
@Getter
@Setter
public class PostType {
    private Car car;
    private Boat boat;
}
