package com.Vaika.service;



import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vaika.modele.AnnoncesRefuser;
import com.Vaika.repository.AnnoncesRefuserRepository;

@Service
public class AnnoncesRefuserService {
    @Autowired
    private AnnoncesRefuserRepository annoncesRefuserRepository ; 

    public List<AnnoncesRefuser> findAll(){
        return annoncesRefuserRepository.findAll(); 
    }

    public AnnoncesRefuser findById(Long id){
        return annoncesRefuserRepository.findById(id).orElse(null);
    }

    public AnnoncesRefuser save(AnnoncesRefuser an){
        return annoncesRefuserRepository.save(an);
    }

    public void deleteById(Long id){
        annoncesRefuserRepository.deleteById(id);
    }
}
