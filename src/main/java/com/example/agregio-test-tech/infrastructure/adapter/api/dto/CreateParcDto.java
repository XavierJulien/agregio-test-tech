package com.example.agregiotest.infrastructure.adapter.api.dto;

import com.example.agregiotest.domain.enums.ParcType;
import lombok.Data;

@Data
public class CreateParcDto {
    private String nom;
    private ParcType type;
}
