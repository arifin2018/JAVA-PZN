package arifin.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import arifin.entity.Todolist;

class TodolistMockRepositoryTest {

    private DataSource mockDataSource;
    private Connection mockConnection;
    private PreparedStatement mockStatement;
    private ResultSet mockResultSet;


    @BeforeEach
    void setup(){
        mockDataSource = mock(DataSource.class);
        mockConnection = mock(Connection.class);
        mockStatement = mock(PreparedStatement.class);
        mockResultSet = mock(ResultSet.class);
    }
    

    @Test
    void testGetAllWithRealRepositoryButMockedDatabase() throws Exception {
        // Set behavior
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement("select id, todo from Todolist")).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);

        // Simulasi isi resultSet
        when(mockResultSet.next()).thenReturn(true, true, false); // 2 baris data
        when(mockResultSet.getInt("id")).thenReturn(1, 2);
        when(mockResultSet.getString("todo")).thenReturn("Learn Java", "Write Unit Test");

        // Pakai real class tapi dependency-nya dimock
        TodolistRepository repository = new TodolistRepositoryImpl(mockDataSource);

        // Act
        ArrayList<Todolist> result = repository.getAll();

        // Assert
        assertEquals(2, result.size());
        assertEquals("Learn Java", result.get(0).getTodo());
        assertEquals(1, result.get(0).getId());
        assertEquals("Write Unit Test", result.get(1).getTodo());
        assertEquals(2, result.get(1).getId());
    }

    @Test
    void testAddWithMockedDatabase() throws Exception {
        // Arrange
        // Setup mock behavior
        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement("INSERT INTO todolist(todo) VALUES (?)")).thenReturn(mockStatement);

        // Instance yang ingin diuji
        TodolistRepository repository = new TodolistRepositoryImpl(mockDataSource);

        // Buat objek todolist
        Todolist todo = new Todolist();
        todo.setTodo("Belajar Unit Test");

        // Act
        repository.add(todo);

        // Assert
        // Pastikan statement.setString dan executeUpdate dipanggil dengan benar
        verify(mockStatement).setString(1, "Belajar Unit Test");
        verify(mockStatement).executeUpdate();
    }

    @Test
    void testGetByIDWithMockedDatabase()throws Exception{
        String sql = "select id,todo from Todolist where id = ?";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(sql)).thenReturn(mockStatement);
        when(mockStatement.executeQuery()).thenReturn(mockResultSet);
        when(mockResultSet.next()).thenReturn(true,false);
        when(mockResultSet.getInt("id")).thenReturn(1);
        when(mockResultSet.getString("todo")).thenReturn("arifin");


        TodolistRepository todolistRepository = new TodolistRepositoryImpl(mockDataSource);
        Todolist todoGetByIDRepository = todolistRepository.getById(1);
        System.out.println(todoGetByIDRepository.toString());

        Assertions.assertEquals(1, todoGetByIDRepository.getId());

        verify(mockStatement).setInt(1, 1);
    }

    @Test
    void testremoveWithMockedDatabase()throws Exception{
        String sql = "DELETE FROM todolist WHERE id=?";

        when(mockDataSource.getConnection()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(sql)).thenReturn(mockStatement);

        TodolistRepository repository = new TodolistRepositoryImpl(mockDataSource){
            @Override
            public Todolist getById(Integer number){
                return new Todolist(number, "Test");
            }
        };

        boolean result = repository.remove(1);

        assertTrue(result);
        verify(mockStatement).setInt(1, 1);
        verify(mockStatement).executeUpdate();
    }
}
