package com.example.agregio.infrastructure.adapter.api.dto;

import com.example.agregio.domain.enums.ParcType;
import lombok.Data;

@Data
public class CreateParcDto {
    private String nom;
    private ParcType type;
}
