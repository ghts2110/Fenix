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

    public Telefone(){
        
    }

    public Telefone(int telefonePK, String telefone) {
        this.telefonePK = telefonePK;
        this.telefone = telefone;
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

    
}
