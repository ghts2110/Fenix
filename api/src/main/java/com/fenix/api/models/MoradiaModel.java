package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Moradia")
public class MoradiaModel implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String endr;
    private String bairro;
    private String cidade;
    private String est;
    private String cep;

    @OneToMany(mappedBy = "moradia")
    private Set<Telefone> telefone = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "FK_SFSA_cadastro", referencedColumnName = "cadastro")
    private TeDjesfsa teDjesfsa;

    public MoradiaModel() {
    }

    public MoradiaModel(String endr, String bairro, String cidade, String est, String cep, Telefone telefone,
            TeDjesfsa teDjesfsa) {
        this.endr = endr;
        this.bairro = bairro;
        this.cidade = cidade;
        this.est = est;
        this.cep = cep;
        // this.telefone = telefone;
        this.teDjesfsa = teDjesfsa;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getEndr() {
        return endr;
    }

    public void setEndr(String endr) {
        this.endr = endr;
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

    public String getEst() {
        return est;
    }

    public void setEst(String est) {
        this.est = est;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Set<Telefone> getTelefone() {
        return telefone;
    }

    public void setTelefone(Set<Telefone> telefone) {
        this.telefone = telefone;
    }

    public TeDjesfsa getTeDjesfsa() {
        return teDjesfsa;
    }

    public void setTeDjesfsa(TeDjesfsa teDjesfsa) {
        this.teDjesfsa = teDjesfsa;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
