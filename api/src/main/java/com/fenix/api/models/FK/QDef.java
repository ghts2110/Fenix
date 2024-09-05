package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "QDef")
public class QDef implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "QDef_PK")
    private int QDefPK;

    @Column(name = "QDef", length = 14)
    private String QDef;

    // Getters and Setters
}
