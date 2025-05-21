package com.example.agregio.domain.service;

import com.example.agregio.application.command.CreateOffreCommand;
import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.model.Offre;
import java.util.Set;

public interface OffreService {
    Offre createOffre(CreateOffreCommand createOffreCommand);
    Set<Offre> getOffresByMarche(Marche marche);
}
