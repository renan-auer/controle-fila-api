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

        if (ultimaSenha == null) return null;

        ultimaSenha.setJaChamada(true);
        ultimaSenha.setAtual(false);
        this.senhaRepository.save(ultimaSenha);
        this.senhaHistoricoRepository.save(new SenhaHistorico(ultimaSenha, new Date()));

        Senha novaSenha = this.senhaRepository.getSenhaAtual();
        if (novaSenha == null) return null;
        novaSenha.setAtual(true);


        this.senhaRepository.save(novaSenha);
        return novaSenha;
    }
}
