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

    @ManyToOne
    @JoinColumn(name = "fk_Usuario_Id") // Chave estrangeira referenciando Usuario
    private TeDjesfsa FkDjesfsaId;

    public ExpProf() {
    }

    public ExpProf(int expProfPK, String expProf, TeDjesfsa FkDjesfsaId) {
        super();
        this.expProfPK = expProfPK;
        this.expProf = expProf;
        this.FkDjesfsaId = FkDjesfsaId;
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

    public long getExpProfPK() {
        return expProfPK;
    }

    public void setExpProfPK(long expProfPK) {
        this.expProfPK = expProfPK;
    }

    public TeDjesfsa getFkDjesfsaId() {
        return FkDjesfsaId;
    }

    public void setFkDjesfsaId(TeDjesfsa FkDjesfsaId) {
        FkDjesfsaId = FkDjesfsaId;
    }

}
