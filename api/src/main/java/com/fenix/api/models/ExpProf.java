package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ExpProf")
public class ExpProf implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long expProfPK;

    private String expProf;

    public ExpProf() {}

    public ExpProf(int expProfPK, String expProf) {
        this.expProfPK = expProfPK;
        this.expProf = expProf;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getexpProfPK() {
        return this.expProfPK;
    }

    public void setexpProfPK(int expProfPK) {
        this.expProfPK = expProfPK;
    }

    public String getExpProf() {
        return this.expProf;
    }

    public void setExpProf(String expProf) {
        this.expProf = expProf;
    }

    

}
