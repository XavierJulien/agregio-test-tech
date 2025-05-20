package com.example.agregiotest.infrastructure.adapter.persistence.entity;

import com.example.agregiotest.domain.enums.ParcType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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
@Table(name = "parc")
public class ParcEntity {
    
    @Id
    private Long id;
    
    @Column(nullable = false)
    private String nom;
    
    @Enumerated(EnumType.STRING)
    private ParcType type;
    
    @ManyToMany(mappedBy = "parcs")
    private Set<BlocHoraireEntity> blocs = new HashSet<>();
}
