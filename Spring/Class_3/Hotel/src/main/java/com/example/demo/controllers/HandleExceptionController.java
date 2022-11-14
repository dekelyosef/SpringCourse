package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.example.demo.errors.HandleException;

@ControllerAdvice
public class HandleExceptionController {
    @ExceptionHandler(value = HandleException.class)
    public ResponseEntity<Object> exception(HandleException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.CONFLICT);
    }
}