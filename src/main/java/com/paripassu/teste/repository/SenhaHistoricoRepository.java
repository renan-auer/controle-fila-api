package com.paripassu.teste.repository;

import com.paripassu.teste.models.Senha;
import com.paripassu.teste.models.SenhaHistorico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SenhaHistoricoRepository extends JpaRepository<SenhaHistorico, Integer> {

}
