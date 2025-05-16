package arifin.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.sql.DataSource;

import arifin.entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository{

    public Todolist[] data = new Todolist[10];

    private DataSource dataSource;

    public TodolistRepositoryImpl(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void add(Todolist todolist) {
        String sql = "INSERT INTO todolist(todo) VALUES (?)";

        try(Connection connection = dataSource.getConnection()) {
            try(PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1,todolist.getTodo());
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<Todolist> getAll() {
        String sql = "select id, todo from Todolist";
        ArrayList<Todolist> todolist = new ArrayList<>();

        try(Connection connection =  dataSource.getConnection()) {
            try(PreparedStatement statment = connection.prepareStatement(sql)){
                ResultSet resultSet = statment.executeQuery();
                while (resultSet.next()) {
                    Todolist todo = new Todolist(
                        resultSet.getInt("id"),
                        resultSet.getString("todo")
                    );
                    todolist.add(todo);
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return todolist;
    }

    @Override
    public Todolist getById(Integer number){
        String sql = "select id,todo from Todolist where id = ?";
        Todolist todolist = null;

        try(Connection connection = dataSource.getConnection()) {
            try(PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1,number);
                ResultSet resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    todolist = new Todolist(
                        resultSet.getInt("id"),
                        resultSet.getString("todo")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return todolist;
    }

    private boolean checkUserExist(Integer number){
        return this.getById(number) != null;
    }

    @Override
    public boolean remove(Integer number) {
        String sql = "DELETE FROM todolist WHERE id=?";
        try(Connection connection = dataSource.getConnection()) {
            try(PreparedStatement statement = connection.prepareStatement(sql)) {
                if (this.checkUserExist(number)) {
                    statement.setInt(1, number);
                    statement.executeUpdate();
                    return true;
                }else{
                    return false;
                }
                
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
