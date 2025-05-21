package com.example.agregio.infrastructure.adapter.api.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.Data;

@Data
public class CreateBlocHoraireDto {
    
    private LocalDateTime heureDebut;
    private LocalDateTime heureFin;
    private BigDecimal puissanceMw;
    private BigDecimal prixPlancher;
    private Set<Long> parcIds;
}
