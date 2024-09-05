package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "telefone")
public class CategCnh implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CategCnh_PK")
    private int CategCnhPK;

    @Column(name = "CategCnh", length = 14)
    private String CategCnh;

    // Getters and Setters
}
