package com.example.agregiotest.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BlocHoraire {
    private Long id;
    private LocalDateTime heureDebut;
    private LocalDateTime heureFin;
    private BigDecimal puissanceMw;
    private BigDecimal prixPlancher;
    private Set<Parc> parcs;
}
