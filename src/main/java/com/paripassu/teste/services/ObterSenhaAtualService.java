package com.paripassu.teste.services;

import com.paripassu.teste.models.Senha;
import com.paripassu.teste.repository.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ObterSenhaAtualService {

    @Autowired
    private SenhaRepository senhaRepository;

    public Senha get() {
        Senha ultimaSenha = this.senhaRepository.findLastSenha();
        return ultimaSenha;
    }
}
