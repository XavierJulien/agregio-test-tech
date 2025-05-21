package com.example.agregio.infrastructure.adapter.persistence;

import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.model.Parc;
import com.example.agregio.domain.repository.ParcRepository;
import com.example.agregio.application.mapper.ParcMapper;
import java.util.Set;
import org.springframework.stereotype.Repository;

@Repository
public class ParcRepositoryImpl implements ParcRepository {
    
    private final ParcJpaRepository parcJpaRepositoryAdapter;
    private final ParcMapper parcMapper;
    
    public ParcRepositoryImpl(ParcJpaRepository parcJpaRepositoryAdapter, ParcMapper parcMapper) {
        this.parcJpaRepositoryAdapter = parcJpaRepositoryAdapter;
        this.parcMapper = parcMapper;
    }
    
    @Override
    public Parc save(Parc parc) {
        return parcMapper.toDomain(parcJpaRepositoryAdapter.save(parcMapper.toEntity(parc)));
    }
    
    @Override
    public Set<Parc> findAllByIds(Set<Long> ids) {
        return parcMapper.toDomain(parcJpaRepositoryAdapter.findParcsById(ids));
    }
    
    @Override
    public Set<Parc> findAllByMarche(Marche marche) {
        return parcMapper.toDomain(parcJpaRepositoryAdapter.findParcsByMarche(marche));
    }
}
