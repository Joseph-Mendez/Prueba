package com.example.Gestion_de_Biblioteca.exception;

public class CustomException extends RuntimeException {

    private final int statusCode;
    private final String errorDetails;

    public CustomException(int statusCode, String message, String errorDetails) {
        super(message);
        this.statusCode = statusCode;
        this.errorDetails = errorDetails;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getErrorDetails() {
        return errorDetails;
    }
}