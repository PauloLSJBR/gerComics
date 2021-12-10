package org.zup.paulo.gerComics.exceptions.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.zup.paulo.gerComics.exceptions.UserNotFoundException;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<org.zup.paulo.gerComics.exceptions.util.ErrorDetails> handlerCategoriaException(UserNotFoundException e, HttpServletRequest request) {
        e.printStackTrace();
        org.zup.paulo.gerComics.exceptions.util.ErrorDetails error = new org.zup.paulo.gerComics.exceptions.util.ErrorDetails();
        error.setStatus(404l);
        error.setTitle("Banda exception.");
        error.setUrl("http://erros.teste.com/404");
        error.setTimestamp(System.currentTimeMillis());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }

}
