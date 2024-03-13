package com.aditya.springboot.learnspringbootjpaandhibernate.course.jpa;

import com.aditya.springboot.learnspringbootjpaandhibernate.course.jdbc.Course;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {

    @PersistenceContext
    EntityManager entityManager;

    public void insert_course(Course course){
       entityManager.merge(course);
    }

    public void delete_course(long id) {
        Course course = entityManager.find(Course.class, id);
        entityManager.remove(course);
    }

    public Course findById(long id){
      return entityManager.find(Course.class, id);
    }
}
