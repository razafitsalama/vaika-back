package com.Vaika.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.Vaika.modele.Categorie;
import com.Vaika.service.CategorieService;

@RestController
@RequestMapping("/categorie")
public class CategorieController {

    @Autowired
    private CategorieService categorieService;

    @GetMapping
    public List<com.Vaika.modele.Categorie> findAll() {
        return categorieService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Categorie> findById(@PathVariable Long id) {
        return categorieService.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Categorie create(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }

    @PutMapping
    public Categorie update(@RequestBody Categorie categorie) {
        return categorieService.save(categorie);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        categorieService.deleteById(id);
    }
}
