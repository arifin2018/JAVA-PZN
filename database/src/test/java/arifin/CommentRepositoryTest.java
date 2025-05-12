package arifin;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import arifin.entity.Comments;
import arifin.repositories.CommentRepository;
import arifin.repositories.CommentRepositoryImpl;

class CommentRepositoryTest {
    private static CommentRepository commentRepository;

    @BeforeAll
    static void init() {
        commentRepository = new CommentRepositoryImpl();    
    }

    @Test
    void testInsert() {
        Comments comment = new Comments("eko@test.com", "hi");
        commentRepository.insert(comment);
        Assertions.assertEquals("eko@test.com", comment.getEmail());
        Assertions.assertEquals("hi", comment.getComment());
    }
    
    @Test
    void findById(){
        Comments comment = commentRepository.findById(1);
        Assertions.assertEquals(1,comment.getId());
        Assertions.assertEquals("arifingdr@gmail.com",comment.getEmail());
        Assertions.assertEquals("12333",comment.getComment());
    }

    @Test
    void findAll(){
        List<Comments> comments = commentRepository.findAll();
        Assertions.assertTrue(comments.size() > 0);
    }

    @Test
    void testFindByEmail() {
        List<Comments> comments = commentRepository.findAllByEmail("arifingdr@gmail.com");
        Assertions.assertTrue(comments.size() > 0);
    }
}
