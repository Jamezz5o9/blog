package africa.semicolon.ofofo.services;

import africa.semicolon.ofofo.data.models.Post;
import africa.semicolon.ofofo.data.repositories.PostRepository;
import africa.semicolon.ofofo.data.repositories.PostRepositoryImp;
import africa.semicolon.ofofo.dtos.requests.CreatePostRequest;

import java.util.List;

public class PostServiceImpl implements  PostService{

   PostRepository postRepository = new PostRepositoryImp();
    @Override
    public void createPost(CreatePostRequest createPostRequest) {
       Post post = new Post();
       post.setTitle(createPostRequest.getTitle());
       post.setBody(createPostRequest.getBody());
       postRepository.save(post);
    }

    @Override
    public void updatePost(CreatePostRequest createPostRequest) {
        Post post = new Post();
        if(post.getId() != 0) {
            Post savedPost = postRepository.findById(post.getId());
            savedPost.setBody(post.getBody());
            savedPost.setTitle(post.getTitle());
        }

    }

    @Override
    public void deletePost(int id) {
        postRepository.delete(id);
    }

    @Override
    public Post viewPost(int id) {
        return postRepository.findById(id);
    }

    @Override
    public List<Post> viewAllPost() {
        return postRepository.findAll();
    }
}
