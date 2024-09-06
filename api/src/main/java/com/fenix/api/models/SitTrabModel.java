package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sitTrab")
public class SitTrabModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "esta_tb")
    private boolean estaTb;

    @Column(name = "local_tb", length = 100)
    private String localTb;

    @Column(name = "modalidade_tb", length = 100)
    private String modalidadeTb;

    @ManyToOne
    @JoinColumn(name = "FK_ESFSA_cadastro", referencedColumnName = "cadastro")
    private TE_DJESFSAModel teDjesfsa;


    public SitTrabModel(boolean estaTb, String localTb, String modalidadeTb, TE_DJESFSAModel teDjesfsa) {
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

    public TE_DJESFSAModel getTeDjesfsa() {
        return teDjesfsa;
    }

    public void setTeDjesfsa(TE_DJESFSAModel teDjesfsa) {
        this.teDjesfsa = teDjesfsa;
    }

    
}
