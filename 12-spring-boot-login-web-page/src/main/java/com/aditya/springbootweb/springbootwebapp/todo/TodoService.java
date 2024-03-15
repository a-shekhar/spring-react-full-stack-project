package com.aditya.springbootweb.springbootwebapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos;
    static {
        todos = Arrays.asList(
                new Todo(1, "Aditya", "Learn Spring Boot", LocalDate.of(2024, 8, 1), false),
                new Todo(2, "Raj", "Learn AWS", LocalDate.of(2024, 12, 2), false),
                new Todo(3, "Shekhar", "Learn GCP", LocalDate.of(2025, 1, 3), false)
        );
    }

    public List<Todo> findByUserName(String userName) {
        return todos;
    }
}
