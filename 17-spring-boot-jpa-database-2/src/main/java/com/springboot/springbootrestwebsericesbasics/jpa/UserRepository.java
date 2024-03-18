package com.springboot.springbootrestwebsericesbasics.jpa;

import com.springboot.springbootrestwebsericesbasics.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
