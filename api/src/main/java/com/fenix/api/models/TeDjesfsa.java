package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TE_DJESFSA")
public class TeDjesfsa implements Serializable {

    private static final Long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int cadastro;
    private String numero;
    private String secao;
    private String zona;
    private boolean tClt;
    private String cpf;
    private String rg;
    @ManyToOne
    @JoinColumn(name = "fk_categ_cnh_categ_cnh_PK", referencedColumnName = "categ_cnh_PK")
    private CategCnh categCnh;

    private String unPrisional;
    private int tempoSentenca;
    private String seeu;
    private String pje;
    private boolean reincidente;
    private Date terminoPena;
    private String regimeAtual;
    private String situacaoProcess;
    @ManyToOne
    @JoinColumn(name = "fk_artigo_artigo_PK", referencedColumnName = "artigo_PK")
    private Artigo artigo;

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
    @ManyToOne
    @JoinColumn(name = "fk_exp_prof_exp_prof_PK", referencedColumnName = "exp_prof_PK")
    private ExpProf expProf;

    private String estadoCivil;
    private String nomeMae;
    private String nomePai;
    @ManyToOne
    @JoinColumn(name = "fk_idd_filhos_idd_filhos_PK", referencedColumnName = "idd_filhos_PK")
    private IddFilhos iddFilhos;

    private boolean triagemFamilia;
    private Date dtAtendFam;
    private Date dtAniversario;
    private String raca;
    private String orientacaoSexual;
    private String genero;
    private String cidadeNativa;
    @ManyToOne
    @JoinColumn(name = "fk_q_def_q_def_PK", referencedColumnName = "q_def_PK")
    private QDef qDef;

    private String estadoNativo;
    private Date dtInscricao;
    private String nomeCompleto;
    private short idade;
    private String nacionalidade;
    private String nomeSocial;

    public TeDjesfsa(){}

