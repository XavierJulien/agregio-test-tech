package com.example.agregiotest.application.command;

import com.example.agregiotest.domain.enums.ParcType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateParcCommand {
    @NotNull
    private String nom;
    @NotNull
    private ParcType type;
}
