package com.example.agregio.infrastructure.adapter.persistence;

import com.example.agregio.domain.enums.Marche;
import com.example.agregio.infrastructure.adapter.persistence.entity.ParcEntity;
import java.util.Set;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ParcJpaRepository extends JpaRepository<ParcEntity, Long> {
    
    @Query(value = """
        SELECT DISTINCT p
        FROM ParcEntity p
        WHERE p.id IN (:ids)
    """)
    Set<ParcEntity> findParcsById(@Param("ids") Set<Long> ids);
    
    @Query("""
    SELECT DISTINCT p
    FROM ParcEntity p
    JOIN p.blocs b
    JOIN b.offre o
    WHERE o.marche = :marche
""")
    Set<ParcEntity> findParcsByMarche(@Param("marche") Marche marche);
}
