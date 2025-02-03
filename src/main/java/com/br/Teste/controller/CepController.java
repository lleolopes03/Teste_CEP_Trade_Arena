package com.br.Teste.controller;

import com.br.Teste.entity.Endereco;
import com.br.Teste.exception.CepNaoEncontradoException;
import com.br.Teste.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CepController {


    @Autowired
    private CepService cepService;

    @GetMapping("/cep")
    public Endereco buscarEndereco(@RequestParam String cep) {
        return cepService.buscarEnderecoPorCep(cep);
    }


}