package com.br.Teste.exception;

public class CepNaoEncontradoException extends RuntimeException{
    public CepNaoEncontradoException(String message) {
        super(message);
    }
}
