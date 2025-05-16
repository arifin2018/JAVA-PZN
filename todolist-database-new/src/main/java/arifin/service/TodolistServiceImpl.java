package arifin.service;

import arifin.entity.Todolist;
import arifin.repository.TodolistRepository;

public class TodolistServiceImpl implements TodolistService{

    private TodolistRepository todolistRepository;
    

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }

    @Override
    public void addTodoList(String todo) {
        todolistRepository.add(new Todolist(todo));
    }

    @Override
    public boolean removeTodoList(Integer number) {
        return todolistRepository.remove(number);
    }

    @Override
    public void showTodoList() {
        // Todolist[] model = todolistRepository.getAll();
        // for (int i = 0; i < model.length; i++) {
        //     var todo = model[i];
        //     var no = i+1;

        //     if (todo != null) {
        //         System.out.println(no + ". " + todo.getTodo());
        //     }
        // }
    }

}
