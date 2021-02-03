package com.asusoftware.Myrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Getter
@Setter
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private UUID id;

    @Embedded
    @NotNull
    @Column(name = "address")
    private Address address;

    @NotBlank
    @Column(name = "price_per_day")
    private String pricePerDay;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "post_state")
    private PostState postState;

    @Enumerated(EnumType.STRING)
    @NotNull
    @Column(name = "category")
    private PostCategory postCategory;

    @NotNull
    @OneToMany(mappedBy = "post")
    private List<Image> images;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;
}
