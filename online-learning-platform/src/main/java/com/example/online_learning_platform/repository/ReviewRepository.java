package com.example.online_learning_platform.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.online_learning_platform.entitie.Review;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {
    List<Review> findByCourseId(String courseId);
    List<Review> findByUserId(String userId);
}
