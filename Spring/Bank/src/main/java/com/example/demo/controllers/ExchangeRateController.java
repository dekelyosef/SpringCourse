package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Account;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.HandleException;
import com.example.demo.services.ExchangeRateService;

@RestController
@RequestMapping("/exchangeRate")
public class ExchangeRateController {
	
	@Autowired
	private ExchangeRateService exchangeRateService;
	
	@PutMapping("/depositing")
	public ResponseEntity<Account> depositing(@RequestHeader int accountNumber,
			@RequestHeader int amount, @RequestHeader String from, @RequestHeader String to)
			throws AccountDoesntExistsException {
		return new ResponseEntity<>(this.exchangeRateService.depositing(accountNumber, from, to, amount), HttpStatus.OK);
	}

	@PutMapping("/withdrawal")
	public ResponseEntity<Account> withdrawal(@RequestHeader int accountNumber,
			@RequestHeader int amount, @RequestHeader String from, @RequestHeader String to)
			throws AccountDoesntExistsException, HandleException {
		return new ResponseEntity<>(this.exchangeRateService.withdrawal(accountNumber, from, to, amount), HttpStatus.OK);
	}

}
