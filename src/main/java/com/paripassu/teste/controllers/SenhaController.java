package com.paripassu.teste.controllers;

import com.paripassu.teste.controllers.dto.CreateSenhaDTO;
import com.paripassu.teste.controllers.dto.SenhaDTO;
import com.paripassu.teste.models.Senha;
import com.paripassu.teste.services.CriarSenhaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "senha", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class SenhaController {


    @Autowired
    private CriarSenhaService criarSenhaService;

    @PostMapping(path = "/gerar-nova")
    public SenhaDTO create(@RequestBody CreateSenhaDTO createSenhaDTO) {
        Senha novaSenha = this.criarSenhaService.create(createSenhaDTO);
        return new SenhaDTO(novaSenha);
    }

}
