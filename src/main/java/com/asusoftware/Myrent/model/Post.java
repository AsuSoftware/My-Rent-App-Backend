package com.asusoftware.Myrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
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
    @Column(name = "created_at")
    private LocalDateTime createdAt; // with this we can show the post from new to old, using filter

    @NotNull
    @ElementCollection
    @Column(name = "images")
    private List<String> images;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id", referencedColumnName = "id", nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false, referencedColumnName = "id")
    private User user;

    @OneToOne(mappedBy = "post", cascade = CascadeType.ALL)
    private Rent rent;
}

// Per default non ci sono cascade aplicate