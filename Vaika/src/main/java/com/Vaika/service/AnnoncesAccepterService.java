package com.Vaika.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.AnnoncesAccepter;
import com.Vaika.repository.AnnoncesAccepterRepository;



@Service
public class AnnoncesAccepterService {
    @Autowired
    private AnnoncesAccepterRepository annoncesAccepterRepository; 

    public List<AnnoncesAccepter> findAll(){
        return annoncesAccepterRepository.findAll();
    }

    public AnnoncesAccepter findById (Long id){
        return annoncesAccepterRepository.findById(id).orElse(null);
    }

    public AnnoncesAccepter save (AnnoncesAccepter a){
        return annoncesAccepterRepository.save(a);
    }
    
    public void deleteById (Long id){
        annoncesAccepterRepository.deleteById(id);
    }
}
