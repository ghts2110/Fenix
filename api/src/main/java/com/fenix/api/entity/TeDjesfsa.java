package com.fenix.api.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "TE_DJESFSA")
public class TeDjesfsa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cadastro; // Chave primária

    private String numero;

    private String secao;

    private String zona;

    private Boolean tClt;

    private String cpf;

    private String rg;

    @ManyToOne
    @JoinColumn(name = "fk_categ_cnh_categ_cnh_PK")
    private CategCnh categCnh;

    private String unPrisional;

    private Integer tempoSentenca;

    private String seeu;

    private String pje;

    private Boolean reincidente;

    @Temporal(TemporalType.DATE)
    private Date terminoPena;

    private String regimeAtual;

    private String situacaoProcess;

    @ManyToOne
    @JoinColumn(name = "fk_artigo_artigo_PK")
    private Artigo artigo;

    private String escolaridade;

    private String serieCurso;

    private Boolean letrado;

    @Temporal(TemporalType.DATE)
    private Date dtAperfeicoamento;

    private String obsSocial;

    private String turma;

    private Boolean manha;

    private Boolean tarde;

    private Boolean cestaB;

    private String sts;

    private String obsPerfil;

    @Temporal(TemporalType.DATE)
    private Date dtAtndIndv;

    @ManyToOne
    @JoinColumn(name = "fk_exp_prof_exp_prof_PK")
    private ExpProf expProf;

    private String estadoCivil;

    private String nomeMae;

    private String nomePai;

    @ManyToOne
    @JoinColumn(name = "fk_idd_filhos_idd_filhos_PK")
    private IdadeFilhos idadeFilhos;

    private Boolean triagemFamilia;

    @Temporal(TemporalType.DATE)
    private Date dtAtendFam;

    @Temporal(TemporalType.DATE)
    private Date dtAniversario;

    private String raca;

    private String orientacaoSexual;

    private String genero;

    private String cidadeNativa;

    @ManyToOne
    @JoinColumn(name = "fk_q_def_q_def_PK")
    private QDef qDef;

    private String estadoNativo;

    @Temporal(TemporalType.DATE)
    private Date dtInscricao;

    private String nomeCompleto;

    private Short idade;

    private String nacionalidade;

    private String nomeSocial;

    @OneToMany(mappedBy = "teDjesfsa")
    private List<SitTrab> sitTrabList;
}
