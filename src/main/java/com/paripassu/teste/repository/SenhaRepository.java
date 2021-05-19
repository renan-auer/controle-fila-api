package com.paripassu.teste.repository;

import com.paripassu.teste.models.Senha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SenhaRepository extends JpaRepository<Senha, Integer> {

    @Query(value = "SELECT * FROM senha ORDER BY id DESC LIMIT 1", nativeQuery = true)
    Senha findLastSenha();

    @Query(value = "SELECT * FROM senha WHERE tipo = ?1 ORDER BY id DESC  LIMIT 1", nativeQuery = true)
    Senha findLastSenhaByTipoSenha(String tipo);

}
