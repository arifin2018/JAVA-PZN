package arifin;

import arifin.repository.TodolistRepository;
import arifin.repository.TodolistRepositoryImpl;
import arifin.service.TodolistService;
import arifin.service.TodolistServiceImpl;
import arifin.view.TodolistView;

public class AplikasiTodolistV2 {
    public static void main(String[] args) {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);

        todolistView.showTodoList();
    }
}
