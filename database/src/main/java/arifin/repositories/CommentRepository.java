package arifin.repositories;

import java.util.List;

import arifin.entity.Comments;

public interface CommentRepository {
    void insert(Comments comments);
    Comments findById(Integer id);
    List<Comments> findAll();
    List<Comments> findAllByEmail(String email);
}
