package com.example.agregiotest.infrastructure.adapter.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "bloc_horaire")
public class BlocHoraireEntity {
    
    @Id
    private Long id;
    
    @Column(nullable = false)
    private LocalDateTime heureDebut;
    
    @Column(nullable = false)
    private LocalDateTime heureFin;
    
    @Column(nullable = false)
    private BigDecimal puissanceMw;
    
    @Column(nullable = false)
    private BigDecimal prixPlancher;
    
    @ManyToMany
    @JoinTable(
        name = "bloc_horaire_parc",
        joinColumns = @JoinColumn(name = "bloc_horaire_id"),
        inverseJoinColumns = @JoinColumn(name = "parc_id")
    )
    private Set<ParcEntity> parcs = new HashSet<>();
    
    @ManyToOne
    @JoinColumn(name = "offre_id")
    private OffreEntity offre;
}
