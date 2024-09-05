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

    // Getters and Setters
}
