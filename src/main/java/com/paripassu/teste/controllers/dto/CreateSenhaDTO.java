package com.paripassu.teste.controllers.dto;

import com.paripassu.teste.enums.TipoSenha;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CreateSenhaDTO {
    @NotNull @NotEmpty
    private TipoSenha tipoSenha;

    public TipoSenha getTipoSenha() {
        return tipoSenha;
    }

    public void setTipoSenha(TipoSenha tipoSenha) {
        this.tipoSenha = tipoSenha;
    }
}
