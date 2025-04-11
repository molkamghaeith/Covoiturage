package com.example.covoiturage.entity;

import java.util.Date;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Data
@Entity
@ToString(exclude = {"user", "reservations", "commantaires"})
public class Annonce {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer annonceId;

    private Float prix;
    private int nombre;
    private String depart;
    private String arrive;

    @Temporal(TemporalType.DATE)
    private Date dateA;
    @OneToMany(mappedBy = "annonce", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "annonce", cascade = CascadeType.ALL)
    private List<Commantaire> commantaires; // Nom corrigé

    @ManyToOne
    @JsonIgnoreProperties("annonces")
    private User user;

    public void setAnnonceId(Integer annonceId) {
        this.annonceId = annonceId;
    }
    public Float getPrix() {
        return prix;
    }
    public void setPrix(Float prix) {
        this.prix = prix;
    }
    public int getNombre() {
        return nombre;
    }
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
    public String getDepart() {
        return depart;
    }
    public void setDepart(String depart) {
        this.depart = depart;
    }
    public String getArrive() {
        return arrive;
    }
    public void setArrive(String arrive) {
        this.arrive = arrive;
    }
    public Date getDateA() {
        return dateA;
    }
    public void setDateA(Date dateA) {
        this.dateA = dateA;

    }


}