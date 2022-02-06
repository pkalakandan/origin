package com.example.origincodesample.Exception;

import org.springframework.validation.Errors;

/**
 * Exception that should be thrown when validation of the incoming request fails
 * 
 * @author imasud
 * 
 */
public class InvalidRequestException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = -5147030042014002679L;

    private final transient Errors errors;

    public InvalidRequestException(final Errors errors) {

        this.errors = errors;
    }

    public Errors getErrors() {

        return errors;
    }

}
