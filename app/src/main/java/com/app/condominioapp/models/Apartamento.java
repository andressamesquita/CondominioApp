package com.app.condominioapp.models;

import com.app.condominioapp.utils.EnumTipoOcupacao;

import io.objectbox.annotation.Entity;
import io.objectbox.annotation.Id;

@Entity
public class Apartamento {
    @Id
    private Long id;
    private Integer numero;
    private Integer qtdQuartos;
    private EnumTipoOcupacao ocupacao;


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getQtdQuartos() {
        return qtdQuartos;
    }

    public void setQtdQuartos(Integer qtdQuartos) {
        this.qtdQuartos = qtdQuartos;
    }

    public EnumTipoOcupacao getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(EnumTipoOcupacao ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }
}
