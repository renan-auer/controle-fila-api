package com.paripassu.teste.services;

import com.paripassu.teste.models.Senha;
import com.paripassu.teste.models.SenhaHistorico;
import com.paripassu.teste.repository.SenhaHistoricoRepository;
import com.paripassu.teste.repository.SenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ObterProximaSenhaService {

    @Autowired
    private SenhaRepository senhaRepository;

    @Autowired
    private SenhaHistoricoRepository senhaHistoricoRepository;

    public Senha get() {
        Senha ultimaSenha = this.senhaRepository.getSenhaAtual();

        this.senhaHistoricoRepository.save(new SenhaHistorico(ultimaSenha, new Date()));
        ultimaSenha.setJaChamada(true);
        this.senhaRepository.save(ultimaSenha);

        return this.senhaRepository.getSenhaAtual();
    }
}
