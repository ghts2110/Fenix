package com.fenix.api.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@Getter
@Setter
@AllArgsConstructor

public class Documentos {

    private String secao;
    private String zona;
    private boolean tClt;
    private String cpf;
    private String rg;
    private String categCnh;

    // Getters e setters
}

