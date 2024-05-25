package com.example.test.error.exception;

import lombok.Getter;

@Getter
public class UnsupportedShapeException extends IllegalArgumentException {
    private final int errorCode = 1001;
    private final String errorMessage = "unsupportedShape";
    private final String description;

    public UnsupportedShapeException(String description) {
            this.description = description;
    }
}
