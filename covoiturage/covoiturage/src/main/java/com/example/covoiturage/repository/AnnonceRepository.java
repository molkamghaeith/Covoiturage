package com.example.covoiturage.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.covoiturage.entity.Annonce;

@Repository 
public interface AnnonceRepository extends JpaRepository <Annonce,Integer>
 {
    
}
