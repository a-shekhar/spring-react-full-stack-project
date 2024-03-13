package com.aditya.learnspringbootbasics;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
          new Course(1L, "Learn AWS", "Aditya"),
          new Course(2L, "Learn Azure", "Raj"),
                new Course(3L, "Learn GCP_", "Shekhar")
        );
    }
}
