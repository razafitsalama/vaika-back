package com.Vaika.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.Marque;
import com.Vaika.repository.MarqueRepository;



@Service
public class MarqueService {
    
    @Autowired
    public MarqueRepository marqueRepository;

    public List<Marque> findAll() {
        return marqueRepository.findAll();
    }

    public Optional<Marque> findById(Long id) {
        return marqueRepository.findById(id);
    }

    public Marque save(Marque marque) {
        return marqueRepository.save(marque);
    }

    public void deleteById(Long id) {
        marqueRepository.deleteById(id);
    }
}
