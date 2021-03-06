package com.paripassu.teste.controllers;

import com.paripassu.teste.controllers.dto.CreateSenhaDTO;
import com.paripassu.teste.controllers.dto.SenhaDTO;
import com.paripassu.teste.models.Senha;
import com.paripassu.teste.services.ApagarSenhasService;
import com.paripassu.teste.services.CriarSenhaService;
import com.paripassu.teste.services.ObterProximaSenhaService;
import com.paripassu.teste.services.ObterSenhaAtualService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "senha", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class SenhaController {

    @Autowired
    private ObterSenhaAtualService obterSenhaAtualService;

    @GetMapping(path = "atual")
    public SenhaDTO obter() {
        Senha ultimaSenha = this.obterSenhaAtualService.get();
        return new SenhaDTO(ultimaSenha);
    }


    @Autowired
    private CriarSenhaService criarSenhaService;

    @PostMapping(path = "gerar-nova")
    public SenhaDTO criar(@RequestBody CreateSenhaDTO createSenhaDTO) {
        Senha novaSenha = this.criarSenhaService.create(createSenhaDTO);
        return new SenhaDTO(novaSenha);
    }

    @Autowired
    private ObterProximaSenhaService obterProximaSenhaService;

    @PostMapping(path = "chamar-proxima")
    public SenhaDTO chamarProxima() {
        Senha novaSenha = this.obterProximaSenhaService.get();
        return novaSenha == null ? null : new SenhaDTO(novaSenha);
    }

    @Autowired
    private ApagarSenhasService apagarSenhasService;

    @PostMapping(path = "resetar")
    public boolean deletarSenhas() {
        this.apagarSenhasService.delete();
        return true;
    }

}
