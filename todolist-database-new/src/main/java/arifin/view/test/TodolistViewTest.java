package arifin.view.test;

import arifin.repository.TodolistRepository;
import arifin.repository.TodolistRepositoryImpl;
import arifin.service.TodolistService;
import arifin.service.TodolistServiceImpl;
import arifin.view.TodolistView;

public class TodolistViewTest {
    public static void main(String[] args) {
        testAddTodoList();
    }

    public static void testShowTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository); 
        TodolistView todolistView = new TodolistView(todolistService);
        todolistView.showTodoList();
    }

    public static void testAddTodoList(){
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository); 
        TodolistView todolistView = new TodolistView(todolistService);
        todolistView.addTodoList();
        todolistView.showTodoList();
    }
}
