package com.bristlecone.taskservice.exception;

public class ProjectNotFoundException extends RuntimeException{

    public ProjectNotFoundException(String message){
        super(message);
    }
}
