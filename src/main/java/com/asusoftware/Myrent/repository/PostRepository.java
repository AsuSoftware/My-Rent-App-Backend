package com.asusoftware.Myrent.repository;

import com.asusoftware.Myrent.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * My-rent Created by Antonio on 2/3/2021
 */
@Repository
public interface PostRepository extends JpaRepository<Post, UUID> {
}
