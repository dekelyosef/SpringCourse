package com.example.demo.repositories;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Customer;

@Component
public class CustomerRepositoryImpl {

    @Autowired
    private CustomerRepository customerRepo;

	public List<Customer> getChildren() {
		List<Customer> customers = customerRepo.findAll();
		List<Customer> children = new ArrayList<Customer>();
    	customers.forEach(customer -> {
    	    Period period = Period.between(customer.getBirthdate().toLocalDate(), LocalDate.now());
    	    if(period.getYears() >= 2 && period.getYears() <= 12) {
    	    	children.add(customer);
    	    }
    	});
    	return children;
	}

}
