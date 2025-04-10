package com.example.covoiturage.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.covoiturage.entity.Commantaire;

@Repository 
public interface CommantaireRepository extends JpaRepository <Commantaire,Integer>
 {
    
}
