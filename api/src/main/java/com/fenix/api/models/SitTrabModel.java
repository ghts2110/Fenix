package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "sitTrab")
public class SitTrabModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
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
}
