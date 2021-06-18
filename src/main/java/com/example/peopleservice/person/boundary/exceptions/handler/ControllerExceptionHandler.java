package com.example.peopleservice.person.boundary.exceptions.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.example.peopleservice.person.boundary.exceptions.ObjectNotFoundException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    SimpleDateFormat formatter = new SimpleDateFormat("dd MMMM yyyy HH:mm:ss");

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<ErrorDetails> handleObjectNotFoundException(ObjectNotFoundException exception, WebRequest request) {

        ErrorDetails errorDetails = new ErrorDetails(formatter.format(new Date()), exception.getMessage(), request.getDescription(false));
        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
    }
}
