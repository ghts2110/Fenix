package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ExpProf")
public class ExpProf implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ExpProf_PK")
    private int ExpProfPK;

    @Column(name = "ExpProf", length = 14)
    private String ExpProf;

}
