package com.example.task;

import java.util.List;

import javax.validation.Valid;

public interface CommentService {

    /**
     * Creates a new comment for a given post
     * @param postId the ID of the post to add the comment to
     * @param comment the comment to add
     * @return the newly created comment
     * @throws ResourceNotFoundException if the post with the given ID does not exist
     */
    Comment createComment(Long postId, Comment comment);

    /**
     * Returns all comments for a given post
     * @param postId the ID of the post to retrieve the comments for
     * @return a list of comments for the given post
     * @throws ResourceNotFoundException if the post with the given ID does not exist
     */
    List<Comment> getCommentsByPostId(Long postId);

	
}

