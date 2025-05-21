package com.example.agregio.infrastructure.adapter.api.dto;

import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.model.BlocHoraire;
import java.util.Set;
import lombok.Data;

@Data
public class CreateOffreDto {
    private Marche marche;
    private Set<CreateBlocHoraireDto> blocHoraire;
}
