package com.example.agregiotest.domain.service;

import com.example.agregiotest.application.command.CreateOffreCommand;
import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.model.Offre;
import java.util.Set;

public interface OffreService {
    Offre createOffre(CreateOffreCommand createOffreCommand);
    Set<Offre> getOffresByMarche(Marche marche);
}
