package com.example.agregiotest.domain.repository;

import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.model.Offre;
import com.example.agregiotest.domain.model.Parc;
import java.util.List;
import java.util.Set;

public interface OffreRepository {
    Offre save(Offre offre);
    
    Set<Offre> findAllByMarche(Marche marche);
}
