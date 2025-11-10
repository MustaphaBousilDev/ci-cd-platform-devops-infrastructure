package com.example.online_learning_platform.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.online_learning_platform.entitie.Enrollment;

import java.util.List;

public interface EnrollmentRepository extends MongoRepository<Enrollment, String> {
    List<Enrollment> findByUserId(String userId);
    List<Enrollment> findByCourseId(String courseId);
    Enrollment findByUserIdAndCourseId(String userId, String courseId);
}
