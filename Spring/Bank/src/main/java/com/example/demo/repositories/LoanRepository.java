package com.example.demo.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Loan;

@Repository
public interface LoanRepository extends JpaRepository<Loan, Integer> {
	Optional<Loan> findById(int id);
}