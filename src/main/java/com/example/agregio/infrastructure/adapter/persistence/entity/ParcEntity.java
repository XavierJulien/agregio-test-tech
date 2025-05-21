package com.example.agregio.infrastructure.adapter.persistence.entity;

import com.example.agregio.domain.enums.ParcType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "parc_seq")
    @SequenceGenerator(name = "parc_seq", sequenceName = "PARC_SEQ", allocationSize = 1)
    private Long id;
    
    @Column(nullable = false)
    private String nom;
    
    @Enumerated(EnumType.STRING)
    private ParcType type;
    
    @ManyToMany(mappedBy = "parcs")
    private Set<BlocHoraireEntity> blocs = new HashSet<>();
}
