package webapp;

import javax.validation.Valid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import domain.Comment;
import service.CommentServiceImpl;


@ComponentScan("com.sensors.demo")
@SpringBootApplication
public class TaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
		}
	
	@PostMapping("/{id}/comment")
	public ResponseEntity<Comment> createComment(@PathVariable(value = "id") Long postId,
	                                              @Valid @RequestBody Comment comment) {
		CommentServiceImpl commentService = new CommentServiceImpl();
	    Comment newComment = commentService.createComment(postId, comment);
	    return ResponseEntity.ok(newComment);
	}

}
