package com.example.agregio.domain.repository;

import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.model.Offre;
import com.example.agregio.domain.model.Parc;
import java.util.List;
import java.util.Set;

public interface OffreRepository {
    Offre save(Offre offre);
    
    Set<Offre> findAllByMarche(Marche marche);
}
