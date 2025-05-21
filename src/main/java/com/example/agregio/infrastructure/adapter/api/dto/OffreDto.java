package com.example.agregio.infrastructure.adapter.api.dto;

import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.model.BlocHoraire;
import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OffreDto {
    private Long id;
    private Marche marche;
    private Set<BlocHoraire> blocs;
}
