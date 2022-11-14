package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Account;
import com.example.demo.entities.Customer;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.CustomerDoesntExistsException;
import com.example.demo.errors.HandleException;
import com.example.demo.services.AccountService;

@RestController
@RequestMapping("/account")
public class AccountController {

	@Autowired
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

	@GetMapping("/getAll")
	public List<Account> getAll() throws AccountDoesntExistsException {
		return accountService.getAll();
	}
	
    
	@PostMapping("/add")
	public ResponseEntity<Account> createNewAccount(@RequestBody Customer customer)
			throws CustomerDoesntExistsException, AccountDoesntExistsException {
		Account account = this.accountService.createNewAccount(customer);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}
	
	@PutMapping("/limit")
	public ResponseEntity<Account> limitAccount(@RequestHeader int accountNumber, @RequestHeader int limitNumber)
			throws AccountDoesntExistsException {
		Account account = this.accountService.limitAccount(accountNumber, limitNumber);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}

	@PutMapping("/hold")
	public ResponseEntity<Account> holdAccount(@RequestHeader int accountNumber)
			throws AccountDoesntExistsException {
		Account account = this.accountService.holdAccount(accountNumber);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}
	
	@PutMapping("/depositing")
	public ResponseEntity<Account> depositing(@RequestHeader int accountNumber, @RequestHeader int amount)
			throws AccountDoesntExistsException {
		Account account = accountService.depositing(accountNumber, amount);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}

	@PutMapping("/withdrawal")
	public ResponseEntity<Account> withdrawal(@RequestHeader int accountNumber, @RequestHeader int amount)
			throws AccountDoesntExistsException, HandleException {
		Account account = this.accountService.withdrawal(accountNumber, amount);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}

	@GetMapping("getBalance/{accountNumber}")
	public ResponseEntity<Double> getBalance(@PathVariable int accountNumber)
			throws AccountDoesntExistsException {
		double amount = this.accountService.getBalance(accountNumber);
		return new ResponseEntity<>(amount, HttpStatus.OK);
	}

	@PutMapping("/transfer")
	public ResponseEntity<Account> transfer(@RequestHeader int amount, @RequestHeader int from, @RequestHeader int to)
			throws AccountDoesntExistsException, HandleException {
		Account account = this.accountService.transfer(amount, from, to);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}
	
	

}
