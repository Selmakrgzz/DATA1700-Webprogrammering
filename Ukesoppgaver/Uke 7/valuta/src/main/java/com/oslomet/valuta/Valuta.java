package com.oslomet.valuta;

public class Valuta {
    private String valutaType;
    private double kurs;

    public Valuta(String valutaType, double kurs){
        this.valutaType = valutaType;
        this.kurs = kurs;
    }
    public Valuta(){};

    public String getValuatType(){
        return valutaType;
    }
    public void setValuatType(String valuatType){
        this.valutaType = valuatType;
    }
    public double getKurs(){
        return kurs;
    }
    public void setKurs(double kurs){
        this.kurs = kurs;
    }

}
