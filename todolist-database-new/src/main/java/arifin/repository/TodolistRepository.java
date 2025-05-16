package arifin.repository;

import java.util.ArrayList;

import arifin.entity.Todolist;

public interface TodolistRepository {
    ArrayList<Todolist> getAll();
    void add(Todolist todolist);
    boolean remove(Integer number);
    Todolist getById(Integer number);
}
