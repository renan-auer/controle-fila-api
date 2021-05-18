package com.paripassu.teste.models;

import com.paripassu.teste.enums.TipoSenha;

import java.util.Date;

public class SenhaHistorico {

    private int id;
    private String codigo;
    private TipoSenha tipo;
    private Date horaCriacao;
    private Date horaChamada;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public TipoSenha getTipo() {
        return tipo;
    }

    public void setTipo(TipoSenha tipo) {
        this.tipo = tipo;
    }

    public Date getHoraCriacao() {
        return horaCriacao;
    }

    public void setHoraCriacao(Date horaCriacao) {
        this.horaCriacao = horaCriacao;
    }

    public Date getHoraChamada() {
        return horaChamada;
    }

    public void setHoraChamada(Date horaChamada) {
        this.horaChamada = horaChamada;
    }
}
