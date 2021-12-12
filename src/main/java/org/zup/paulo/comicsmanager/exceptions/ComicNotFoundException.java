package org.zup.paulo.comicsmanager.exceptions;

public class ComicNotFoundException extends RuntimeException {

    public ComicNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ComicNotFoundException(String mensagem, Throwable causa) {
        super(mensagem, causa);
    }
}

