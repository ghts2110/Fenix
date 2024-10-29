package com.fenix.api.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.*;
import java.util.Date;

@Embeddable
@Getter
@Setter
@AllArgsConstructor

public class Processos {

    private String unPrisional;
    private int tempoSentenca;
    private String seeu;
    private String pje;
    private boolean reincidente;
    private Date terminoPena;
    private String regimeAtual;
    private String situacaoProcess;

    // Getters e setters
}

