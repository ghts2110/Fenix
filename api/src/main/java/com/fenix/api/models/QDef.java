package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "QDef")
public class QDef implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long QDefPK;
    private String QDef;

    @ManyToOne
    @JoinColumn(name = "fk_Usuario_Id")
    private TeDjesfsa FkDjesfsaId;

    public QDef() {
    }

    public QDef(Long qDefPK, String qDef, TeDjesfsa FkDjesfsaId) {
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

    public void setQDefPK(Long qDefPK) {
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

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((QDefPK == null) ? 0 : QDefPK.hashCode());
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
        QDef other = (QDef) obj;
        if (QDefPK == null) {
            if(other.QDefPK != null)
                return false;
        }else if(!QDefPK.equals(other.QDefPK)){
            return false;
        }
        return true;
    }
}
