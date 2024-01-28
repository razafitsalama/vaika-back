package com.Vaika.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.StatistiqueDate;
import com.Vaika.repository.StatistiqueDateRepository;


@Service
public class StatistiqueDateService {
    private StatistiqueDateRepository statistiqueDateRepository;
    @Autowired
    public StatistiqueDateService(StatistiqueDateRepository statistiqueDateRepository) {
        this.statistiqueDateRepository = statistiqueDateRepository;
    }
    public List<StatistiqueDate> getAllDate(){
        return statistiqueDateRepository.getAllDate();
    }
    public List<StatistiqueDate> getAll(){
        return statistiqueDateRepository.findAll();
    }


}
