package com.example.covoiturage.serivce;

import com.example.covoiturage.entity.Annonce;

public interface AnnonceService {

    public Annonce addAnnonce(Annonce annonce,Integer userId);

    public Annonce updateAnnonce(Annonce annonce,Integer annonceId);
    
}

