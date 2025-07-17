package com.bristlecone.banking_app.exception;

import com.bristlecone.banking_app.mapper.AccountMapper;

import java.time.LocalDateTime;

public record ErrorDetails(LocalDateTime timestamp,
                           String message,
                           String details,
                           String errorCode){
}
