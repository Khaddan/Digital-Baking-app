package com.example.bank_backend.exceptions;

public class BalanceNotSufficientException extends Exception{
    public BalanceNotSufficientException(String message){
        super(message);
    }
}
