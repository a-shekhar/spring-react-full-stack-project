package com.aditya.springbootweb.springbootwebapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private  static int todosCount = 3;

    static {
        todos.add(new Todo(1, "Aditya", "Learn Spring Boot 1", LocalDate.of(2024, 8, 1), false));
        todos.add(new Todo(2, "Raj", "Learn AWS 1", LocalDate.of(2024, 8, 1), false));
        todos.add(new Todo(3, "Shekhar", "Learn GCP 1", LocalDate.of(2025, 1, 3), false));
    }

    public List<Todo> findByUserName(String userName) {
        System.out.println("name" + userName);
        Predicate<? super Todo> predicate = todo -> todo.getUsername().equalsIgnoreCase(userName);
        return todos.stream().filter(predicate).toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone){
        Todo todo = new Todo(++todosCount, username, description, targetDate, isDone);
        todos.add(todo);
    }

    public void deleteById(int id) {
        // if condition matches
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }

    public Todo findById(int id) {
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }
    public void updateTodo(@Valid Todo todo) {
        deleteById(todo.getId());
        todos.add(todo);
    }
}
