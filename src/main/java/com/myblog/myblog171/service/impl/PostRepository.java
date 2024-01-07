package com.myblog.myblog171.service.impl;

import com.myblog.myblog171.controller.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
