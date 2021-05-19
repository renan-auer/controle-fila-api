package com.paripassu.teste.enums;

public enum TipoSenha {
    NORMAL ("NORMAL"),
    PREFERENCIAL ("PREFERENCIAL");

    private final String tipo;

    private TipoSenha(String tipo) {
        this.tipo = tipo;
    }

    public String toString() {
        return this.tipo;
    }

    public String getPrefix() {
        return this.tipo.substring(0,1);
    }
}
