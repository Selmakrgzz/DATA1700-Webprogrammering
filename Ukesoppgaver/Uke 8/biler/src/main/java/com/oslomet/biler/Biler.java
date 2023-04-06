package com.oslomet.biler;

public class Biler {
    private String merke;
    private String modell;
    private int aarmodell;
    private String hjuldrift;

    public Biler(String merke, String modell, int aarmodell, String hjuldrift){
        this.merke = merke;
        this.modell = modell;
        this.aarmodell = aarmodell;
        this.hjuldrift = hjuldrift;
    }
    public Biler(){}

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getAarmodell() {
        return aarmodell;
    }

    public void setAarmodell(int aarmodell) {
        this.aarmodell = aarmodell;
    }

    public String getHjuldrift() {
        return hjuldrift;
    }

    public void setHjuldrift(String hjuldrift) {
        this.hjuldrift = hjuldrift;
    }
}
