package com.example.agregiotest.domain.repository;

import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.model.Parc;
import java.util.Set;

public interface ParcRepository {
    Parc save(Parc parc);
    
    Set<Parc> findAllByIds(Set<Long> ids);
    
    Set<Parc> findAllByMarche(Marche marche);
    
}
