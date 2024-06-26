package com.example.test.error.model;

import lombok.Value;

import java.sql.Timestamp;

@Value
public class ErrorResponse {
    int code;
    String message;
    String description;
    Timestamp timestamp;
    String macAddress;
}
