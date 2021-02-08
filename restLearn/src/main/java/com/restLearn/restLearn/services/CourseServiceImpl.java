package com.restLearn.restLearn.services;

import java.util.List;
import java.util.Optional;

import com.restLearn.restLearn.document.Course;
import com.restLearn.restLearn.repository.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // List<Course> courseList;

    public CourseServiceImpl() {
        // courseList = new ArrayList<>();

        // courseList.add(new Course(142, "Data Structure", "This course contain basics
        // of Data Structure"));
        // courseList.add(new Course(143, "Algorithms", "This course contain basics of
        // Algorithms"));
        // courseList.add(new Course(144, "DSA", "This is Advance course on Data
        // Structure and Algorithms"));
    }

    @Override
    public List<Course> getCourses() {

        return courseRepository.findAll();

        // return courseList;
    }

    @Override
    public Optional<Course> getCourse(long courseId) {

        return courseRepository.findById(courseId);
        
        // Course requiredCourse = null;

        // for(Course course : courseList) {

        //     if(course.getId() == courseId) {
        //         requiredCourse = course;
        //         break;
        //     }
        // }

        // return requiredCourse;
    }

    @Override
    public long addCourse(Course course) {

        courseRepository.save(course);
        return course.getId();
        
        // courseList.add(course);
        // return course.getId();
    }

    @Override
    public Course updateCourse(Course course) {

        courseRepository.save(course);

        return course;

        // boolean courseExist = false;

        // for(int courseIndex = 0; courseIndex < courseList.size(); courseIndex++) {
        //     Course oldCourse = courseList.get(courseIndex);
        //     if( oldCourse.getId() == course.getId()) {
        //         courseList.set(courseIndex, course);
        //         courseExist = true;
        //         break; 
        //     }
        // }

        // if(courseExist == false) {
        //     courseList.add(course);
        // }

        //return course;
    }

    @Override
    public Course removeCourse(long courseId) {

        Optional<Course> removedCourse = courseRepository.findById(courseId);

        courseRepository.deleteById(courseId);

        return removedCourse.get();


        // Course removedCourse = null;

        // for(int courseIndex = 0; courseIndex < courseList.size(); courseIndex++) {
        //     Course course = courseList.get(courseIndex);
        //     if( course.getId() == courseId) {
        //         removedCourse = course;
        //         courseList.remove(courseIndex);
        //         break; 
        //     }
        // }

        //return removedCourse;     
    }
    
}
