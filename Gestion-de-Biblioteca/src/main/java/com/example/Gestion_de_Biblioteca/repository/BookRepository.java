package com.example.Gestion_de_Biblioteca.repository;

import com.example.Gestion_de_Biblioteca.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}