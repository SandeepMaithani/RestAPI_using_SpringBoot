package com.restLearn.restLearn.repository;

import com.restLearn.restLearn.document.Course;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Course, Long> {
    
}
