package com.Vaika.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.StatistiquePrix;
import com.Vaika.repository.StatistiquePrixRepository;



@Service
public class StatistiquePrixService {
    private StatistiquePrixRepository statistiquePrixRepository;
    @Autowired
    public StatistiquePrixService(StatistiquePrixRepository statistiquePrixRepository) {
        this.statistiquePrixRepository = statistiquePrixRepository;
    }
    public List<StatistiquePrix> getAllPrix(){
        return statistiquePrixRepository.getAllPrix();
    }
    public List<StatistiquePrix> getAll(){
        return statistiquePrixRepository.findAll();
    }
    

}
