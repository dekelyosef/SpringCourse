package com.example.demo.errors;

public class HandleException extends Exception {

    private static final long serialVersionUID = 1L;

    public HandleException(String message){
        super(message);
    }
}