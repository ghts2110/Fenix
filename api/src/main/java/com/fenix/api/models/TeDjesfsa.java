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


    public TeDjesfsa(){}

    public TeDjesfsa(Long cadastro, InformacoesPessoais informacoesPessoais, Documentos documentos, 
    Processos processos, Curso curso, String estadoCivil, String nomeMae, String nomePai,
    boolean triagemFamilia, Date dtAtendFam, Date dtAniversario, Set<QDef> qDef, 
    String estadoNativo, Date dtInscricao) {
this.cadastro = cadastro;
this.informacoesPessoais = informacoesPessoais;
this.documentos = documentos;
this.processos = processos;
this.curso = curso;
this.estadoCivil = estadoCivil;
this.nomeMae = nomeMae;
this.nomePai = nomePai;
this.triagemFamilia = triagemFamilia;
this.dtAtendFam = dtAtendFam;
this.dtAniversario = dtAniversario;
this.estadoNativo = estadoNativo;
this.dtInscricao = dtInscricao;
}

public Set<Artigo> getArtigo() {
    return artigo;
}
public Long getCadastro() {
    return cadastro;
}
public Curso getCurso() {
    return curso;
}
public Documentos getDocumentos() {
    return documentos;
}
public Date getDtAniversario() {
    return dtAniversario;
}
public Date getDtAtendFam() {
    return dtAtendFam;
}
public Date getDtInscricao() {
    return dtInscricao;
}
public String getEstadoCivil() {
    return estadoCivil;
}
public String getEstadoNativo() {
    return estadoNativo;
}
public Set<ExpProf> getExpProf() {
    return expProf;
}
public Set<IddFilhos> getIddFilhos() {
    return iddFilhos;
}
public InformacoesPessoais getInformacoesPessoais() {
    return informacoesPessoais;
}
public String getNomeMae() {
    return nomeMae;
}
public String getNomePai() {
    return nomePai;
}public Processos getProcessos() {
    return processos;
}
public static Long getSerialversionuid() {
    return serialVersionUID;
}
public Set<SitTrabModel> getSitTrabModels() {
    return sitTrabModels;
}
public Set<QDef> getqDef() {
    return qDef;
}
public void setArtigo(Set<Artigo> artigo) {
    this.artigo = artigo;
}public void setCadastro(Long cadastro) {
    this.cadastro = cadastro;
}
public void setCurso(Curso curso) {
    this.curso = curso;
}
public void setDocumentos(Documentos documentos) {
    this.documentos = documentos;
}
public void setDtAniversario(Date dtAniversario) {
    this.dtAniversario = dtAniversario;
}
public void setDtAtendFam(Date dtAtendFam) {
    this.dtAtendFam = dtAtendFam;
}
public void setDtInscricao(Date dtInscricao) {
    this.dtInscricao = dtInscricao;
}
public void setEstadoCivil(String estadoCivil) {
    this.estadoCivil = estadoCivil;
}
public void setEstadoNativo(String estadoNativo) {
    this.estadoNativo = estadoNativo;
}
public void setExpProf(Set<ExpProf> expProf) {
    this.expProf = expProf;
}
public void setIddFilhos(Set<IddFilhos> iddFilhos) {
    this.iddFilhos = iddFilhos;
}
public void setInformacoesPessoais(InformacoesPessoais informacoesPessoais) {
    this.informacoesPessoais = informacoesPessoais;
}
public void setNomeMae(String nomeMae) {
    this.nomeMae = nomeMae;
}
public void setNomePai(String nomePai) {
    this.nomePai = nomePai;
}
public void setProcessos(Processos processos) {
    this.processos = processos;
}
public void setSitTrabModels(Set<SitTrabModel> sitTrabModels) {
    this.sitTrabModels = sitTrabModels;
}
public void setTriagemFamilia(boolean triagemFamilia) {
    this.triagemFamilia = triagemFamilia;
}
public void setqDef(Set<QDef> qDef) {
    this.qDef = qDef;
}

public int hashCode(){
    final int prime = 31;
    int result = 1;
    result = prime*result+((cadastro == null) ? 0 : cadastro.hashCode());
    return result;
}

@Override
public boolean equals(Object obj){
    if(this == obj)
        return true;
    if(obj == null)
        return false;
    if(getClass() != obj.getClass())
        return false;
    TeDjesfsa other = (TeDjesfsa) obj;
    if (cadastro == null) {
        if(other.cadastro != null)
            return false;
    }else if(!cadastro.equals(other.cadastro)){
        return false;
    }
    return true;
}

}
