package com.example.online_learning_platform.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.online_learning_platform.entitie.UserProgress;

import java.util.List;

public interface UserProgressRepository extends MongoRepository<UserProgress, String> {
    List<UserProgress> findByUserId(String userId);
    List<UserProgress> findByCourseId(String courseId);
    UserProgress findByUserIdAndCourseIdAndLessonId(String userId, String courseId, String lessonId);
}