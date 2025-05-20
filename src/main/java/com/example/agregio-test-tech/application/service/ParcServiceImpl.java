package com.example.agregiotest.application.service;

import com.example.agregiotest.application.command.CreateParcCommand;
import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.enums.ParcType;
import com.example.agregiotest.domain.model.Parc;
import com.example.agregiotest.domain.repository.ParcRepository;
import com.example.agregiotest.domain.service.ParcService;
import java.util.Set;
import org.springframework.stereotype.Service;

@Service
public class ParcServiceImpl implements ParcService {
    
    private final ParcRepository parcRepository;
    
    public ParcServiceImpl(ParcRepository parcRepository) {
        this.parcRepository = parcRepository;
    }
    
    @Override
    public Parc createParc(CreateParcCommand command) {
        Parc parc = Parc.builder()
                        .nom(command.getNom())
                        .type(command.getType())
                        .build();
        
        return parcRepository.save(parc);
    }
    
    @Override
    public Set<Parc> getParcsByMarche(Marche marche) {
        return parcRepository.findAllByMarche(marche);
    }
}
