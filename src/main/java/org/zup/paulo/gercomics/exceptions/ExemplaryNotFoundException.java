package org.zup.paulo.gercomics.exceptions;

public class ExemplaryNotFoundException extends RuntimeException {

    public ExemplaryNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ExemplaryNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}
