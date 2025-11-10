package com.example.online_learning_platform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.online_learning_platform.entitie.Course;

import java.util.List;

public interface CourseRepository extends MongoRepository<Course, String> {
    List<Course> findByTitleContainingIgnoreCase(String title);
    List<Course> findByInstructorId(String instructorId);
    List<Course> findByCategory(String category);
}