package com.example.agregio.infrastructure.adapter.persistence;

import com.example.agregio.infrastructure.adapter.persistence.entity.OffreEntity;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OffreJpaRepository extends JpaRepository<OffreEntity, Long> {
    
    Set<OffreEntity> findAllByMarche(String marche);
}
