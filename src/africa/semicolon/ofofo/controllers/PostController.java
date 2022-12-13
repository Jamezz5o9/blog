package africa.semicolon.ofofo.controllers;

import africa.semicolon.ofofo.dtos.requests.CreatePostRequest;
import africa.semicolon.ofofo.services.PostService;
import africa.semicolon.ofofo.services.PostServiceImpl;
import africa.semicolon.ofofo.data.models.Post;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {
    private final PostService postService = new PostServiceImpl();
    @PostMapping("/post")
    public String createPost(@RequestBody CreatePostRequest createPostRequest){
        postService.createPost(createPostRequest);
        return "Successful";
    }
    @GetMapping("/post/{postId}")
    public Post viewPost(@PathVariable int postId){
        return postService.viewPost(postId);
    }
}
