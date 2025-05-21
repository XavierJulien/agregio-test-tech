package com.example.agregio.domain.model;

import com.example.agregio.domain.enums.Marche;
import java.util.List;
import java.util.Set;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Offre {
    private Long id;
    private Marche marche;
    private Set<BlocHoraire> blocs;
}
