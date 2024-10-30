package com.fenix.api.models.embedded;

import jakarta.persistence.Embeddable;

import java.util.Date;

@Embeddable


public class Processos {

    private String unPrisional;
    private int tempoSentenca;
    private String seeu;
    private String pje;
    private boolean reincidente;
    private Date terminoPena;
    private String regimeAtual;
    private String situacaoProcess;

    public Processos(String unPrisional, int tempoSentenca, String seeu, String pje, boolean reincidente, 
                    Date terminoPena, String regimeAtual, String situacaoProcess) {
        this.unPrisional = unPrisional;
        this.tempoSentenca = tempoSentenca;
        this.seeu = seeu;
        this.pje = pje;
        this.reincidente = reincidente;
        this.terminoPena = terminoPena;
        this.regimeAtual = regimeAtual;
        this.situacaoProcess = situacaoProcess;
                    }
                    
    public String getPje() {
        return pje;
    }
    public String getRegimeAtual() {
        return regimeAtual;
    }
    public String getSeeu() {
        return seeu;
    }
    public String getSituacaoProcess() {
        return situacaoProcess;
    }
    public int getTempoSentenca() {
        return tempoSentenca;
    }
    public Date getTerminoPena() {
        return terminoPena;
    }
    public String getUnPrisional() {
        return unPrisional;
    }
    public void setPje(String pje) {
        this.pje = pje;
    }
    public void setRegimeAtual(String regimeAtual) {
        this.regimeAtual = regimeAtual;
    }
    public void setReincidente(boolean reincidente) {
        this.reincidente = reincidente;
    }
    public void setSeeu(String seeu) {
        this.seeu = seeu;
    }
    public void setSituacaoProcess(String situacaoProcess) {
        this.situacaoProcess = situacaoProcess;
    }
    public void setTempoSentenca(int tempoSentenca) {
        this.tempoSentenca = tempoSentenca;
    }
    public void setTerminoPena(Date terminoPena) {
        this.terminoPena = terminoPena;
    }
    public void setUnPrisional(String unPrisional) {
        this.unPrisional = unPrisional;
    }
    }

