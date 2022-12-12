package data.repositories;

import data.models.Comment;

import java.util.List;

public interface CommentRepository {
    Comment save(Comment comment);
    Comment findById(int id);
    void delete(int id);
    void delete(Comment comment);
    List<Comment> findAll();
    long count();
}
