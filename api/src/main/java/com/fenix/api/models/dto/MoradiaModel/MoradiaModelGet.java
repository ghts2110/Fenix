package com.fenix.api.models.dto.MoradiaModel;

import com.fenix.api.models.TeDjesfsa;
import com.fenix.api.models.Telefone;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class MoradiaModelGet {
    
    private long id;
    private String endr;
    private String bairro;
    private String cidade;
    private String est;
    private String cep;

    @ManyToOne
    @JoinColumn(name = "FKtelefone_PK", referencedColumnName = "telefonePK")
    private Telefone telefone;

    @ManyToOne
    @JoinColumn(name = "FK_SFSA_cadastro", referencedColumnName = "cadastro")
    private TeDjesfsa teDjesfsa;
}
