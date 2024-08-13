package com.example.Gestion_de_Biblioteca.service.impl;

import com.example.Gestion_de_Biblioteca.model.Loan;
import com.example.Gestion_de_Biblioteca.repository.LoanRepository;
import com.example.Gestion_de_Biblioteca.service.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostgresLoanService implements LoanService {

    private final LoanRepository loanRepository;

    @Autowired
    public PostgresLoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    @Override
    public Loan saveLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public Optional<Loan> findLoanById(Long id) {
        return loanRepository.findById(id);
    }

    @Override
    public List<Loan> findLoansByUserId(String userId) {
        return loanRepository.findByUserId(userId);
    }

    @Override
    public List<Loan> findLoansByBookId(Long bookId) {
        return loanRepository.findByBookId(bookId);
    }

    @Override
    public Loan updateLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    @Override
    public void deleteLoan(Long id) {
        loanRepository.deleteById(id);
    }
}
