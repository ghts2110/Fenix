package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "QDef")
public class QDef implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long QDefPK;
    private String QDef;

    @ManyToOne
    @JoinColumn(name = "fk_Usuario_Id")
    private TeDjesfsa FkDjesfsaId;

    public QDef() {
    }

    public QDef(int qDefPK, String qDef, TeDjesfsa FkDjesfsaId) {
        super();
        this.QDefPK = qDefPK;
        this.QDef = qDef;
        this.FkDjesfsaId = FkDjesfsaId;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getQDefPK() {
        return QDefPK;
    }

    public void setQDefPK(int qDefPK) {
        QDefPK = qDefPK;
    }

    public String getQDef() {
        return QDef;
    }

    public void setQDef(String qDef) {
        QDef = qDef;
    }

    public TeDjesfsa getFkDjesfsaId() {
        return FkDjesfsaId;
    }

    public void setFkDjesfsaId(TeDjesfsa fkDjesfsaId) {
        FkDjesfsaId = fkDjesfsaId;
    }
}
