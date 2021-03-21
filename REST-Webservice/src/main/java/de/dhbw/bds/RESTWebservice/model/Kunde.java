package de.dhbw.bds.RESTWebservice.model;

public class Kunde {
    private String name;
    private String adresse;
    private String letzterAnruf;

    //Constructor
    public Kunde(String name, String adresse, String letzterAnruf) {
        this.name = name;
        this.adresse = adresse;
        this.letzterAnruf = letzterAnruf;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLetzterAnruf() {
        return letzterAnruf;
    }

    public void setLetzterAnruf(String letzterAnruf) {
        this.letzterAnruf = letzterAnruf;
    }
}