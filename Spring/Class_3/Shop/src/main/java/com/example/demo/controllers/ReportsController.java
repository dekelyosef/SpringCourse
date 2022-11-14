package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.entities.Transaction;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.TransactionRepository;

@RestController
@RequestMapping("/report")
public class ReportsController {

	@Autowired
    private TransactionRepository transactionRepository;

	@Autowired
    private ProductRepository productRepository;

    @GetMapping("/getIncomes")
    public void getIncomes() {
    	List<Transaction> transactions = transactionRepository.findAll();
    	transactions.forEach(transaction -> {
    		System.out.print(transaction.getPrice());
    	});
    }
    
    @GetMapping("/getStock")
    public void getStock() {
    	List<Product> products = productRepository.findAll();
    	products.forEach(product -> {
    		System.out.print(product.getName() + " " + product.getStock());
    	});
    }
    
    @GetMapping("/getMissingProducts")
    public void getMissingProducts() {
    	List<Product> products = productRepository.findAll();
    	products.forEach(product -> {
    		if(product.getStock() <= 0) {
        		System.out.print(product.getName());
    		}
    	});
    }

}
