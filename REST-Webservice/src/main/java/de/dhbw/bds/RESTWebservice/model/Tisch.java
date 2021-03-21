package de.dhbw.bds.RESTWebservice.model;

import java.util.ArrayList;
import java.util.List;

public class Tisch {
    private String name;
    private boolean gebucht;
    private int anzahlPlätze;
    private List<Kunde> kunden = new ArrayList<Kunde>();

    //Constructor
    public Tisch(String name, boolean gebucht, int anzahlPlätze, List<Kunde> kunden) {
        this.name = name;
        this.gebucht = gebucht;
        this.anzahlPlätze = anzahlPlätze;
        this.kunden = kunden;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGebucht() {
        return gebucht;
    }

    public void setGebucht(boolean gebucht) {
        this.gebucht = gebucht;
    }

    public int getAnzahlPlätze() {
        return anzahlPlätze;
    }

    public void setAnzahlPlätze(int anzahlPlätze) {
        this.anzahlPlätze = anzahlPlätze;
    }

    public List<Kunde> getKunden() {
        return kunden;
    }

    public void setKunden(List<Kunde> kunden) {
        this.kunden = kunden;
    }
}