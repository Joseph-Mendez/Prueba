package com.example.Gestion_de_Biblioteca.service;

import com.example.Gestion_de_Biblioteca.model.Loan;

import java.util.List;
import java.util.Optional;

public interface LoanService {

    Loan saveLoan(Loan loan);

    Optional<Loan> findLoanById(Long id);

    List<Loan> findLoansByUserId(String userId);

    List<Loan> findLoansByBookId(Long bookId);

    Loan updateLoan(Loan loan);

    void deleteLoan(Long id);
}