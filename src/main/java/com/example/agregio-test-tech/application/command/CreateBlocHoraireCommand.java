package com.example.agregiotest.application.command;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CreateBlocHoraireCommand {
    @NotNull
    private LocalDateTime heureDebut;
    @NotNull
    private LocalDateTime heureFin;
    @DecimalMin("0.0")
    private BigDecimal puissanceMw;
    @DecimalMin("0.0")
    private BigDecimal prixPlancher;
    @Size(min = 1)
    private Set<Long> parcIds;
}
