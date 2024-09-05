package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

import com.fenix.api.models.FK.Telefone;

@Entity
@Table(name = "Moradia")
public class MoradiaModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "endr", length = 100)
    private String endr;

    @Column(name = "bairro", length = 100)
    private String bairro;

    @Column(name = "cidade", length = 100)
    private String cidade;

    @Column(name = "est", length = 100)
    private String est;

    @Column(name = "cep", length = 8)
    private String cep;

    @ManyToOne
    @JoinColumn(name = "FK_telefone_telefone_PK", referencedColumnName = "telefone_PK")
    private Telefone telefone;

    @ManyToOne
    @JoinColumn(name = "FK_SFSA_cadastro", referencedColumnName = "cadastro")
    private TE_DJESFSAModel teDjesfsa;

    

    public MoradiaModel(String endr, String bairro, String cidade, String est, String cep, Telefone telefone,
            TE_DJESFSAModel teDjesfsa) {
        this.endr = endr;
        this.bairro = bairro;
        this.cidade = cidade;
        this.est = est;
        this.cep = cep;
        this.telefone = telefone;
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

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public TE_DJESFSAModel getTeDjesfsa() {
        return teDjesfsa;
    }

    public void setTeDjesfsa(TE_DJESFSAModel teDjesfsa) {
        this.teDjesfsa = teDjesfsa;
    }


    
}
