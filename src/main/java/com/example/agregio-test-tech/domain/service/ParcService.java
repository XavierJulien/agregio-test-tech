package com.example.agregiotest.domain.service;

import com.example.agregiotest.application.command.CreateParcCommand;
import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.enums.ParcType;
import com.example.agregiotest.domain.model.Parc;
import java.util.Set;

public interface ParcService {
    Parc createParc(CreateParcCommand command);
    Set<Parc> getParcsByMarche(Marche marche);
}
