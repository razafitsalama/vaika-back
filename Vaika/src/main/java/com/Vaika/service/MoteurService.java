package com.Vaika.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.Moteur;
import com.Vaika.repository.MoteurRepository;



@Service
public class MoteurService {
    
    @Autowired
    public MoteurRepository moteurRepository;

    public List<Moteur> findAll() {
        return moteurRepository.findAll();
    }

    public Optional<Moteur> findById(Long id) {
        return moteurRepository.findById(id);
    }

    public Moteur save(Moteur moteur) {
        return moteurRepository.save(moteur);
    }

    public void deleteById(Long id) {
        moteurRepository.deleteById(id);
    }
}
