package de.dhbw.bds.RESTWebservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "restaurant")
public class Restaurant<Tisch, Kunde> {
    @Id
    private String id;
    private String name;
    private String adresse;
    private String inhaber;
    private String foodstyle;
    private String email;
    private List<Tisch> tische = new ArrayList<Tisch>();

    //getter and setter
    public List<Tisch> getTische() {
        return tische;
    }

    public void setTische(List<Tisch> tische) {
        this.tische = tische;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getInhaber() {
        return inhaber;
    }

    public void setInhaber(String inhaber) {
        this.inhaber = inhaber;
    }

    public String getFoodstyle() {
        return foodstyle;
    }

    public void setFoodstyle(String foodstyle) {
        this.foodstyle = foodstyle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
