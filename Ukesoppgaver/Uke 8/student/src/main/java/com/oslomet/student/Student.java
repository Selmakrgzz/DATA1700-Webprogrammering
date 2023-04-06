package com.oslomet.student;

public class Student {
    private String navn;
    private String studentnr;

    public Student(String navn, String studentnr){
        this.navn = navn;
        this.studentnr = studentnr;
    }
    public Student(){};

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudentnr() {
        return studentnr;
    }

    public void setStudentnr(String studentnr) {
        this.studentnr = studentnr;
    }
}
