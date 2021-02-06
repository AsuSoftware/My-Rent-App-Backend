package com.asusoftware.Myrent.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/5/2021
 */
@Entity
@Getter
@Setter
@Table(name = "rents")
public class Rent {

    @Id
    @GeneratedValue
    private UUID id;

    @NotNull
    @Column(name = "start_date")
    private Date startDate;

    @NotNull
    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne(cascade = {
            CascadeType.REFRESH,
            CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.MERGE
    })
    @JoinColumn(name="user_id")
    public User user;

    @ManyToOne(cascade = {
            CascadeType.REFRESH,
            CascadeType.PERSIST,
            CascadeType.DETACH,
            CascadeType.MERGE
    })
    @JoinColumn(name="post_id")
    public Post post;
}
