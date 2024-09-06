package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "telefone")
public class CategCnh implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategCnh_PK")
    private int CategCnhPK;

    @Column(name = "CategCnh", length = 14)
    private String CategCnh;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getCategCnhPK() {
        return CategCnhPK;
    }

    public void setCategCnhPK(int categCnhPK) {
        CategCnhPK = categCnhPK;
    }

    public String getCategCnh() {
        return CategCnh;
    }

    public void setCategCnh(String categCnh) {
        CategCnh = categCnh;
    }

    
}
