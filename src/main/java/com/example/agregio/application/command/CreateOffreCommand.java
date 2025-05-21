package com.example.agregio.application.command;

import com.example.agregio.domain.enums.Marche;
import jakarta.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.antlr.v4.runtime.misc.NotNull;

@Getter
@AllArgsConstructor
public class CreateOffreCommand {
    @NotNull
    private Marche marche;
    @Size(min = 1)
    private Set<CreateBlocHoraireCommand> blocs;
}
