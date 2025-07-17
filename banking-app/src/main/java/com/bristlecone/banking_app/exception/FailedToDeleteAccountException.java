package com.bristlecone.banking_app.exception;

public class FailedToDeleteAccountException extends RuntimeException{

    public FailedToDeleteAccountException(String message){
        super(message);
    }
}
