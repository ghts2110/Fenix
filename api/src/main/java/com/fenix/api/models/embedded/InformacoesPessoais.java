package com.fenix.api.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter

public class InformacoesPessoais {

    private String raca;
    private String orientacaoSexual;
    private String genero;
    private String nomeCompleto;
    private short idade;
    private String nacionalidade;
    private String nomeSocial;
    private String cidadeNativa;


}

