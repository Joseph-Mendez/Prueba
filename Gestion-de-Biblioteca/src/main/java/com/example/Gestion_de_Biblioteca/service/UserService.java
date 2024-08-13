package com.example.Gestion_de_Biblioteca.service;

import com.example.Gestion_de_Biblioteca.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User saveUser(User user);

    Optional<User> findUserById(String id);

    Optional<User> findUserByEmail(String email);

    List<User> findAllUsers();

    User updateUser(User user);

    void deleteUser(String id);
}