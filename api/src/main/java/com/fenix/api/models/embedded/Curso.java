package com.fenix.api.models.embedded;

import jakarta.persistence.Embeddable;
import lombok.*;
import java.util.Date;

@Embeddable
@Getter
@Setter
@AllArgsConstructor

public class Curso {

    private String escolaridade;
    private String serieCurso;
    private boolean letrado;
    private Date dtAperfeicoamento;
    private String obsSocial;
    private String turma;
    private boolean manha;
    private boolean tarde;
    private boolean cestaB;
    private String sts;
    private String obsPerfil;
    private Date dtAtndIndv;

    // Getters e setters
}

