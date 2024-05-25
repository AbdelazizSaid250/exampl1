package com.example.test.error.exception;

import lombok.Getter;

@Getter
public class StudentNotFoundException extends RuntimeException {

    private final int errorCode = 1000;
    private final String errorMessage = "studentNotFound";
    private final String description;

    public StudentNotFoundException(String description) {
        super(description);
        this.description = description;
    }

    public StudentNotFoundException(String message, String description) {
        super(message);
        this.description = description;
    }
}
