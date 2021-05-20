package com.paripassu.teste.models;

import com.paripassu.teste.enums.TipoSenha;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Senha {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sequencia;
    private String codigo;
    private boolean jaChamada;
    private boolean atual;

    @Enumerated(EnumType.STRING)
    private TipoSenha tipo;
    private Date horaCriacao;

    public Senha() {}

    public Senha(int sequencia, String codigo, TipoSenha tipo, Date horaCriacao) {
        this.sequencia = sequencia;
        this.codigo = codigo;
        this.tipo = tipo;
        this.jaChamada = false;
        this.horaCriacao = horaCriacao;
    }

    public boolean isAtual() {
        return atual;
    }

    public void setAtual(boolean atual) {
        this.atual = atual;
    }

    public boolean isJaChamada() {
        return jaChamada;
    }

    public void setJaChamada(boolean jaChamada) {
        this.jaChamada = jaChamada;
    }

    public int getSequencia() {
        return sequencia;
    }

    public void setSequencia(int sequencia) {
        this.sequencia = sequencia;
    }

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
}
