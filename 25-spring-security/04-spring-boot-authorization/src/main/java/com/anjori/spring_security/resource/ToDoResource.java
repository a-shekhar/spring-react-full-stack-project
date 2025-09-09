package com.anjori.spring_security.resource;

import java.util.List;

import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.security.RolesAllowed;

@RestController
public class ToDoResource {

    private static final List<Todo> TODOS = List.of(
        new Todo(1, "aditya", "Learn AWS", false),
        new Todo(2, "aditya", "Learn DevOps", false),
        new Todo(3, "aditya", "Learn Full Stack Development", false)
    );

    @GetMapping("/todos")
    public List<Todo> retrieveAllTodos(){
        return TODOS;
    }

    @GetMapping("/users/{username}/todos")
    @PreAuthorize("hasRole('USER') and #username == authentication.name")
    @PostAuthorize("returnObject.?[username != #username].empty")
    @RolesAllowed({"USER", "ADMIN"})
    @Secured({"ROLE_USER", "ROLE_ADMIN"})
    public List<Todo> retrieveTodosForUser(@PathVariable String username){
        return TODOS.stream()
            .filter(todo -> todo.username().equals(username))
            .toList();
    }

    @PostMapping("/users/{username}/todos")
    public void createTodosForUser(@PathVariable String username, @RequestBody Todo todo){
        System.out.println("Create todo for user: " + username);
        System.out.println(todo);
    }
}

record Todo(int id, String username, String description, boolean done) {}

