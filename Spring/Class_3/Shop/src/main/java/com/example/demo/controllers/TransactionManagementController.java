package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Transaction;
import com.example.demo.repository.TransactionRepository;

@RestController
@RequestMapping("/transactionManagement")
public class TransactionManagementController {
	
	@Autowired
    private TransactionRepository transactionRepository;
	
	@PostMapping("/add")
	public Transaction addNewTransaction(@RequestBody Transaction transaction) {
		return transactionRepository.save(transaction);
	}
	
}
