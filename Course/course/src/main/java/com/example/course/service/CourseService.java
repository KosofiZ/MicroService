package com.example.course.service;


import com.example.course.model.Course;
import com.example.course.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private final CourseRepo courseRepo;

    @Autowired
    public CourseService(CourseRepo courseRepo){
        this.courseRepo =courseRepo;
    }

    public List<Course> getCourses(){
        return courseRepo.findAll();
    }
}
