package com.Vaika.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.Vaika.modele.Utilisateur;
import com.Vaika.service.UtilisateurService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping
    public List<Utilisateur> findAll() {
        return utilisateurService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Utilisateur> findById(@PathVariable Long id) {
        return utilisateurService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Utilisateur create(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    @PutMapping
    public Utilisateur update(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.save(utilisateur);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        utilisateurService.deleteById(id);
    }
}

