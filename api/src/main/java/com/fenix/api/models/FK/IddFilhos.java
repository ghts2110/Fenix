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

    public IddFilhos(){}

    public IddFilhos(int iddFilhosPK, String iddFilhos) {
        IddFilhosPK = iddFilhosPK;
        IddFilhos = iddFilhos;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getIddFilhosPK() {
        return IddFilhosPK;
    }

    public void setIddFilhosPK(int iddFilhosPK) {
        IddFilhosPK = iddFilhosPK;
    }

    public String getIddFilhos() {
        return IddFilhos;
    }

    public void setIddFilhos(String iddFilhos) {
        IddFilhos = iddFilhos;
    }

    
}
