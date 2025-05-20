package com.example.agregiotest.domain.model;

import com.example.agregiotest.domain.enums.Marche;
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
