package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.entities.Loan;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.HandleException;
import com.example.demo.errors.LoanDoesntExistsException;
import com.example.demo.errors.LoanIsntActiveException;
import com.example.demo.services.LoanService;

@RestController
@RequestMapping("/loan")
public class LoanController {
	
	@Autowired
    private LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }
    
	@PostMapping("/giveLoan")
	public ResponseEntity<Loan> giveLoan(@RequestHeader int accountNumber,
			@RequestHeader int amount, @RequestHeader double monthlyRepayment, @RequestBody Customer customer)
			throws AccountDoesntExistsException, LoanDoesntExistsException {
		Loan loan = this.loanService.giveLoan(accountNumber, amount, customer, monthlyRepayment);
		return new ResponseEntity<>(loan, HttpStatus.OK);
	}

	@PutMapping("/loanRepayment")
	public ResponseEntity<Loan> loanRepayment(@RequestHeader int loanNumber, @RequestHeader int amount)
			throws AccountDoesntExistsException, LoanDoesntExistsException, LoanIsntActiveException, HandleException {
		Loan loan = this.loanService.loanRepayment(loanNumber, amount);
		return new ResponseEntity<>(loan, HttpStatus.OK);
	}

}
