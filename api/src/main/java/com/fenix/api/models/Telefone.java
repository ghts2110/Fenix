package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long telefonePK;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "telefones")
    private MoradiaModel fkMoradiaModelId;

    public Telefone(){}

    public Telefone(int telefonePK, String telefone,MoradiaModel moradia) {
        super();
        this.telefonePK = telefonePK;
        this.telefone = telefone;
        this.fkMoradiaModelId = moradia;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getTelefonePK() {
        return telefonePK;
    }

    public void setTelefonePK(int telefonePK) {
        this.telefonePK = telefonePK;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public MoradiaModel getFkMoradiaModelId() {
        return fkMoradiaModelId;
    }
    public void setFkMoradiaModelId(MoradiaModel fkMoradiaModelId) {
        this.fkMoradiaModelId = fkMoradiaModelId;
    }

}
