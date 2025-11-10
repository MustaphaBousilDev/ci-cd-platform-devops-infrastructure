package com.example.online_learning_platform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.online_learning_platform.entitie.PaymentTransaction;

import java.util.List;

public interface PaymentTransactionRepository extends MongoRepository<PaymentTransaction, String> {
    List<PaymentTransaction> findByUserId(String userId);
    List<PaymentTransaction> findByCourseId(String courseId);
}
