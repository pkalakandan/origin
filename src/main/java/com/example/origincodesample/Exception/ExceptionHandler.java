package com.example.origincodesample.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {
    private String BAD_REQUEST = "BAD_REQUEST";

    @org.springframework.web.bind.annotation.ExceptionHandler(value = InvalidRequestException.class)
    public void constraintViolationException(HttpServletResponse response) throws IOException {
        response.sendError(HttpStatus.BAD_REQUEST.value());
    }
}
