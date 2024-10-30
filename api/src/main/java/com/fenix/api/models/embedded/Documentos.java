package com.fenix.api.models.embedded;

import jakarta.persistence.Embeddable;


@Embeddable

public class Documentos {

    private String secao;
    private String zona;
    private boolean tClt;
    private String cpf;
    private String rg;
    private String categCnh;

    public Documentos(String secao, String zona, boolean tClt, String cpf, String rg, String categCnh) {
        this.secao = secao;
        this.zona = zona;
        this.tClt = tClt;
        this.cpf = cpf;
        this.rg = rg;
        this.categCnh = categCnh;
    }

    public String getCategCnh() {
        return categCnh;
    }
    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }
    public String getSecao() {
        return secao;
    }
    public String getZona() {
        return zona;
    }
    public void setCategCnh(String categCnh) {
        this.categCnh = categCnh;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public void setSecao(String secao) {
        this.secao = secao;
    }
    public void setZona(String zona) {
        this.zona = zona;
    }
    public void settClt(boolean tClt) {
        this.tClt = tClt;
    }
}

