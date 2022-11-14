package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Account;
import com.example.demo.entities.Customer;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.CustomerDoesntExistsException;
import com.example.demo.errors.HandleException;

public interface AccountService {
	
	Account getById(int id) throws AccountDoesntExistsException;
	Account createNewAccount(Customer customer) throws CustomerDoesntExistsException, AccountDoesntExistsException;
	Account limitAccount(int accountNumber, int limitation) throws AccountDoesntExistsException;
	Account holdAccount(int accountNumber) throws AccountDoesntExistsException;
	Account depositing(int accountNumber, double amount) throws AccountDoesntExistsException;
	Account withdrawal(int accountNumber, double amount) throws AccountDoesntExistsException, HandleException;
	double getBalance(int accountNumber) throws AccountDoesntExistsException;
	Account transfer(double amount, int from, int to) throws AccountDoesntExistsException, HandleException;
	List<Account> getAll();
}
