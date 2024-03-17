package com.springboot.springbootrestwebsericesbasics.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<User>();
    private  static int usersCount = 3;

    static {
        users.add(new User(1, "Aditya", LocalDate.now().minusYears(29)));
        users.add(new User(2, "Raj",  LocalDate.now().minusYears(28)));
        users.add(new User(3, "Shekhar",  LocalDate.now().minusYears(27)));
    }

    public List<User> findAll(){
        return users;
    }


    public User findById(int id) {
        Predicate<? super User> predicate = user -> user.getId() == id;
        return users.stream().filter(predicate).findFirst().get();
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }
}
