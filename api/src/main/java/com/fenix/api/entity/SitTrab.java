package com.fenix.api.entity;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
@Table(name = "sitTrab")
public class SitTrab implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FK_ESFSA_cadastro")
    private Integer fkEsfsaCadastro; // Chave primária e chave estrangeira referenciando TE_DJESFSA

    @Column(name = "esta_tb")
    private Boolean estaTb;

    @Column(name = "local_tb", length = 100)
    private String localTb;

    @Column(name = "modalidade_tb", length = 100)
    private String modalidadeTb;

    @ManyToOne
    @JoinColumn(name = "FK_ESFSA_cadastro", insertable = false, updatable = false)
    private TeDjesfsa teDjesfsa;

    // Getters and Setters

    public Integer getFkEsfsaCadastro() {
        return fkEsfsaCadastro;
    }

    public void setFkEsfsaCadastro(Integer fkEsfsaCadastro) {
        this.fkEsfsaCadastro = fkEsfsaCadastro;
    }

    public Boolean getEstaTb() {
        return estaTb;
    }

    public void setEstaTb(Boolean estaTb) {
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
}
