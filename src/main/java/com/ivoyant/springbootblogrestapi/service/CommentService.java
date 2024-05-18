package com.ivoyant.springbootblogrestapi.service;

import com.ivoyant.springbootblogrestapi.payload.CommentDto;
import com.ivoyant.springbootblogrestapi.payload.PostDto;

import java.util.List;

public interface CommentService {
    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPostId(long postId);

    CommentDto getCommentById(Long postId, Long commentId);

    CommentDto updateComment(Long postId, long commentId, CommentDto commentRequest);

    void deleteComment(Long postId, Long commentId);
}
