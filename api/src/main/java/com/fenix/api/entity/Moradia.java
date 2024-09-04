package com.fenix.api.entity;

// import javax.persistence.*;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import java.io.Serializable;

@Entity
@Table(name = "Moradia")
public class Moradia implements Serializable {

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // private Long id; // Adicione um campo ID para chave primária

    @Column(name = "endr", length = 100)
    private String endereco;

    @Column(name = "bairro", length = 100)
    private String bairro;

    @Column(name = "cidade", length = 100)
    private String cidade;

    @Column(name = "est", length = 100)
    private String estado;

    @Column(name = "cep", length = 8)
    private String cep;

    // @ManyToOne
    // @JoinColumn(name = "FK_telefone_telefone_PK")
    // private Telefone telefone;

    // @ManyToOne
    // @JoinColumn(name = "FK_SFSA_cadastro")
    // private Cadastro cadastro;

    // Getters and Setters

    // public Long getId() {
    //     return id;
    // }

    // public void setId(Long id) {
    //     this.id = id;
    // }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    // public Telefone getTelefone() {
    //     return telefone;
    // }

    // public void setTelefone(Telefone telefone) {
    //     this.telefone = telefone;
    // }

    // public Cadastro getCadastro() {
    //     return cadastro;
    // }

    // public void setCadastro(Cadastro cadastro) {
    //     this.cadastro = cadastro;
    // }
}
