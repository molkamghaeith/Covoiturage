package com.example.covoiturage.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.covoiturage.entity.Reservation;

@Repository 
public interface ReservationRepository extends JpaRepository <Reservation,Integer>
 {
    
}
