package com.example.agregiotest.application.service;

import com.example.agregiotest.application.command.CreateOffreCommand;
import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.model.BlocHoraire;
import com.example.agregiotest.domain.model.Offre;
import com.example.agregiotest.domain.model.Parc;
import com.example.agregiotest.domain.repository.OffreRepository;
import com.example.agregiotest.domain.repository.ParcRepository;
import com.example.agregiotest.domain.service.OffreService;
import com.example.agregiotest.domain.service.ParcService;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class OffreServiceImpl implements OffreService {
    
    private final OffreRepository offreRepository;
    private final ParcRepository parcRepository;
    
    public OffreServiceImpl(OffreRepository offreRepository, ParcRepository parcRepository) {
        this.offreRepository = offreRepository;
        this.parcRepository = parcRepository;
    }
    
    @Override
    public Offre createOffre(CreateOffreCommand command) {
        Set<BlocHoraire> blocs = mapToBlocHoraire(command);
        
        Offre offre = Offre.builder()
                           .marche(command.getMarche())
                           .blocs(blocs)
                           .build();
        
        return offreRepository.save(offre);
    }
    
    @Override
    public Set<Offre> getOffresByMarche(Marche marche) {
        return offreRepository.findAllByMarche(marche);
    }
    
    private Set<BlocHoraire> mapToBlocHoraire(CreateOffreCommand offreCommand) {
        return offreCommand.getBlocs().stream()
                      .map(command -> {
                          Set<Parc> parcs = parcRepository.findAllByIds(command.getParcIds());
                          return BlocHoraire.builder()
                                            .heureDebut(command.getHeureDebut())
                                            .heureFin(command.getHeureFin())
                                            .puissanceMw(command.getPuissanceMw())
                                            .prixPlancher(command.getPrixPlancher())
                                            .parcs(parcs)
                                            .build();
                      })
                      .collect(Collectors.toSet());
    }
}
