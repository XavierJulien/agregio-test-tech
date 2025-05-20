package com.example.agregiotest.application.mapper;

import com.example.agregiotest.domain.model.Offre;
import com.example.agregiotest.infrastructure.adapter.api.dto.OffreDto;
import com.example.agregiotest.infrastructure.adapter.persistence.entity.OffreEntity;
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
