package arifin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class BatchTest {
    @Test
    void testAddBatch() throws SQLException {
        Connection connection = ConnectionUtil.getDataSource().getConnection();

        
        ArrayList<HashMap<String, String>> comments = new ArrayList<>(List.of(
            new HashMap<>(Map.of("email","arifingdr@gmail.com","comment","12333")),
            new HashMap<>(Map.of("email","azriel@gmail.com","comment","11111")),
            new HashMap<>(Map.of("email","MJ@gmail.com","comment","sssss"))
        ));

        String sql = "INSERT INTO comments(EMAIL,COMMENT) VALUES (?,?)";
        PreparedStatement commentsStmt = connection.prepareStatement(sql);

        var checkQuery = new ArrayList<String>(); 

        for (HashMap<String,String> comment : comments) {
            commentsStmt.setString(1, comment.get("email"));
            commentsStmt.setString(2, comment.get("comment"));
            checkQuery.add(
                "Executing: SELECT * FROM comments WHERE email = "+comment.get("email")+" AND comment = "+comment.get("comment")
            );
            commentsStmt.addBatch();
        }

        commentsStmt.executeBatch();
        commentsStmt.close();
        commentsStmt.close();
    }



}
