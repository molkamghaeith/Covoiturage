package com.example.covoiturage.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.List;

import com.fasterxml.jackson.annotation.*;
@Entity
@Data
@ToString(exclude = {"annonces", "reservations", "commantaires"})
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private  String username;
    private  String password;
    private  String email;
    private  String phoneNumber;
    @Enumerated(EnumType.STRING)
    private Role role ;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL) // Corrigé : "user" au lieu de "commantaire"
    @JsonIgnore
    private List<Commantaire> commantaires;


    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Reservation> reservations;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonIgnore
    private List<Annonce> annonces;
}