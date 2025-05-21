package com.example.agregio.infrastructure.adapter.api.dto;

import com.example.agregio.domain.enums.ParcType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ParcDto {
    private Long id;
    private String nom;
    private ParcType type;
}