    public TeDjesfsa(int cadastro, String numero, String secao, String zona, boolean tClt, String cpf, String rg,
            CategCnh categCnh, String unPrisional, int tempoSentenca, String seeu, String pje, boolean reincidente,
            Date terminoPena, String regimeAtual, String situacaoProcess, Artigo artigo, String escolaridade,
            String serieCurso, boolean letrado, Date dtAperfeicoamento, String obsSocial, String turma, boolean manha,
            boolean tarde, boolean cestaB, String sts, String obsPerfil, Date dtAtndIndv, ExpProf expProf,
            String estadoCivil, String nomeMae, String nomePai, IddFilhos iddFilhos, boolean triagemFamilia,
            Date dtAtendFam, Date dtAniversario, String raca, String orientacaoSexual, String genero,
            String cidadeNativa, QDef qDef, String estadoNativo, Date dtInscricao, String nomeCompleto, short idade,
            String nacionalidade, String nomeSocial) {
        this.cadastro = cadastro;
        this.numero = numero;
        this.secao = secao;
        this.zona = zona;
        this.tClt = tClt;
        this.cpf = cpf;
        this.rg = rg;
        this.categCnh = categCnh;
        this.unPrisional = unPrisional;
        this.tempoSentenca = tempoSentenca;
        this.seeu = seeu;
        this.pje = pje;
        this.reincidente = reincidente;
        this.terminoPena = terminoPena;
        this.regimeAtual = regimeAtual;
        this.situacaoProcess = situacaoProcess;
        this.artigo = artigo;
        this.escolaridade = escolaridade;
        this.serieCurso = serieCurso;
        this.letrado = letrado;
        this.dtAperfeicoamento = dtAperfeicoamento;
        this.obsSocial = obsSocial;
        this.turma = turma;
        this.manha = manha;
        this.tarde = tarde;
        this.cestaB = cestaB;
        this.sts = sts;
        this.obsPerfil = obsPerfil;
        this.dtAtndIndv = dtAtndIndv;
        this.expProf = expProf;
        this.estadoCivil = estadoCivil;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.iddFilhos = iddFilhos;
        this.triagemFamilia = triagemFamilia;
        this.dtAtendFam = dtAtendFam;
        this.dtAniversario = dtAniversario;
        this.raca = raca;
        this.orientacaoSexual = orientacaoSexual;
        this.genero = genero;
        this.cidadeNativa = cidadeNativa;
        this.qDef = qDef;
        this.estadoNativo = estadoNativo;
        this.dtInscricao = dtInscricao;
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.nomeSocial = nomeSocial;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getCadastro() {
        return cadastro;
    }

    public void setCadastro(int cadastro) {
        this.cadastro = cadastro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getSecao() {
        return secao;
    }

    public void setSecao(String secao) {
        this.secao = secao;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean istClt() {
        return tClt;
    }

    public void settClt(boolean tClt) {
        this.tClt = tClt;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public CategCnh getCategCnh() {
        return categCnh;
    }

    public void setCategCnh(CategCnh categCnh) {
        this.categCnh = categCnh;
    }

    public String getUnPrisional() {
        return unPrisional;
    }

    public void setUnPrisional(String unPrisional) {
        this.unPrisional = unPrisional;
    }

    public int getTempoSentenca() {
        return tempoSentenca;
    }

    public void setTempoSentenca(int tempoSentenca) {
        this.tempoSentenca = tempoSentenca;
    }

    public String getSeeu() {
        return seeu;
    }

    public void setSeeu(String seeu) {
        this.seeu = seeu;
    }

    public String getPje() {
        return pje;
    }

    public void setPje(String pje) {
        this.pje = pje;
    }

    public boolean isReincidente() {
        return reincidente;
    }

    public void setReincidente(boolean reincidente) {
        this.reincidente = reincidente;
    }

    public Date getTerminoPena() {
        return terminoPena;
    }

    public void setTerminoPena(Date terminoPena) {
        this.terminoPena = terminoPena;
    }

    public String getRegimeAtual() {
        return regimeAtual;
    }

    public void setRegimeAtual(String regimeAtual) {
        this.regimeAtual = regimeAtual;
    }

    public String getSituacaoProcess() {
        return situacaoProcess;
    }

    public void setSituacaoProcess(String situacaoProcess) {
        this.situacaoProcess = situacaoProcess;
    }

    public Artigo getArtigo() {
        return artigo;
    }

    public void setArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getSerieCurso() {
        return serieCurso;
    }

    public void setSerieCurso(String serieCurso) {
        this.serieCurso = serieCurso;
    }

    public boolean isLetrado() {
        return letrado;
    }

    public void setLetrado(boolean letrado) {
        this.letrado = letrado;
    }

    public Date getDtAperfeicoamento() {
        return dtAperfeicoamento;
    }

    public void setDtAperfeicoamento(Date dtAperfeicoamento) {
        this.dtAperfeicoamento = dtAperfeicoamento;
    }

    public String getObsSocial() {
        return obsSocial;
    }

    public void setObsSocial(String obsSocial) {
        this.obsSocial = obsSocial;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public boolean isManha() {
        return manha;
    }

    public void setManha(boolean manha) {
        this.manha = manha;
    }

    public boolean isTarde() {
        return tarde;
    }

    public void setTarde(boolean tarde) {
        this.tarde = tarde;
    }

    public boolean isCestaB() {
        return cestaB;
    }

    public void setCestaB(boolean cestaB) {
        this.cestaB = cestaB;
    }

    public String getSts() {
        return sts;
    }

    public void setSts(String sts) {
        this.sts = sts;
    }

    public String getObsPerfil() {
        return obsPerfil;
    }

    public void setObsPerfil(String obsPerfil) {
        this.obsPerfil = obsPerfil;
    }

    public Date getDtAtndIndv() {
        return dtAtndIndv;
    }

    public void setDtAtndIndv(Date dtAtndIndv) {
        this.dtAtndIndv = dtAtndIndv;
    }

    public ExpProf getExpProf() {
        return expProf;
    }

    public void setExpProf(ExpProf expProf) {
        this.expProf = expProf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public IddFilhos getIddFilhos() {
        return iddFilhos;
    }

    public void setIddFilhos(IddFilhos iddFilhos) {
        this.iddFilhos = iddFilhos;
    }

    public boolean isTriagemFamilia() {
        return triagemFamilia;
    }

    public void setTriagemFamilia(boolean triagemFamilia) {
        this.triagemFamilia = triagemFamilia;
    }

    public Date getDtAtendFam() {
        return dtAtendFam;
    }

    public void setDtAtendFam(Date dtAtendFam) {
        this.dtAtendFam = dtAtendFam;
    }

    public Date getDtAniversario() {
        return dtAniversario;
    }

    public void setDtAniversario(Date dtAniversario) {
        this.dtAniversario = dtAniversario;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getOrientacaoSexual() {
        return orientacaoSexual;
    }

    public void setOrientacaoSexual(String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCidadeNativa() {
        return cidadeNativa;
    }

    public void setCidadeNativa(String cidadeNativa) {
        this.cidadeNativa = cidadeNativa;
    }

    public QDef getqDef() {
        return qDef;
    }

    public void setqDef(QDef qDef) {
        this.qDef = qDef;
    }

    public String getEstadoNativo() {
        return estadoNativo;
    }

    public void setEstadoNativo(String estadoNativo) {
        this.estadoNativo = estadoNativo;
    }

    public Date getDtInscricao() {
        return dtInscricao;
    }

    public void setDtInscricao(Date dtInscricao) {
        this.dtInscricao = dtInscricao;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

}
