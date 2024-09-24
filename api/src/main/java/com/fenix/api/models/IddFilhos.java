package com.fenix.api.models;

import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "IddFilhos")
public class IddFilhos implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddFilhosPK;

    private String iddFilhos;

    @ManyToOne
    @JoinColumn(name = "fk_Usuario_Id")
    private TeDjesfsa FkDjesfsaId;

    public IddFilhos() {
    }

    public IddFilhos(long iddFilhosPK, String iddFilhos, TeDjesfsa FkDjesfsaId) {
        super();
        this.iddFilhosPK = iddFilhosPK;
        this.iddFilhos = iddFilhos;
        this.FkDjesfsaId = FkDjesfsaId;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public long getIddFilhosPK() {
        return iddFilhosPK;
    }

    public void setIddFilhosPK(long iddFilhosPK) {
        this.iddFilhosPK = iddFilhosPK;
    }

    public String getIddFilhos() {
        return iddFilhos;
    }

    public void setIddFilhos(String iddFilhos) {
        this.iddFilhos = iddFilhos;
    }

    public TeDjesfsa getFkDjesfsaId() {
        return FkDjesfsaId;
    }

    public void setFkDjesfsaId(TeDjesfsa fkDjesfsaId) {
        FkDjesfsaId = fkDjesfsaId;
    }

}
