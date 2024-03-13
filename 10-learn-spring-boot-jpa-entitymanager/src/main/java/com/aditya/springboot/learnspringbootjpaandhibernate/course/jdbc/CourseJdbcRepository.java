package com.aditya.springboot.learnspringbootjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {

    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String insert_query =
                    """
                    insert into course(id,name,author)
                    values(1,'Learn AWS', 'Aditya')
                    """;

    private static String insert_course_query =  """
                    insert into course(id,name,author)
                    values(?,?, ?)
                    """;

    private static String delete_query = "delete from course where id = ?";

    private static String select_query = "select * from course where id = ?";

    public void insert(){
        springJdbcTemplate.update(insert_query);
    }

    public void insert_course(Course course){
        springJdbcTemplate.update(insert_course_query, course.getId(), course.getName(), course.getAuthor());
    }

    public void delete_course(long id) {
        springJdbcTemplate.update(delete_query, id);
    }

    public Course findById(long id){
        return springJdbcTemplate.queryForObject(select_query, new BeanPropertyRowMapper<>(Course.class), id);
        // resultset -> bean => row mapper

    }
}
