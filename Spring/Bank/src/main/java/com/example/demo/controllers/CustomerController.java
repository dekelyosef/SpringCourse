package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.errors.CustomerDoesntExistsException;
import com.example.demo.errors.CustomerExistsException;
import com.example.demo.services.CustomerService;


@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

	@GetMapping("/getAll")
	public List<Customer> getAll() throws CustomerDoesntExistsException {
		return customerService.getAll();
	}
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addNewCustomer(@RequestBody Customer customer) throws CustomerExistsException {
		Customer newCustomer = this.customerService.addNewCustomer(customer);
		return new ResponseEntity<>(newCustomer, HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Customer> updateProduct(@RequestBody Customer customer) throws CustomerDoesntExistsException {
		Customer updatedCustomer = this.customerService.updateCustomer(customer);
		return new ResponseEntity<>(updatedCustomer, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteCustomerById(@PathVariable long id) throws CustomerDoesntExistsException {
		this.customerService.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
    

}