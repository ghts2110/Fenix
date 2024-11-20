package com.fenix.api.models.embedded;

import jakarta.persistence.Embeddable;


@Embeddable


public class InformacoesPessoais {

    private String raca;
    private String orientacaoSexual;
    private String genero;
    private String nomeCompleto;
    private short idade;
    private String nacionalidade;
    private String nomeSocial;
    private String cidadeNativa;

    public InformacoesPessoais(String raca, String orientacaoSexual, String genero, String nomeCompleto, 
                            short idade, String nacionalidade, String nomeSocial, String cidadeNativa) {
        this.raca = raca;
        this.orientacaoSexual = orientacaoSexual;
        this.genero = genero;
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
        this.nomeSocial = nomeSocial;
        this.cidadeNativa = cidadeNativa;
    }

    public String getCidadeNativa() {
        return cidadeNativa;
    }
    public String getGenero() {
        return genero;
    }
    public short getIdade() {
        return idade;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public String getNomeSocial() {
        return nomeSocial;
    }
    public String getOrientacaoSexual() {
        return orientacaoSexual;
    }
    public String getRaca() {
        return raca;
    }
    public void setCidadeNativa(String cidadeNativa) {
        this.cidadeNativa = cidadeNativa;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setIdade(short idade) {
        this.idade = idade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }
    public void setOrientacaoSexual(String orientacaoSexual) {
        this.orientacaoSexual = orientacaoSexual;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
}

