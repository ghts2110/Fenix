package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Artigo")
public class Artigo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artigoPK;

    private String artigo;

    @ManyToOne
    @JoinColumn(name = "fk_Usuario_Id")
    private TeDjesfsa FkDjesfsaId;

    public Artigo() {
    }

    public Artigo(Long artigoPK, String artigo, TeDjesfsa Djse) {
        super();
        this.artigoPK = artigoPK;
        this.artigo = artigo;
        this.FkDjesfsaId = Djse;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getArtigoPK() {
        return this.artigoPK;
    }

    public void setArtigoPK(Long artigoPK) {
        this.artigoPK = artigoPK;
    }

    public String getArtigo() {
        return this.artigo;
    }

    public void setArtigo(String artigo) {
        this.artigo = artigo;
    }

    public TeDjesfsa getFkDjesfsaId() {
        return FkDjesfsaId;
    }

    public void setFkDjesfsaId(TeDjesfsa fkDjesfsaId) {
        FkDjesfsaId = fkDjesfsaId;
    }
    
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((artigoPK == null) ? 0 : artigoPK.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Artigo other = (Artigo) obj;
        if (artigoPK == null) {
            if(other.artigoPK != null)
                return false;
        }else if(!artigoPK.equals(other.artigoPK)){
            return false;
        }
        return true;
    }
}
