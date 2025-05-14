package arifin.repository;

import java.util.Arrays;

import arifin.entity.Todolist;

public class TodolistRepositoryImpl implements TodolistRepository{

    public Todolist[] data = new Todolist[10];

    @Override
    public void add(Todolist todolist) {
        Boolean isFull = false;
        
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = todolist;
                break;
            }
            if (i == data.length-1 && data[i] != null) {
                isFull = true;
            }
        }
        if (isFull) {
            Todolist[] copy = Arrays.copyOf(data, data.length*2);
            data = copy;
            add(todolist);
            return;
        }
    }

    @Override
    public Todolist[] getAll() {
        return this.data;
    }

    @Override
    public boolean remove(Integer number) {
        if (number > data.length) {
            return false;
        }else if (data[number - 1] == null) {
            return false;
        }else{
            for (int i = number-1; i < data.length; i++) {
                if (i == (data.length - 1)) {
                    data[i] = null;
                }else{
                    data[i] = data[i+1];
                }
            }
            return true;
        }
    }

}
