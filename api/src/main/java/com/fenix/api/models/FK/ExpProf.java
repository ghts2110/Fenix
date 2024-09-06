package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ExpProf")
public class ExpProf implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExpProf_PK")
    private int ExpProfPK;

    @Column(name = "ExpProf", length = 14)
    private String ExpProf;

    public ExpProf() {}

    public ExpProf(int expProfPK, String expProf) {
        ExpProfPK = expProfPK;
        ExpProf = expProf;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getExpProfPK() {
        return ExpProfPK;
    }

    public void setExpProfPK(int expProfPK) {
        ExpProfPK = expProfPK;
    }

    public String getExpProf() {
        return ExpProf;
    }

    public void setExpProf(String expProf) {
        ExpProf = expProf;
    }

    

}
