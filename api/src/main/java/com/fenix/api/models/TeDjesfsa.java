package com.fenix.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

import java.util.HashSet;
import java.util.Set;

import com.fenix.api.models.embedded.Curso;
import com.fenix.api.models.embedded.Documentos;
import com.fenix.api.models.embedded.InformacoesPessoais;
import com.fenix.api.models.embedded.Processos;


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

    public static Long getSerialversionuid() {
        return serialVersionUID;
    }
    public Set<QDef> getqDef() {
        return qDef;
    }
    public void setqDef(Set<QDef> qDef) {
        this.qDef = qDef;
    }
    public Long getCadastro() {
        return cadastro;
    }
    public void setCadastro(Long cadastro) {
        this.cadastro = cadastro;
    }
    public InformacoesPessoais getInformacoesPessoais() {
        return informacoesPessoais;
    }
    public void setInformacoesPessoais(InformacoesPessoais informacoesPessoais) {
        this.informacoesPessoais = informacoesPessoais;
    }
    public Documentos getDocumentos() {
        return documentos;
    }
    public void setDocumentos(Documentos documentos) {
        this.documentos = documentos;
    }
    public Processos getProcessos() {
        return processos;
    }
    public void setProcessos(Processos processos) {
        this.processos = processos;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Set<Artigo> getArtigo() {
        return artigo;
    }
    public void setArtigo(Set<Artigo> artigo) {
        this.artigo = artigo;
    }
    public Set<ExpProf> getExpProf() {
        return expProf;
    }
    public void setExpProf(Set<ExpProf> expProf) {
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
    public Set<IddFilhos> getIddFilhos() {
        return iddFilhos;
    }
    public void setIddFilhos(Set<IddFilhos> iddFilhos) {
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
    public Set<SitTrabModel> getSitTrabModels() {
        return sitTrabModels;
    }
    public void setSitTrabModels(Set<SitTrabModel> sitTrabModels) {
        this.sitTrabModels = sitTrabModels;
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

    
    

}
