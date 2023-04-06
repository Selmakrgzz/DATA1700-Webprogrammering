package com.oslomet.biler;

//POJO
public class Biler extends Object {
    private String merke;
    private String farge;
    private int modell;

    public Biler(String merke, String farge, int modell){
        this.merke = merke;
        this.farge = farge;
        this.modell = modell;
    }
    public Biler(){};

    public String getMerke() {
        return merke;
    }
    public void setMerke(String merke){
        this.merke=merke;
    }
    public String getFarge(){
        return farge;
    }
    public void setFarge(String farge) {
        this.farge = farge;
    }
    public int getModell() {
        return modell;
    }
    public void setModell(int modell) {
        this.modell = modell;
    }
    @Override
    public String toString() {
        return "Bil{" +
                "merke='" + merke + '\'' +
                ", farge=" + farge + '\'' +
                ", modell=" +modell+
                '}';
    }
}
