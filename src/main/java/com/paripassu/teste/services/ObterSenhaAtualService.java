package com.paripassu.teste.services;

import com.paripassu.teste.enums.TipoSenha;
import com.paripassu.teste.models.Senha;
import com.paripassu.teste.repository.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ObterSenhaAtualService {

    @Autowired
    private SenhaRepository senhaRepository;

    public Senha get() {
        Senha ultimaSenha = this.senhaRepository.getSenhaAtual();

        if(ultimaSenha == null) {
            ultimaSenha = new Senha(0, "0000", TipoSenha.NORMAL, new Date());
        }

        return ultimaSenha;
    }
}
