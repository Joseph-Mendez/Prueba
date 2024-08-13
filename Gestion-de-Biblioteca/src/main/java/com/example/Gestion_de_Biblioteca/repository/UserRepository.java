package com.example.Gestion_de_Biblioteca.repository;

import com.example.Gestion_de_Biblioteca.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}