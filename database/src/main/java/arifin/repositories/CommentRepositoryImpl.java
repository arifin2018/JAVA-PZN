package arifin.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import arifin.ConnectionUtil;
import arifin.entity.Comments;

public class CommentRepositoryImpl implements CommentRepository {
    @Override
    public List<Comments> findAll() {
        try (Connection connection = ConnectionUtil.getDataSource().getConnection()) {
        String sql = "SELECT * FROM comments";
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(sql)) {
            List<Comments> comments = new ArrayList<>();
            while (resultSet.next()) {
                comments.add(new Comments(
                    resultSet.getInt("id"),
                    resultSet.getString("email"),
                    resultSet.getString("comment")
                ));
            }
                return comments;
            }
        }
        } catch (SQLException exception) {
        throw new RuntimeException(exception);
        }
    }

    @Override
    public List<Comments> findAllByEmail(String email) {
        try (Connection connection = ConnectionUtil.getDataSource().getConnection()) {
        String sql = "SELECT * FROM comments WHERE email = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, email);
            try (ResultSet resultSet = statement.executeQuery()) {
                List<Comments> comments = new ArrayList<>();
                while (resultSet.next()) {
                comments.add(new Comments(
                    resultSet.getInt("id"),
                    resultSet.getString("email"),
                    resultSet.getString("comment")
                ));
                }
                return comments;
            }
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public Comments findById(Integer id) {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            String sql = "SELECT * FROM comments WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, id);
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                    return new Comments(
                        resultSet.getInt("id"),
                        resultSet.getString("email"),
                        resultSet.getString("comment")
                    );
                    } else {
                        return null;
                    }
                }
            }
        } catch (SQLException exception) {
            throw new RuntimeException(exception);
        }
    }

    @Override
    public void insert(Comments comments) throws RuntimeException {
        try {
            Connection connection = ConnectionUtil.getDataSource().getConnection();
            String sql = "Insert into comments(email,comment)values(?,?)";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, comments.getEmail());
            statement.setString(2, comments.getComment());
            statement.executeUpdate();
            // ResultSet resultSet = statement.getGeneratedKeys();
            // while (resultSet.next()) {
            //     comments.setId(resultSet.getInt(1));
            // }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
