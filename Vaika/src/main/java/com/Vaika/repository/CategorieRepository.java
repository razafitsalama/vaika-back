package com.Vaika.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.Vaika.modele.Categorie;



public interface CategorieRepository extends JpaRepository<Categorie , Long>{
    
}
