package com.example.Gestion_de_Biblioteca.repository;

import com.example.Gestion_de_Biblioteca.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Long> {
    List<Loan> findByUserId(String userId);
    List<Loan> findByBookId(Long bookId);
}
