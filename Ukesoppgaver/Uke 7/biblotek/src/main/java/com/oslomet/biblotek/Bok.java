package com.oslomet.biblotek;

public class Bok {
    private String tittel;
    private String sjanger;
    private String forfatter;
    private int sider;
    private String iSBN;

    public Bok(String tittel, String sjanger, String forfatter, int sider, String iSBN){
        this.tittel = tittel;
        this.sjanger = sjanger;
        this.forfatter = forfatter;
        this.sider = sider;
        this.iSBN = iSBN;
    }
    public Bok(){}

    public String getTittel(){
        return tittel;
    }
    public void setTittel(String tittel){
        this.tittel = tittel;
    }

    public String getSjanger() {
        return sjanger;
    }

    public void setSjanger(String sjanger) {
        this.sjanger = sjanger;
    }

    public String getForfatter() {
        return forfatter;
    }

    public void setForfatter(String forfatter) {
        this.forfatter = forfatter;
    }

    public int getSider() {
        return sider;
    }

    public void setSider(int sider) {
        this.sider = sider;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }
}
