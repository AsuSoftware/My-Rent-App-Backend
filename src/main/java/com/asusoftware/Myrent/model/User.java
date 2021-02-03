package com.asusoftware.Myrent.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @NotBlank
    @Column(name = "last_name")
    private String lastName;

    @JsonFormat(pattern="yyyy-MM-dd")
    @Column(name = "birthday")
    private Date birthday;

    @Email
    @NotBlank
    @Column(name = "email")
    private String email;

    @NotBlank
    @Column(name = "phone")
    private String phone;

    @NotBlank
    @Column(name = "password")
    private String password;

    @NotNull
    @Column(name = "address")
    private Address address;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;
}
