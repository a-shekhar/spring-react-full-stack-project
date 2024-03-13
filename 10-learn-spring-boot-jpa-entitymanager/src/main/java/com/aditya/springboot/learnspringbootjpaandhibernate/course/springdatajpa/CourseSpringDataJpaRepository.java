package com.aditya.springboot.learnspringbootjpaandhibernate.course.springdatajpa;

import com.aditya.springboot.learnspringbootjpaandhibernate.course.jdbc.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    List<Course> findByAuthor(String author);
}
