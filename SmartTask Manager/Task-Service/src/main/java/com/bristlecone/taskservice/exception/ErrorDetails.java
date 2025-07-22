package com.bristlecone.taskservice.exception;

import java.time.LocalDateTime;

public record ErrorDetails(

        LocalDateTime timeStamp,
        String errorDetails,
        String description,
        String errorCode

) {
}
