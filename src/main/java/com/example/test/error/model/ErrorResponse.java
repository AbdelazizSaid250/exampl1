package com.example.test.error.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ErrorResponse {
    private int code;
    private String message;
    private String description;
    private Timestamp timestamp;
}
