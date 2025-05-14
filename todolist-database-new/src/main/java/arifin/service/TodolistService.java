package service;

public interface TodolistService {
    void showTodoList();
    void addTodoList(String todo);
    boolean removeTodoList(Integer number);
}
