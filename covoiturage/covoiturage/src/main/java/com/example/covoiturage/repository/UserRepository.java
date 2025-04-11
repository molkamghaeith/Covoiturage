package com.example.covoiturage.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.covoiturage.entity.User;


@Repository 
public interface UserRepository extends JpaRepository <User,Integer>
 {
    
}
