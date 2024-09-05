package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

import com.fenix.api.models.FK.Artigo;
import com.fenix.api.models.FK.CategCnh;
import com.fenix.api.models.FK.ExpProf;
import com.fenix.api.models.FK.IddFilhos;
import com.fenix.api.models.FK.QDef;

@Entity
@Table(name = "TE_DJESFSA")
public class TE_DJESFSAModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cadastro")
    private int cadastro;

    @Column(name = "numero", length = 12)
    private String numero;

    @Column(name = "secao", length = 4)
    private String secao;

    @Column(name = "zona", length = 3)
    private String zona;

    @Column(name = "t_clt")
    private boolean tClt;

    @Column(name = "cpf", length = 11)
    private String cpf;

    @Column(name = "rg", length = 10)
    private String rg;

    @ManyToOne
    @JoinColumn(name = "fk_categ_cnh_categ_cnh_PK", referencedColumnName = "categ_cnh_PK")
    private CategCnh categCnh;

    @Column(name = "un_prisional", length = 100)
    private String unPrisional;

    @Column(name = "tempo_sentenca")
    private int tempoSentenca;

    @Column(name = "seeu", length = 100)
    private String seeu;

    @Column(name = "pje", length = 100)
    private String pje;

    @Column(name = "reincidente")
    private boolean reincidente;

    @Column(name = "termino_pena")
    private Date terminoPena;

    @Column(name = "regime_atual", length = 100)
    private String regimeAtual;

    @Column(name = "situacao_process", length = 100)
    private String situacaoProcess;

    @ManyToOne
    @JoinColumn(name = "fk_artigo_artigo_PK", referencedColumnName = "artigo_PK")
    private Artigo artigo;

    @Column(name = "escolaridade", length = 100)
    private String escolaridade;

    @Column(name = "serie_curso", length = 100)
    private String serieCurso;

    @Column(name = "letrado")
    private boolean letrado;

    @Column(name = "dt_aperfeicoamento")
    private Date dtAperfeicoamento;

    @Column(name = "obs_social", length = 300)
    private String obsSocial;

    @Column(name = "turma", length = 100)
    private String turma;

    @Column(name = "manha")
    private boolean manha;

    @Column(name = "tarde")
    private boolean tarde;

    @Column(name = "cesta_b")
    private boolean cestaB;

    @Column(name = "sts", length = 100)
    private String sts;

    @Column(name = "obs_perfil", length = 300)
    private String obsPerfil;

    @Column(name = "dt_atnd_indv")
    private Date dtAtndIndv;

    @ManyToOne
    @JoinColumn(name = "fk_exp_prof_exp_prof_PK", referencedColumnName = "exp_prof_PK")
    private ExpProf expProf;

    @Column(name = "estado_civil", length = 20)
    private String estadoCivil;

    @Column(name = "nome_mae", length = 50)
    private String nomeMae;

    @Column(name = "nome_pai", length = 50)
    private String nomePai;

    @ManyToOne
    @JoinColumn(name = "fk_idd_filhos_idd_filhos_PK", referencedColumnName = "idd_filhos_PK")
    private IddFilhos iddFilhos;

    @Column(name = "triagem_familia")
    private boolean triagemFamilia;

    @Column(name = "dt_atend_fam")
    private Date dtAtendFam;

    @Column(name = "dt_aniversario")
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
    @JoinColumn(name = "fk_q_def_q_def_PK", referencedColumnName = "q_def_PK")
    private QDef qDef;

    @Column(name = "estado_nativo", length = 100)
    private String estadoNativo;

    @Column(name = "dt_inscricao")
    private Date dtInscricao;

    @Column(name = "nome_completo", length = 50)
    private String nomeCompleto;

    @Column(name = "idade")
    private short idade;

    @Column(name = "nacionalidade", length = 30)
    private String nacionalidade;

    @Column(name = "nome_social", length = 50)
    private String nomeSocial;

    // Getters and Setters
}
