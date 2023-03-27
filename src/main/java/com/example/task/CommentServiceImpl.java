package com.example.task;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private final PostRepository postRepository;
    private final CommentRepository commentRepository;

    @Autowired
    public CommentServiceImpl(PostRepository postRepository, CommentRepository commentRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
    }

    

	@Override
	public List<Comment> getCommentsByPostId(Long postId) {
		postRepository.findById(postId)
        .orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));
		return commentRepository.findByPostId(postId);
	}



	@Override
	public Comment createComment(Long postId, Comment comment) {
		 Post post = postRepository.findById(postId)
	                .orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));
	        comment.setPost(post);
	        return commentRepository.save(comment);
	}

   
}

