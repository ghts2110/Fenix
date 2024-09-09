package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Artigo")
public class Artigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long artigoPK;
    private String artigo;

    public Artigo(){}

    public Artigo(int artigoPK, String artigo) {
        this.artigoPK = artigoPK;
        this.artigo = artigo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getArtigoPK() {
        return this.artigoPK;
    }

    public void setArtigoPK(int artigoPK) {
        this.artigoPK = artigoPK;
    }

    public String getArtigo() {
        return this.artigo;
    }

    public void setArtigo(String artigo) {
        this.artigo = artigo;
    }


    
}
