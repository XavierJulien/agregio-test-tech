package com.example.agregio.domain.model;

import com.example.agregio.domain.enums.ParcType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Parc {
    private Long id;
    private String nom;
    private ParcType type;
}
