package com.example.covoiturage.entity;




import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@ToString(exclude = {"user", "annonce"})
public class Commantaire{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String note;
    @ManyToOne
    @JoinColumn(name = "annonce_id")
    private Annonce annonce;
    @ManyToOne
    private User user;


    }