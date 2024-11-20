package com.fenix.api.models.embedded;

import jakarta.persistence.Embeddable;
import java.util.Date;


@Embeddable
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

    public Curso(String escolaridade, String serieCurso, boolean letrado, Date dtAperfeicoamento, 
    String obsSocial, String turma, boolean manha, boolean tarde, boolean cestaB, 
    String sts, String obsPerfil, Date dtAtndIndv) {
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
}

public Date getDtAperfeicoamento() {
    return dtAperfeicoamento;
}
public Date getDtAtndIndv() {
    return dtAtndIndv;
}
public String getEscolaridade() {
    return escolaridade;
}
public String getObsPerfil() {
    return obsPerfil;
}
public String getObsSocial() {
    return obsSocial;
}
public String getSerieCurso() {
    return serieCurso;
}
public String getSts() {
    return sts;
}
public String getTurma() {
    return turma;
}
public void setCestaB(boolean cestaB) {
    this.cestaB = cestaB;
}
public void setDtAperfeicoamento(Date dtAperfeicoamento) {
    this.dtAperfeicoamento = dtAperfeicoamento;
}
public void setDtAtndIndv(Date dtAtndIndv) {
    this.dtAtndIndv = dtAtndIndv;
}
public void setEscolaridade(String escolaridade) {
    this.escolaridade = escolaridade;
}
public void setLetrado(boolean letrado) {
    this.letrado = letrado;
}
public void setManha(boolean manha) {
    this.manha = manha;
}
public void setObsPerfil(String obsPerfil) {
    this.obsPerfil = obsPerfil;
}
public void setObsSocial(String obsSocial) {
    this.obsSocial = obsSocial;
}
public void setSerieCurso(String serieCurso) {
    this.serieCurso = serieCurso;
}
public void setSts(String sts) {
    this.sts = sts;
}
public void setTarde(boolean tarde) {
    this.tarde = tarde;
}
public void setTurma(String turma) {
    this.turma = turma;
}
}

