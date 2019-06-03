package org.greta.controller;


import org.greta.repository.OffreEmploiRepository;
import org.greta.entites.OffreEmploi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/offreemploi/")
public class OffreEmploiController {
    @Autowired
    private OffreEmploiRepository offreEmploiRepository;


    @PostMapping("/saveOffreEmploi")
    public int saveOffreEmploi(@RequestBody List<OffreEmploi> offreEmplois){
            offreEmploiRepository.save(offreEmplois);
             return offreEmplois.size();
    }
    @GetMapping("/findAllOffres")
    public Iterable<OffreEmploi> findAllOffres (){
            return offreEmploiRepository.findAll();

    }

    @GetMapping("/findByContenuOffre/{contenuOffre}")
    public List<OffreEmploi> findByContenuOffre(@PathVariable String contenuOffre){
        return offreEmploiRepository.findByContenuOffre(contenuOffre);
    }


}
