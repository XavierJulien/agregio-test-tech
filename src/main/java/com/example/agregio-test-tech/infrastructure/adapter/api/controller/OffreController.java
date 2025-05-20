package com.example.agregiotest.infrastructure.adapter.api.controller;

import com.example.agregiotest.application.command.CreateBlocHoraireCommand;
import com.example.agregiotest.application.command.CreateOffreCommand;
import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.service.OffreService;
import com.example.agregiotest.infrastructure.adapter.api.dto.CreateBlocHoraireDto;
import com.example.agregiotest.infrastructure.adapter.api.dto.CreateOffreDto;
import com.example.agregiotest.infrastructure.adapter.api.dto.OffreDto;
import com.example.agregiotest.application.mapper.OffreMapper;
import jakarta.validation.Valid;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/offres")
public class OffreController {

    private final OffreService offreService;
    private final OffreMapper offreMapper;
    
    public OffreController(OffreService offreService, OffreMapper offreMapper) {
        this.offreService = offreService;
        this.offreMapper = offreMapper;
    }
    
    @PostMapping
    public OffreDto createOffre(@Valid @RequestBody CreateOffreDto createOffreDto){
        CreateOffreCommand command = mapCreateOffreCommand(createOffreDto);
        
        return offreMapper.toDto(offreService.createOffre(command));
    }
    
    @GetMapping
    public Set<OffreDto> getOffresByMarche(@RequestParam("marche") Marche marche){
        return offreMapper.toDto(offreService.getOffresByMarche(marche));
    }
    
    private CreateOffreCommand mapCreateOffreCommand(CreateOffreDto dto) {
        Set<CreateBlocHoraireCommand> blocCommands = dto.getBlocHoraire().stream()
                                                        .map(this::mapCreateBlocHoraireCommand)
                                                        .collect(Collectors.toSet());
        
        return new CreateOffreCommand(dto.getMarche(), blocCommands);
    }
    
    private CreateBlocHoraireCommand mapCreateBlocHoraireCommand(CreateBlocHoraireDto dto) {
        return new CreateBlocHoraireCommand(
            dto.getHeureDebut(),
            dto.getHeureFin(),
            dto.getPuissanceMw(),
            dto.getPrixPlancher(),
            dto.getParcIds()
        );
    }
}
