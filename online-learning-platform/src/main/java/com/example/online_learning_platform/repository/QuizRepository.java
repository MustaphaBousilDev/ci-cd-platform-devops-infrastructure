package com.example.online_learning_platform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.online_learning_platform.entitie.Quiz;

import java.util.List;

public interface QuizRepository extends MongoRepository<Quiz, String> {
    List<Quiz> findByLessonId(String lessonId);
}