package com.example.online_learning_platform.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.online_learning_platform.entitie.User;
public interface UserRepository extends MongoRepository<User, String> {
    User findByUsername(String username);
    User findByEmail(String email);
}
