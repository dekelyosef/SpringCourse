package com.example.demo.services;

import com.example.demo.entities.Account;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.HandleException;

public interface ExchangeRateService {

	Account depositing(int accountNumber, String from, String to, double amount) throws AccountDoesntExistsException;
	Account withdrawal(int accountNumber, String from, String to, double amount) throws AccountDoesntExistsException, HandleException;
}
