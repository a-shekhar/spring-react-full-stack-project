package com.aditya.springboot.learnspringbootjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CoursejdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
       // repository.insert();
        repository.insert_course(new Course(1, "Learn AWS2", "Aditya"));
        repository.insert_course(new Course(2, "Learn Azure", "ff"));
        repository.insert_course(new Course(3, "Learn GCP", "ff"));

        repository.delete_course(1);

        System.out.println(repository.findById(3));
    }
}
