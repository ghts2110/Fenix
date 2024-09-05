package com.fenix.api.models.FK;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "IddFilhos")
public class IddFilhos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IddFilhos_PK")
    private int IddFilhosPK;

    @Column(name = "IddFilhos", length = 14)
    private String IddFilhos;

    // Getters and Setters
}
