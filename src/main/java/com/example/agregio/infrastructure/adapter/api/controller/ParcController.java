package com.example.agregio.infrastructure.adapter.api.controller;

import com.example.agregio.application.command.CreateParcCommand;
import com.example.agregio.domain.enums.Marche;
import com.example.agregio.domain.service.ParcService;
import com.example.agregio.infrastructure.adapter.api.dto.CreateParcDto;
import com.example.agregio.infrastructure.adapter.api.dto.ParcDto;
import com.example.agregio.application.mapper.ParcMapper;
import jakarta.validation.Valid;
import java.util.Set;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parcs")
public class ParcController {

    private final ParcService parcService;
    private final ParcMapper parcMapper;
    
    public ParcController(ParcService parcService, ParcMapper parcMapper) {
        this.parcService = parcService;
        this.parcMapper = parcMapper;
    }
    
    @PostMapping
    public ParcDto createParc(@Valid @RequestBody CreateParcDto createParcDto){
        CreateParcCommand command = new CreateParcCommand(createParcDto.getNom(), createParcDto.getType());
        
        return parcMapper.toDto(parcService.createParc(command));
    }
    
    @GetMapping
    public Set<ParcDto> getParcsByMarche(@RequestParam("marche") Marche marche){
        return parcMapper.toDto(parcService.getParcsByMarche(marche));
    }
    
}
