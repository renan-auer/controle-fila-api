package com.paripassu.teste.models;

import com.paripassu.teste.enums.TipoSenha;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Senha {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String codigo;

    @Enumerated(EnumType.STRING)
    private TipoSenha tipo;
    private Date horaCriacao;

    public Senha() {}

    public Senha(int id, String codigo, TipoSenha tipo, Date horaCriacao) {
        this.id = id;
        this.codigo = codigo;
        this.tipo = tipo;
        this.horaCriacao = horaCriacao;
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
