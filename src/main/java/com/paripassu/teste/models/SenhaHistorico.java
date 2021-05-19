package com.paripassu.teste.models;

import com.paripassu.teste.enums.TipoSenha;

import javax.persistence.*;
import java.util.Date;

@Entity
public class SenhaHistorico {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int sequencia;
    private String codigo;

    @Enumerated(EnumType.STRING)
    private TipoSenha tipo;
    private Date horaCriacao;
    private Date horaChamada;

    public SenhaHistorico() {}

    public SenhaHistorico(Senha senha, Date horaChamada) {
        this.sequencia = senha.getSequencia();
        this.codigo = senha.getCodigo();
        this.tipo = senha.getTipo();
        this.horaCriacao = senha.getHoraCriacao();
        this.horaChamada = horaChamada;
    }

    public Date getHoraChamada() {
        return horaChamada;
    }

    public void setHoraChamada(Date horaChamada) {
        this.horaChamada = horaChamada;
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
