package com.aditya.springbootweb.springbootwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private  static int todosCount = 3;

    static {
        todos.add(new Todo(1, "Aditya", "Learn Spring Boot", LocalDate.of(2024, 8, 1), false));
        todos.add(new Todo(1, "Raj", "Learn Spring Boot", LocalDate.of(2024, 8, 1), false));
        todos.add(new Todo(3, "Shekhar", "Learn GCP", LocalDate.of(2025, 1, 3), false));
    }

    public List<Todo> findByUserName(String userName) {
        return todos;
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone){
        Todo todo = new Todo(++todosCount, username, description, targetDate, isDone);
        todos.add(todo);
    }
}
