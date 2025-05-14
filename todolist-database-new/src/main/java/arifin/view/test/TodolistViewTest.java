package view.test;

import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

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
