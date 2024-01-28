package com.Vaika.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.Utilisateur;
import com.Vaika.repository.UtilisateurRepository;



@Service
public class UtilisateurService {
    
    @Autowired
    private UtilisateurRepository utilisateurRepository;

    public List<Utilisateur> findAll() {
        return utilisateurRepository.findAll();
    }

    public Optional<Utilisateur> findById(Long id) {
        return utilisateurRepository.findById(id);
    }

    public Utilisateur save(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    public void deleteById(Long id) {
        utilisateurRepository.deleteById(id);
    }
    public Utilisateur findByEmail(String email) {
        return utilisateurRepository.findByEmail(email);
    }
    public Optional<Utilisateur> findByEmailAndPassword(String email, String password) {
        return utilisateurRepository.findByEmailAndPasswords(email, password);
    }
}
