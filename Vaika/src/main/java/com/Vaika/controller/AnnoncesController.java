package com.Vaika.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.Vaika.modele.Annonces;
import com.Vaika.service.AnnoncesService;

import java.util.List;

@RestController
@RequestMapping("/annonces")
@CrossOrigin(origins = "http://localhost:3000")
public class AnnoncesController {

    @Autowired
    private AnnoncesService annoncesService;

    @GetMapping
    public List<Annonces> findAll() {
        return annoncesService.findAll();
    }

    @GetMapping("/nonLus")
    public List<Annonces> getAnnoncesNonLus() {
        return annoncesService.getAnnoncesNonLus();
    }

    @GetMapping("/{id}")
    public Annonces findById(@PathVariable Long id) {
        return annoncesService.findById(id);
    }

    // create a book
    @ResponseStatus(HttpStatus.CREATED) // 201
    @PostMapping
    public Annonces create(@RequestBody Annonces book) {
        return annoncesService.save(book);
    }

    // update a book
    @PutMapping
    public Annonces update(@RequestBody Annonces book) {
        return annoncesService.save(book);
    }

    // delete a book
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        annoncesService.deleteById(id);
    }

}
