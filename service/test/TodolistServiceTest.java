package service.test;

import entity.Todolist;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;

public class TodolistServiceTest {
    public static void main(String[] args) {
        testRemoveTodoList();
    }

    public static void testShowTodoList(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();
        todolistRepository.data[0] = new Todolist("!211");


        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        todolistService.showTodoList();
    } 

    public static void testAddTodoList(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        todolistService.addTodoList("arifin");
        todolistService.addTodoList("arifin2");
        todolistService.showTodoList();
    } 

    public static void testRemoveTodoList(){
        TodolistRepositoryImpl todolistRepository = new TodolistRepositoryImpl();

        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        todolistService.addTodoList("arifin");
        todolistService.addTodoList("arifin2");
        todolistService.showTodoList();
        System.out.println();
        System.out.println();
        todolistService.removeTodoList(1);
        todolistService.showTodoList();
    } 
}
