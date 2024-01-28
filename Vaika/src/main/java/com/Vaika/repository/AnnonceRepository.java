package com.Vaika.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Vaika.modele.Annonces;



public interface AnnonceRepository extends JpaRepository<Annonces, Long> {
    @Query(value = "select *from  AnnoncesNonLues", nativeQuery = true)
    List<Annonces> getAnnoncesNonLus();
}
