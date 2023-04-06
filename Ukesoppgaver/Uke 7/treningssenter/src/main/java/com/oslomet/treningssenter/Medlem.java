package com.oslomet.treningssenter;

public class Medlem {
    private String navn;
    private int alder;
    private String kjonn;
    private String medlemskap;

    public Medlem (String navn, int alder, String kjonn, String medlemskap){
        this.navn = navn;
        this.alder = alder;
        this.kjonn = kjonn;
        this.medlemskap = medlemskap;
    }
    public Medlem(){
    }

    public String getNavn(){
        return navn;
    }
    public void setNavn(String navn){
        this.navn = navn;
    }
    public int getAlder() {
        return alder;
    }
    public void setAlder(int alder){
        this.alder = alder;
    }
    public String getKjonn(){
        return kjonn;
    }
    public void setKjonn(String kjonn){
        this.kjonn = kjonn;
    }
    public String getMedlemskap(){
        return medlemskap;
    }
    public void setMedlemskap(String medlemskap){
        this.medlemskap = medlemskap;
    }

    @Override
    public String toString(){
        String ut = "Navn: " +navn+ "\n"+
                "Alder: " +alder+ "\n"+
                "Kjønn: " +kjonn+ "\n"+
                "Medlemskap: " +medlemskap;
        return ut;
    }
}
