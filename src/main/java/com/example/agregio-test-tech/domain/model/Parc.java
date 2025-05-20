package com.example.agregiotest.domain.model;

import com.example.agregiotest.domain.enums.ParcType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Parc {
    private Long id;
    private String nom;
    private ParcType type;
}
