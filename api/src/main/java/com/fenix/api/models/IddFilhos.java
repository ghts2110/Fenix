package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "IddFilhos")
public class IddFilhos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iddFilhosPK;

    private String iddFilhos;

    @ManyToOne
    @JoinColumn(name = "fk_Usuario_Id")
    private TeDjesfsa FkDjesfsaId;

    public IddFilhos() {
    }

    public IddFilhos(Long iddFilhosPK, String iddFilhos, TeDjesfsa FkDjesfsaId) {
        super();
        this.iddFilhosPK = iddFilhosPK;
        this.iddFilhos = iddFilhos;
        this.FkDjesfsaId = FkDjesfsaId;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getIddFilhosPK() {
        return iddFilhosPK;
    }

    public void setIddFilhosPK(long iddFilhosPK) {
        this.iddFilhosPK = iddFilhosPK;
    }

    public String getIddFilhos() {
        return iddFilhos;
    }

    public void setIddFilhos(String iddFilhos) {
        this.iddFilhos = iddFilhos;
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
        result = prime*result+((iddFilhosPK == null) ? 0 : iddFilhosPK.hashCode());
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
            IddFilhos other = (IddFilhos) obj;
        if (iddFilhosPK == null) {
            if(other.iddFilhosPK != null)
                return false;
        }else if(!iddFilhosPK.equals(other.iddFilhosPK)){
            return false;
        }
        return true;
    }

}
