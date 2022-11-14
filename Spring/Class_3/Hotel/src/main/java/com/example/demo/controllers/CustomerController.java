package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Customer;
import com.example.demo.errors.HandleException;
import com.example.demo.services.HotelService;
import com.example.demo.services.IHotelService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
    private IHotelService hotelService;

    public CustomerController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping("/find")
    public ResponseEntity<Customer> getCustomerByName(@RequestParam String name)
            throws HandleException {
    	Customer customer = hotelService.getCustomerByFirstName(name)
                .orElseThrow( () -> new HandleException("Costumer by name " + name + " was not found"));
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @GetMapping("/getChildren")
    public List<Customer> getChildren() {
    	return hotelService.getChildren();
    	
    }
    
}