package com.Vaika.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vaika.modele.StatistiquePrix;
import com.Vaika.service.StatistiquePrixService;



@RestController
@RequestMapping("/StatPrix")
public class StatistiquePrixController {
    @Autowired
    private StatistiquePrixService prixService;

    @GetMapping
    public  List<StatistiquePrix> getAllPrix(){
        return prixService.getAllPrix();
    }
    
}
