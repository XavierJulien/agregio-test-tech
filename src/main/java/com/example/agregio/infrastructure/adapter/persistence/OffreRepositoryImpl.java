package com.example.agregio.infrastructure.adapter.persistence;

import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.model.Offre;
import com.example.agregio.domain.repository.OffreRepository;
import com.example.agregio.application.mapper.OffreMapper;
import java.util.Set;
import org.springframework.stereotype.Repository;

@Repository
public class OffreRepositoryImpl implements OffreRepository {
    
    private final OffreJpaRepository offreJpaRepositoryAdapter;
    private final OffreMapper offreMapper;
    
    public OffreRepositoryImpl(OffreJpaRepository offreJpaRepositoryAdapter, OffreMapper offreMapper) {
        this.offreJpaRepositoryAdapter = offreJpaRepositoryAdapter;
        this.offreMapper = offreMapper;
    }
    
    @Override
    public Offre save(Offre offre) {
        return offreMapper.toDomain(offreJpaRepositoryAdapter.save(offreMapper.toEntity(offre)));
    }
    
    @Override
    public Set<Offre> findAllByMarche(Marche marche) {
        return offreMapper.toDomain(offreJpaRepositoryAdapter.findAllByMarche(marche.toString()));
    }
}
