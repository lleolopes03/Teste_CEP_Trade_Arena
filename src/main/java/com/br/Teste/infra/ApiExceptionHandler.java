package com.br.Teste.infra;

import com.br.Teste.exception.CepNaoEncontradoException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
@ControllerAdvice
public class ApiExceptionHandler {
    @ExceptionHandler(CepNaoEncontradoException.class)
    public ResponseEntity<String> handleCepNaoEncontrado(CepNaoEncontradoException e) {
        return ResponseEntity.badRequest().body(e.getMessage());

    }
}
