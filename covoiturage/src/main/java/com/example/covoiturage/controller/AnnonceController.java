package com.example.covoiturage.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.covoiturage.entity.Annonce;
import com.example.covoiturage.serivce.AnnonceService;

@RestController
public class AnnonceController {
    @Autowired
    AnnonceService annonceService;
    @PostMapping("/addAnnonceAffectUser/{userId}")
    public ResponseEntity<Annonce> addSondageToUser(@RequestBody Annonce annonce, @PathVariable("userId") Integer userId) {
        Annonce savedAnnonce = annonceService.addAnnonce(annonce, userId);
        System.out.println("Saved Annonce: " + savedAnnonce);
        return ResponseEntity.ok(savedAnnonce);
    }
    @PutMapping("/updateAnnonce/{annonceId}")
    public Annonce updateAnnonce(@RequestBody Annonce annonce,@PathVariable Integer annonceId) {
        return annonceService.updateAnnonce(annonce,annonceId);
    }

    
}
