package com.springboot.springbootrestwebsericesbasics.post;

import com.springboot.springbootrestwebsericesbasics.user.User;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;

@Entity
public class Post {
    @Id
    @GeneratedValue
    private Integer id;

    @Size(min = 10, message = "Post should be at least 10 characters long")
    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    public Post() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "post{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }
}
