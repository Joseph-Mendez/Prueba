package com.example.Gestion_de_Biblioteca.service;

import com.example.Gestion_de_Biblioteca.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Book saveBook(Book book);

    Optional<Book> findBookById(Long id);

    List<Book> findAllBooks();

    Book updateBook(Book book);

    void deleteBook(Long id);
}