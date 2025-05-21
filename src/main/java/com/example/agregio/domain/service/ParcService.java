package com.example.agregio.domain.service;

import com.example.agregio.application.command.CreateParcCommand;
import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.model.Parc;
import java.util.Set;

public interface ParcService {
    Parc createParc(CreateParcCommand command);
    Set<Parc> getParcsByMarche(Marche marche);
}
