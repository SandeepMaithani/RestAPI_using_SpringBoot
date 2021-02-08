package com.restLearn.restLearn.services;

import java.util.List;
import java.util.Optional;

import com.restLearn.restLearn.document.Course;

public interface CourseService {

    public List<Course> getCourses();

    public Optional<Course> getCourse(long courseId);

    public long addCourse(Course course);

    public Course updateCourse(Course course);

    public Course removeCourse(long courseId);
    
}
