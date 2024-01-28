package com.Vaika.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Vaika.modele.Utilisateur;



public interface UtilisateurRepository extends JpaRepository<Utilisateur , Long>{
    Utilisateur findByEmail(String email);
    
        Optional<Utilisateur> findByEmailAndPasswords(String email, String password);
}
