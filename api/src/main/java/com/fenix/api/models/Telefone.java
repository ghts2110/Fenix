package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long telefonePK;
    private String telefone;

    @ManyToOne
    @JoinColumn(name = "moradia")
    private MoradiaModel moradia;

    public Telefone(){}

    public Telefone(Long telefonePK, String telefone,MoradiaModel moradia) {
        super();
        this.telefonePK = telefonePK;
        this.telefone = telefone;
        this.moradia = moradia;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getTelefonePK() {
        return telefonePK;
    }

    public void setTelefonePK(Long telefonePK) {
        this.telefonePK = telefonePK;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public MoradiaModel getMoradia() {
        return moradia;
    }
    public void setMoradia(MoradiaModel moradia) {
        this.moradia = moradia;
    }

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((telefonePK == null) ? 0 : telefonePK.hashCode());
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
        Telefone other = (Telefone) obj;
        if (telefonePK == null) {
            if(other.telefonePK != null)
                return false;
        }else if(!telefonePK.equals(other.telefonePK)){
            return false;
        }
        return true;
    }

}
