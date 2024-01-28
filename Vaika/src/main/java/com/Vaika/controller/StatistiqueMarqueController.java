package com.Vaika.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vaika.modele.StatistiqueMarque;
import com.Vaika.service.StatistiqueMarqueService;



@RestController
@RequestMapping("/StatMarque")
public class StatistiqueMarqueController {
    @Autowired
    private StatistiqueMarqueService marqueService;

    @GetMapping
    public List<StatistiqueMarque> getAllIdMarqueVendu() {
        return marqueService.getAllIdMarqueVendu();
    }
}
