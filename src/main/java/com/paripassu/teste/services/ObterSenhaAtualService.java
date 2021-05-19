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

        int newId = ultimaSenha != null ? ultimaSenha.getId() + 1 : 1;

        Senha newSenha = new Senha(
                newId,
                createSenhaDTO.getTipoSenha().getPrefix() + String.format("%03d", newId),
                createSenhaDTO.getTipoSenha(),
                new Date());

        this.senhaRepository.save(newSenha);

        return newSenha;
    }
}
