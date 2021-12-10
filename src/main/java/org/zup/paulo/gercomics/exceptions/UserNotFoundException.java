package org.zup.paulo.gercomics.exceptions;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(String mensagem) {
        super(mensagem);
    }

    public UserNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
