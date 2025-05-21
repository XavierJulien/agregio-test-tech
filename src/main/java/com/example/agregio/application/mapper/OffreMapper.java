package com.example.agregio.application.mapper;

import com.example.agregio.domain.model.Offre;
import com.example.agregio.infrastructure.adapter.api.dto.OffreDto;
import com.example.agregio.infrastructure.adapter.persistence.entity.OffreEntity;
import java.util.Set;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface OffreMapper {
    
    OffreMapper INSTANCE = Mappers.getMapper(OffreMapper.class);
    
    OffreDto toDto(Offre offre);
    
    Set<OffreDto> toDto(Set<Offre> offres);
    
    Offre toDomain(OffreEntity todoEntity);
    
    Set<Offre> toDomain(Set<OffreEntity> todoEntities);
    
    OffreEntity toEntity(Offre offre);
}
