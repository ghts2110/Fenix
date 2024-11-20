package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sitTrab")
public class SitTrabModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean estaTb;
    private String localTb;
    private String modalidadeTb;

    @ManyToOne
    @JoinColumn(name = "FK_ESFSA_cadastro", referencedColumnName = "cadastro")
    private TeDjesfsa teDjesfsa;

    public SitTrabModel(){}

    public SitTrabModel(boolean estaTb, String localTb, String modalidadeTb, TeDjesfsa teDjesfsa) {
        this.estaTb = estaTb;
        this.localTb = localTb;
        this.modalidadeTb = modalidadeTb;
        this.teDjesfsa = teDjesfsa;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public boolean isEstaTb() {
        return estaTb;
    }

    public void setEstaTb(boolean estaTb) {
        this.estaTb = estaTb;
    }

    public String getLocalTb() {
        return localTb;
    }

    public void setLocalTb(String localTb) {
        this.localTb = localTb;
    }

    public String getModalidadeTb() {
        return modalidadeTb;
    }

    public void setModalidadeTb(String modalidadeTb) {
        this.modalidadeTb = modalidadeTb;
    }

    public TeDjesfsa getTeDjesfsa() {
        return teDjesfsa;
    }

    public void setTeDjesfsa(TeDjesfsa teDjesfsa) {
        this.teDjesfsa = teDjesfsa;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime*result+((id == null) ? 0 : id.hashCode());
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
        SitTrabModel other = (SitTrabModel) obj;
        if (id == null) {
            if(other.id != null)
                return false;
        }else if(!id.equals(other.id)){
            return false;
        }
        return true;
    }
}
