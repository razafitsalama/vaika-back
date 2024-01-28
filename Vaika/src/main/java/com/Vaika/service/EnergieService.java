package com.Vaika.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.Energie;
import com.Vaika.repository.EnergieRepository;



@Service
public class EnergieService {
    
    @Autowired 
    public EnergieRepository energieRepository;

    public List<Energie> findAll() {
        return energieRepository.findAll();
    }

    public Optional<Energie> findById(Long id) {
        return energieRepository.findById(id);
    }

    public Energie save(Energie e) {
        return energieRepository.save(e);
    }

    public void deleteById(Long id) {
        energieRepository.deleteById(id);
    }
}
