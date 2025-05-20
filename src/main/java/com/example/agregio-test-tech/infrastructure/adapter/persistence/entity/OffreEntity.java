package com.example.agregiotest.infrastructure.adapter.persistence.entity;

import com.example.agregiotest.domain.enums.Marche;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Table(name = "offre")
public class OffreEntity {
    
    @Id
    private Long id;
    
    @Enumerated(EnumType.STRING)
    private Marche marche;
    
    @OneToMany(mappedBy = "offre", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BlocHoraireEntity> blocs = new HashSet<>();
}
