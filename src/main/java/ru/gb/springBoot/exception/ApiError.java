package ru.gb.springBoot.exception;


public class ApiError {
    private int statusCode;
    private String message;
    private String details;

    public ApiError() {

    }

    public ApiError(int statusCode, String message, String details) {
        this.statusCode = statusCode;
        this.message = message;
        this.details = details;
    }

}