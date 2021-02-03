package com.asusoftware.Myrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Entity
@Setter
@Getter
@Table(name = "images")
public class Image {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "value")
    private String value;

    @ManyToOne
    @JoinColumn(name="post_id", nullable=false)
    private Post post;
}
