package com.senai.testeSpring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atualizacao")
public class AtualizacaoController {
    @GetMapping
    public String getRegistros(){
        return """
                [{
                    "nome" : "Igor",
                    "horario" : "14:11:00",
                    "imagem" : "-"
                },
                {
                    "nome" : "Beatriz",
                    "horario" : "15:25:14",
                    "imagem" : "-"
                }]
                """;
    }
}
