package com.myblog.myblog171.service.impl;

import com.myblog.myblog171.controller.Post;
import com.myblog.myblog171.payload.PostDto;
import com.myblog.myblog171.service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

    private PostRepository postRepository;

    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        Post post = new Post();
        post.setTitle(postDto.getTitle());
        post.setDecription(postDto.getDecription());
        post.setContent(postDto.getContent());
        Post savePost = postRepository.save(post);

        PostDto dto = new PostDto();
        dto.setTitle(savePost.getTitle());
        dto.setDecription(savePost.getDecription());
        dto.setContent(savePost.getContent());
        return dto;
    }
}
