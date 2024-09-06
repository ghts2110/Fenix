package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Artigo")
public class Artigo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Artigo_PK")
    private int ArtigoPK;

    @Column(name = "Artigo", length = 14)
    private String Artigo;

    public Artigo(){}

    public Artigo(int artigoPK, String artigo) {
        ArtigoPK = artigoPK;
        Artigo = artigo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getArtigoPK() {
        return ArtigoPK;
    }

    public void setArtigoPK(int artigoPK) {
        ArtigoPK = artigoPK;
    }

    public String getArtigo() {
        return Artigo;
    }

    public void setArtigo(String artigo) {
        Artigo = artigo;
    }


    
}
