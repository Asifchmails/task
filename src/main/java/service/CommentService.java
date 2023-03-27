package service;

import java.util.List;

import javax.validation.Valid;

import domain.Comment;
import domain.ResourceNotFoundException;

public interface CommentService {

    Comment createComment(Long postId, Comment comment);

    List<Comment> getCommentsByPostId(Long postId);
}

