package arifin.repository;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.zaxxer.hikari.HikariDataSource;

import arifin.entity.Todolist;
import arifin.utill.databaseUtill;

class TodolistRepositoryTest {
    private HikariDataSource dataSource;

    private TodolistRepository todolistRepository;


    @BeforeEach
    void setUp() {
        dataSource = databaseUtill.getDataSource();
        todolistRepository = new TodolistRepositoryImpl(dataSource);
    }

    @Test
    void testAdd(){
        Todolist todolist = new Todolist();
        todolist.setTodo("arifinn");

        todolistRepository.add(todolist);
    }

    @Test
    void testGetById(){
        var todolist = todolistRepository.getById(4);
        Assertions.assertEquals("arifinn", todolist.getTodo());
        Assertions.assertEquals(4, todolist.getId());
    }

    // @Test
    // void testCheckUserExist(){
    //     var todolist = todolistRepository.checkUserExist(1);
    //     System.out.println(todolist);
    //     // Assertions.assertEquals("arifinn", todolist.getTodo());
    //     // Assertions.assertEquals(1, todolist.getId());
    // }

    @Test
    void testRemove(){
        var todolist = todolistRepository.remove(4);
        Assertions.assertTrue(todolist);
    }

    @Test
    void testGetAll(){
        var todolist = todolistRepository.getAll();
        Assertions.assertEquals(6, todolist.size());
    }

    @AfterEach
    void tearDown() {
        dataSource.close();
    }
}
