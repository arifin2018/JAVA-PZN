package view;

import service.TodolistService;

public class TodolistView {

    private TodolistService todoListService;

    public TodolistView(TodolistService todoListService) {
        this.todoListService = todoListService;
    }

    public void showTodoList() {
        System.out.println("VIEW SHOW TODO LIST: ");
        while (true) {
            todoListService.showTodoList();
            System.out.println();

            System.out.println("MENU....");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            var input = utill.inputData.inputDataScanner("Pilih");
            // var input = inputData("Pilih");

            if (input.equals("1")) {
                // viewAddTodoList();
                addTodoList();
                // todoListService.addTodoList(input);
            }else if (input.equals("2")) {
                // viewRemoveTodoList();
                removeTodoList();
                // todoListService.removeTodoList(Integer.parseInt(input));
            }else if (input.equals("x")) {
                System.out.println("Terima kasih");
                break;
            }else{
                System.out.println("Input tidak dimengerti");
            }
        }
    }
    public void addTodoList() {
        System.out.println("MENAMBAH TODO LIST");
        String todo = utill.inputData.inputDataScanner("Nama Todo (x jika ingin berhenti)");
        if (todo.equals("x")) {
            return;
        }else{
            this.todoListService.addTodoList(todo);
        }
    }

    public void removeTodoList() {
        System.out.println("MENGHAPUS TODO LIST");
        String todo = utill.inputData.inputDataScanner("Nomer Todo List (x jika ingin berhenti)");

        if (todo.equals("x")) {
            return;
        }else{
            Integer numberRemoveTodo = Integer.valueOf(todo);
            var resultRemoveTodoList = this.todoListService.removeTodoList(numberRemoveTodo);
            if (!resultRemoveTodoList) {
                System.out.println("Mohon maaf number yang anda masukan gagal atau tidak sesuai");
            }else{
                return;
            }
        }
    }
}
