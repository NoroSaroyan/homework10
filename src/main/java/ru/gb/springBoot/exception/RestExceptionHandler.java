package ru.gb.springBoot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ProductException.class, CartException.class})
    public ResponseEntity<ApiError> handleEntityException(RuntimeException exception) {
        return ResponseEntity.internalServerError()
                .body(
                        new ApiError(
                                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                                "Something went wrong during working with domain",
                                exception.getMessage()
                        )
                );
    }

}