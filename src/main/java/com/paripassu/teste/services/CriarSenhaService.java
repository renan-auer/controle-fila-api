package com.paripassu.teste.services;

import com.paripassu.teste.controllers.dto.CreateSenhaDTO;
import com.paripassu.teste.models.Senha;
import com.paripassu.teste.repository.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CriarSenhaService {

    @Autowired
    private SenhaRepository senhaRepository;

    public Senha create(CreateSenhaDTO createSenhaDTO) {
        Senha ultimaSenha = this.senhaRepository.findLastSenhaByTipoSenha(createSenhaDTO.getTipoSenha().toString());

        int novaSequencia = ultimaSenha != null ? ultimaSenha.getSequencia() + 1 : 1;

        Senha newSenha = new Senha(
                novaSequencia,
                createSenhaDTO.getTipoSenha().getPrefix() + String.format("%03d", novaSequencia),
                createSenhaDTO.getTipoSenha(),
                new Date());

        this.senhaRepository.save(newSenha);

        return newSenha;
    }
}
