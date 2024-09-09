package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "CategCnh")
public class CategCnh implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long categCnhPK;
    private String categCnh;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getCategCnhPK() {
        return this.categCnhPK;
    }

    public void setCategCnhPK(long categCnhPK) {
        this.categCnhPK = categCnhPK;
    }

    public String getCategCnh() {
        return this.categCnh;
    }

    public void setCategCnh(String categCnh) {
        this.categCnh = categCnh;
    }

    
}
