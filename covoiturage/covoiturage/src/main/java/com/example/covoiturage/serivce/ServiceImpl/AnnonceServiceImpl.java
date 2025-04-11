package com.example.covoiturage.serivce.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.covoiturage.entity.Annonce;
import com.example.covoiturage.repository.AnnonceRepository;
import com.example.covoiturage.repository.UserRepository;
import com.example.covoiturage.serivce.AnnonceService;

@Service

public class AnnonceServiceImpl implements AnnonceService{
    @Autowired 
    AnnonceRepository annonceRepository;
    @Autowired
    UserRepository userRepository;
    
    @Override
    public Annonce addAnnonce(Annonce annonce, Integer userId) {
        var user = userRepository.findById(userId).orElseThrow(() -> new RuntimeException("User not found"));
        annonce.setUser(user);
        return annonceRepository.save(annonce);
        
    }

    @Override
    public Annonce updateAnnonce(Annonce annonce, Integer annonceId) {
        annonce.setAnnonceId(annonceId);
        return annonceRepository.save(annonce);
    }
    @Override
    public void deleteAnnonce(Integer annonceId) {
        annonceRepository.deleteById(annonceId);
    }
    @Override
    public List<Annonce> getAllAnnonce() {
        List<Annonce>annonceList =annonceRepository.findAll();
        return annonceList;
    }

    
}
