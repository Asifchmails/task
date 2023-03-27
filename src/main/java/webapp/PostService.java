package webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import domain.Comment;
import domain.Post;

import java.util.List;
import java.util.Optional;

public interface PostService {

    Post getPostById(Long id);

    List<Post> getAllPosts();

    Post createPost(Post post);

    void deletePost(Long id);

    Post updatePost(Long id, Post post);

	List<Comment> getCommentsByPostId(Long postId);

//    List<Comment> getCommentsByPostId(Long postId);
}


