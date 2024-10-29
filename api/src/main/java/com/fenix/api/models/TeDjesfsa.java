package com.fenix.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

import java.util.HashSet;
import java.util.Set;

import com.fenix.api.models.embedded.Curso;
import com.fenix.api.models.embedded.Documentos;
import com.fenix.api.models.embedded.InformacoesPessoais;
import com.fenix.api.models.embedded.Processos;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "TE_DJESFSA")
public class TeDjesfsa implements Serializable {
    private static final Long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cadastro;

    @Embedded
    private InformacoesPessoais informacoesPessoais;

    @Embedded
    private Documentos documentos;

    @Embedded
    private Processos processos;

    @Embedded
    private Curso curso;

    @OneToMany(mappedBy = "FkDjesfsaId")
    private Set<Artigo> artigo = new HashSet<>();

    @OneToMany(mappedBy = "FkDjesfsaId")
    private Set<ExpProf> expProf = new HashSet<>();

    private String estadoCivil;
    private String nomeMae;
    private String nomePai;

    @OneToMany(mappedBy = "FkDjesfsaId")
    private Set<IddFilhos> iddFilhos = new HashSet<>();

    private boolean triagemFamilia;
    private Date dtAtendFam;
    private Date dtAniversario;

    @OneToMany(mappedBy = "FkDjesfsaId")
    private Set<QDef> qDef = new HashSet<>();

    @OneToMany(mappedBy = "teDjesfsa") 
    private Set<SitTrabModel> sitTrabModels = new HashSet<>();


    private String estadoNativo;
    private Date dtInscricao;

}
