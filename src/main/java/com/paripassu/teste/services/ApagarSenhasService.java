package com.paripassu.teste.services;

import com.paripassu.teste.models.Senha;
import com.paripassu.teste.repository.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApagarSenhasService {

    @Autowired
    private SenhaRepository senhaRepository;

    public void delete() {
        this.senhaRepository.deleteAll();
    }
}
