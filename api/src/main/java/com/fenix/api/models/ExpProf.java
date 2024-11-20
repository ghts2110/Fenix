package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ExpProf")
public class ExpProf implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expProfPK;

    private String expProf;

    @ManyToOne
    @JoinColumn(name = "fk_Usuario_Id") // Chave estrangeira referenciando Usuario
    private TeDjesfsa FkDjesfsaId;

    public ExpProf() {
    }

    public ExpProf(Long expProfPK, String expProf, TeDjesfsa FkDjesfsaId) {
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

    public void setexpProfPK(Long expProfPK) {
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

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((expProfPK == null) ? 0 : expProfPK.hashCode());
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
            ExpProf other = (ExpProf) obj;
        if (expProfPK == null) {
            if(other.expProfPK != null)
                return false;
        }else if(!expProfPK.equals(other.expProfPK)){
            return false;
        }
        return true;
    }

}
