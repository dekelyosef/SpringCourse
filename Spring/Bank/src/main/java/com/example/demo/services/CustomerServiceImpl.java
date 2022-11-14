package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Customer;
import com.example.demo.errors.CustomerDoesntExistsException;
import com.example.demo.errors.CustomerExistsException;
import com.example.demo.repositories.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public Customer getById(long id) throws CustomerDoesntExistsException {
		Optional<Customer> customer = this.customerRepo.findById(id);
		if(customer.isPresent())
		{
			return customer.get();
		}
		throw new CustomerDoesntExistsException();
	}

	@Override
	public Customer addNewCustomer(Customer customer) throws CustomerExistsException {
		Optional<Customer> existing = this.customerRepo.findById(customer.getId());
		if(existing.isEmpty())
		{
			return this.customerRepo.save(customer);
		}
		throw new CustomerExistsException();
	}

	@Override
	public Customer updateCustomer(Customer customer) throws CustomerDoesntExistsException {
		Optional<Customer> existing = this.customerRepo.findById(customer.getId());
		if(!existing.isEmpty())
		{
			return this.customerRepo.save(customer);
		}
		throw new CustomerDoesntExistsException();
	}

	@Override
	public void deleteById(long id) throws CustomerDoesntExistsException {
		Optional<Customer> existing = this.customerRepo.findById(id);
		if(!existing.isEmpty())
		{
			this.customerRepo.deleteById(id);
		}
		throw new CustomerDoesntExistsException();
	}

	@Override
	public List<Customer> getAll() {
		return this.customerRepo.findAll();
	}
	
}
