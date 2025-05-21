package com.example.agregio.domain.repository;

import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.model.Parc;
import java.util.Set;

public interface ParcRepository {
    Parc save(Parc parc);
    
    Set<Parc> findAllByIds(Set<Long> ids);
    
    Set<Parc> findAllByMarche(Marche marche);
    
}
