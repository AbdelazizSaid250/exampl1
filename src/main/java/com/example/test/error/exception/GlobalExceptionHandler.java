package com.example.test.error.exception;

import com.example.test.error.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.sql.Timestamp;
import java.time.Instant;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<ErrorResponse> handleShapeException(IllegalArgumentException exception) {
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(1);
        errorResponse.setMessage(exception.getMessage());
        errorResponse.setDescription("The path variable is invalid");
        errorResponse.setTimestamp(Timestamp.from(Instant.now()));

        return new ResponseEntity<>(errorResponse, HttpStatus.OK);
    }

}
