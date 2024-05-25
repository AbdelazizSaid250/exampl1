package com.example.test.error.exception;

public class EmailNotValidException extends Exception {
    private final int errorCode = 1000;
    private final String errorMessage = "studentNotFound";
    private final String description;

    public EmailNotValidException(String description) {
        this.description = description;
    }
}
