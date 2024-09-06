package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "telefone_PK")
    private int telefonePK;

    @Column(name = "telefone", length = 14)
    private String telefone;

    public Telefone() {}

    public Telefone(int telefonePK, String telefone) {
        this.telefonePK = telefonePK;
        this.telefone = telefone;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getTelefonePK() {
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
