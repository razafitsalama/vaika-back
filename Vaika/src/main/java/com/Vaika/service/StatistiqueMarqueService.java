package com.Vaika.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.StatistiqueMarque;
import com.Vaika.repository.StatistiqueMarqueRepository;



@Service
public class StatistiqueMarqueService {

    private StatistiqueMarqueRepository statiqueMarqueRepository;

    @Autowired
    public StatistiqueMarqueService(StatistiqueMarqueRepository statiqueMarqueRepository) {
        this.statiqueMarqueRepository = statiqueMarqueRepository;
    }

    public List<StatistiqueMarque> getAllIdMarqueVendu() {
        return statiqueMarqueRepository.getAllIdMarqueVendu();
    }

    public List<StatistiqueMarque> getAll() {
        return statiqueMarqueRepository.findAll();
    }
}