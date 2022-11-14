package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Loan;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.HandleException;
import com.example.demo.errors.LoanDoesntExistsException;
import com.example.demo.errors.LoanIsntActiveException;

public interface LoanService {
	
	Loan getById(int id) throws LoanDoesntExistsException;
	Loan giveLoan(int accountNumber, double amount, Customer customer, double monthlyRepayment)
			throws LoanDoesntExistsException, AccountDoesntExistsException;
	Loan loanRepayment(int loanNumber, double amount)
			throws LoanDoesntExistsException, AccountDoesntExistsException, LoanIsntActiveException, HandleException;
	List<Loan> getAll();
}
