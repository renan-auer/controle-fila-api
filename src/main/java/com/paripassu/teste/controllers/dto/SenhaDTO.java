package com.paripassu.teste.controllers.dto;

import com.paripassu.teste.enums.TipoSenha;
import com.paripassu.teste.models.Senha;

public class SenhaDTO {
    private String codigo;
    private TipoSenha tipo;

    public SenhaDTO(Senha senha) {
        this.codigo = senha.getCodigo();
        this.tipo = senha.getTipo();
    }

    public String getCodigo() {
        return codigo;
    }

    public TipoSenha getTipo() {
        return tipo;
    }
}
