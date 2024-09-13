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
    @Column(name = "cadastro")
    private Integer cadastro; // Chave primária

    @Column(name = "numero", length = 12)
    private String numero;

    @Column(name = "secao", length = 4)
    private String secao;

    @Column(name = "zona", length = 3)
    private String zona;

    @Column(name = "t_clt")
    private Boolean tClt;

    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "rg", length = 10)
    private String rg;

    @ManyToOne
    @JoinColumn(name = "fk_categ_cnh_categ_cnh_PK")
    private CategCnh categCnh;

    @Column(name = "un_prisional", length = 100)
    private String unPrisional;

    @Column(name = "tempo_sentenca")
    private Integer tempoSentenca;

    @Column(name = "seeu", length = 100)
    private String seeu;

    @Column(name = "pje", length = 100)
    private String pje;

    @Column(name = "reincidente")
    private Boolean reincidente;

    @Column(name = "termino_pena")
    @Temporal(TemporalType.DATE)
    private Date terminoPena;

    @Column(name = "regime_atual", length = 100)
    private String regimeAtual;

    @Column(name = "situacao_process", length = 100)
    private String situacaoProcess;

    @ManyToOne
    @JoinColumn(name = "fk_artigo_artigo_PK")
    private Artigo artigo;

    @Column(name = "escolaridade", length = 100)
    private String escolaridade;

    @Column(name = "serie_curso", length = 100)
    private String serieCurso;

    @Column(name = "letrado")
    private Boolean letrado;

    @Column(name = "dt_aperfeicoamento")
    @Temporal(TemporalType.DATE)
    private Date dtAperfeicoamento;

    @Column(name = "obs_social", length = 300)
    private String obsSocial;

    @Column(name = "turma", length = 100)
    private String turma;

    @Column(name = "manha")
    private Boolean manha;

    @Column(name = "tarde")
    private Boolean tarde;

    @Column(name = "cesta_b")
    private Boolean cestaB;

    @Column(name = "sts", length = 100)
    private String sts;

    @Column(name = "obs_perfil", length = 300)
    private String obsPerfil;

    @Column(name = "dt_atnd_indv")
    @Temporal(TemporalType.DATE)
    private Date dtAtndIndv;

    @ManyToOne
    @JoinColumn(name = "fk_exp_prof_exp_prof_PK")
    private ExpProf expProf;

    @Column(name = "estado_civil", length = 20)
    private String estadoCivil;

    @Column(name = "nome_mae", length = 50)
    private String nomeMae;

    @Column(name = "nome_pai", length = 50)
    private String nomePai;

    @ManyToOne
    @JoinColumn(name = "fk_idd_filhos_idd_filhos_PK")
    private IdadeFilhos idadeFilhos;

    @Column(name = "triagem_familia")
    private Boolean triagemFamilia;

    @Column(name = "dt_atend_fam")
    @Temporal(TemporalType.DATE)
    private Date dtAtendFam;

    @Column(name = "dt_aniversario")
    @Temporal(TemporalType.DATE)
    private Date dtAniversario;

    @Column(name = "raca", length = 10)
    private String raca;

    @Column(name = "orientacao_sexual", length = 20)
    private String orientacaoSexual;

    @Column(name = "genero", length = 20)
    private String genero;

    @Column(name = "cidade_nativa", length = 50)
    private String cidadeNativa;

    @ManyToOne
    @JoinColumn(name = "fk_q_def_q_def_PK")
    private QDef qDef;

    @Column(name = "estado_nativo", length = 100)
    private String estadoNativo;

    @Column(name = "dt_inscricao")
    @Temporal(TemporalType.DATE)
    private Date dtInscricao;

    @Column(name = "nome_completo", length = 50)
    private String nomeCompleto;

    @Column(name = "idade")
    private Short idade;

    @Column(name = "nacionalidade", length = 30)
    private String nacionalidade;

    @Column(name = "nome_social", length = 50)
    private String nomeSocial;

    @OneToMany(mappedBy = "teDjesfsa")
    private List<SitTrab> sitTrabList;
}
