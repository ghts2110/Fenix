package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "QDef")
public class QDef implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QDef_PK")
    private long QDefPK;

    @Column(name = "QDef", length = 14)
    private String QDef;

    public QDef(){}

    public QDef(int qDefPK, String qDef) {
        QDefPK = qDefPK;
        QDef = qDef;
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

    
}
