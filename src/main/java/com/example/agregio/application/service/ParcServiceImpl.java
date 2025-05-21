package com.example.agregio.application.service;

import com.example.agregio.application.command.CreateParcCommand;
import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.enums.ParcType;
import com.example.agregio.domain.model.Parc;
import com.example.agregio.domain.repository.ParcRepository;
import com.example.agregio.domain.service.ParcService;
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
