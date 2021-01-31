package com.asusoftware.myrent.model;

import com.sun.istack.NotNull;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.List;
import java.util.UUID;

/**
 * my-rent Created by Antonio on 1/7/2021
 */
@Entity
@Getter
@Setter
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue
    private UUID id;

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

    @OneToOne
    @JoinColumn(name = "post_type_id", nullable = true)
    PostType postType;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

}
