package com.restLearn.restLearn.controller;

import java.util.List;
import java.util.Optional;

import com.restLearn.restLearn.document.Course;
import com.restLearn.restLearn.services.CourseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public String home() {
        return "Welcome To The Courses Home Page";
    }

    // Get all available courses

    @GetMapping("/courses")
    public List<Course> getCourses() {

        return this.courseService.getCourses();

    }

    // Get a particular course

    @GetMapping("/courses/{courseId}")
    public Optional<Course> getCourse(@PathVariable long courseId) {

        return this.courseService.getCourse(courseId);
    }
    
    // Add course

    @PostMapping("/courses")
    public long addCourse(@RequestBody Course course) {

        return this.courseService.addCourse(course);
    }

    //Update the course

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {

        return this.courseService.updateCourse(course);
    }

    // Delete the course

    @DeleteMapping("/courses/{courseId}")
    public Course removeCourse(@PathVariable long courseId) {
        return this.courseService.removeCourse(courseId);
    }

}
