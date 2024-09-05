package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "telefone")
public class Telefone implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "telefone_PK")
    private int telefonePK;

    @Column(name = "telefone", length = 14)
    private String telefone;

}
