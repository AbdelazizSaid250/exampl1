package com.example.test.error.exception;

import com.example.test.error.model.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import static com.example.test.utilities.DeviceInfo.getMacAddress;
import static com.example.test.utilities.timing.TimingUtils.currentTimestamp;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StudentNotFoundException.class)
    public ResponseEntity<ErrorResponse> handleStudentNotFoundException(StudentNotFoundException exception) {

        ErrorResponse errorResponse = new ErrorResponse(exception.getErrorCode(), exception.getErrorMessage(),
                exception.getDescription(), currentTimestamp(), getMacAddress());

        return new ResponseEntity<>(errorResponse, HttpStatus.OK);
    }

    @ExceptionHandler(UnsupportedShapeException.class)
    public ResponseEntity<ErrorResponse> handleUnsupportedShapeException(UnsupportedShapeException exception) {
        ErrorResponse errorResponse = new ErrorResponse(exception.getErrorCode(), exception.getErrorMessage(),
                exception.getDescription(), currentTimestamp(), getMacAddress());

        return new ResponseEntity<>(errorResponse, HttpStatus.OK);
    }


}
