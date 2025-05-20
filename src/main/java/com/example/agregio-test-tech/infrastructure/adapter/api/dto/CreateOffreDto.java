package com.example.agregiotest.infrastructure.adapter.api.dto;

import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.model.BlocHoraire;
import java.util.Set;
import lombok.Data;

@Data
public class CreateOffreDto {
    private Marche marche;
    private Set<CreateBlocHoraireDto> blocHoraire;
}
