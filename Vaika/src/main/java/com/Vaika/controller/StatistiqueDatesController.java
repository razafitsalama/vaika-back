package com.Vaika.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vaika.modele.StatistiqueDate;
import com.Vaika.service.StatistiqueDateService;



@RestController
@RequestMapping("/StatDate")
public class StatistiqueDatesController {
    @Autowired
    private StatistiqueDateService dateService;

    @GetMapping
    public List<StatistiqueDate> getAllDates() {
        return dateService.getAllDate();
    }

    
}
