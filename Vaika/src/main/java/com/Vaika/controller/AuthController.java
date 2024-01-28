package com.Vaika.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Vaika.modele.Utilisateur;
import com.Vaika.service.UtilisateurService;

@RestController
@RequestMapping("/auth")
@CrossOrigin(origins = "http://localhost:3000")
public class AuthController {

    @Autowired
    private UtilisateurService utilisateurService;

    @GetMapping("/login")
public ResponseEntity<?> authenticateUser(@RequestParam String email, @RequestParam String password) {
    Optional<Utilisateur> utilisateurOptional = utilisateurService.findByEmailAndPassword(email, password);

    if (utilisateurOptional.isPresent()) {
        // L'authentification réussie
        return ResponseEntity.ok("Authentification réussie !");
    } else {
        // L'authentification a échoué
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Email ou mot de passe incorrect");
    }
}

}
