package com.aditya.springboot.learnspringbootjpaandhibernate.course;

import com.aditya.springboot.learnspringbootjpaandhibernate.course.jdbc.Course;
import com.aditya.springboot.learnspringbootjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.aditya.springboot.learnspringbootjpaandhibernate.course.jpa.CourseJpaRepository;
import com.aditya.springboot.learnspringbootjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

   // @Autowired
   // private CourseJpaRepository repository;

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
       // repository.insert();
        repository.save(new Course(1, "Learn AWS2", "Aditya"));
        repository.save(new Course(2, "Learn Azure", "ff"));
        repository.save(new Course(3, "Learn GCP", "ff"));

        repository.deleteById(1l);

       System.out.println(repository.findById(3l));

        System.out.println(repository.findAll());
        System.out.println(repository.count());

        System.out.println(repository.findByAuthor("ff"));
    }
}
