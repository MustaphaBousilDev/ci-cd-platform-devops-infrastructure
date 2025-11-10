package com.example.online_learning_platform.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.online_learning_platform.entitie.Lesson;

import java.util.List;

public interface LessonRepository extends MongoRepository<Lesson, String> {
    List<Lesson> findByCourseId(String courseId);
}
