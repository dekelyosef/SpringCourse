package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.errors.HandleException;
import com.example.demo.errors.AccountDoesntExistsException;
import com.example.demo.errors.CustomerDoesntExistsException;
import com.example.demo.errors.CustomerExistsException;
import com.example.demo.errors.LoanDoesntExistsException;
import com.example.demo.errors.LoanIsntActiveException;

@ControllerAdvice
public class HandleExceptionController {
	
    @ExceptionHandler(value = HandleException.class)
    public ResponseEntity<Object> exception(HandleException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.CONFLICT);
    }
    
	@ExceptionHandler(value = CustomerExistsException.class)
	@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Customer already exists")
	public void personExistsErrorHandling(Exception e)
	{
		System.out.println("Customer already exists");
	}
	
	@ExceptionHandler(CustomerDoesntExistsException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public void handlePersonDoesntExistException(Exception e)
	{
		System.out.println("Customer doesn't exist");
	}
	
	@ExceptionHandler(value = AccountDoesntExistsException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public void handleAccountDoesntExistException(Exception e)
	{
		System.out.println("Account doesn't exist");
	}

	@ExceptionHandler(value = LoanDoesntExistsException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public void LoanDoesntExistsException(Exception e)
	{
		System.out.println("Loan doesn't exist");
	}

	@ExceptionHandler(value = LoanIsntActiveException.class)
	@ResponseStatus(value=HttpStatus.NOT_FOUND)
	public void LoanIsntActiveException(Exception e)
	{
		System.out.println("Loan isn't active");
	}
	
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = "Unhandler exception")	
	public void generatlExceptionHandling(Exception e)
	{
		System.out.println("An error occured");
	}
	
	
       
}