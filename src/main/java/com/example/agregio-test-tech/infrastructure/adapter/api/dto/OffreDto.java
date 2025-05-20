package com.example.agregiotest.infrastructure.adapter.api.dto;

import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.model.BlocHoraire;
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
