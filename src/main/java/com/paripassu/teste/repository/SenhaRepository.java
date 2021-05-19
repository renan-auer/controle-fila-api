package com.paripassu.teste.repository;

import com.paripassu.teste.models.Senha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SenhaRepository extends JpaRepository<Senha, Integer> {

    @Query(value = "select * from senha where ja_chamada = false order by  tipo desc, sequencia asc LIMIT 1", nativeQuery = true)
    Senha getSenhaAtual();

    @Query(value = "SELECT * FROM senha WHERE tipo = ?1 and ja_chamada = false ORDER BY id DESC  LIMIT 1", nativeQuery = true)
    Senha findLastSenhaByTipoSenha(String tipo);

}
