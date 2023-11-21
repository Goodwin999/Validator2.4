package com.example.validator.exception;


    public class WrongLoginException extends RuntimeException {
        public WrongLoginException(String message) {
            super(message);
        }
    }
