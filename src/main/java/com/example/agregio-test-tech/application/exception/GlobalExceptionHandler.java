package com.example.agregiotest.application.exception;

import com.example.agregiotest.domain.exception.FunctionalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    
    @ExceptionHandler(FunctionalException.class)
    public ResponseEntity<String> handleFunctionalException(FunctionalException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Functional error");
    }
    
    @ExceptionHandler(TechnicalException.class)
    public ResponseEntity<String> handleTechnicalException(TechnicalException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal server error");
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> handleIllegalArgumentException(IllegalArgumentException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Illegal argument: %s".formatted(ex.getMessage()));
    }
}
