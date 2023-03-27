package webapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import domain.Comment;
import domain.Post;
import domain.PostRepository;
import domain.ResourceNotFoundException;

public class PostServiceImpl implements PostService {

	@Autowired
	private PostRepository postRepository;
	
	@Override
	public List<Comment> getCommentsByPostId(Long postId) {
	    Post post = postRepository.findById(postId)
	            .orElseThrow(() -> new ResourceNotFoundException("Post", "id", postId));

	    return post.getComments();
	}

	@Override
	public Post getPostById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getAllPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post createPost(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Post updatePost(Long id, Post post) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
