package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Artigo")
public class Artigo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Artigo_PK")
    private int ArtigoPK;

    @Column(name = "Artigo", length = 14)
    private String Artigo;

}
