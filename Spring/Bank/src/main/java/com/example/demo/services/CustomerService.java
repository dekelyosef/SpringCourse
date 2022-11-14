package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Customer;
import com.example.demo.errors.CustomerDoesntExistsException;
import com.example.demo.errors.CustomerExistsException;

public interface CustomerService {
	
	Customer getById(long id) throws CustomerDoesntExistsException;
	Customer addNewCustomer(Customer customer) throws CustomerExistsException;
	Customer updateCustomer(Customer customer) throws CustomerDoesntExistsException;
	void deleteById(long id) throws CustomerDoesntExistsException;
	List<Customer> getAll();
}
