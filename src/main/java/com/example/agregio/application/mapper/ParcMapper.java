package com.example.agregio.application.mapper;

import com.example.agregio.domain.model.Parc;
import com.example.agregio.infrastructure.adapter.api.dto.ParcDto;
import com.example.agregio.infrastructure.adapter.persistence.entity.ParcEntity;
import java.util.Set;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ParcMapper {
    
    ParcMapper INSTANCE = Mappers.getMapper(ParcMapper.class);
    
    ParcDto toDto(Parc parc);

    Set<ParcDto> toDto(Set<Parc> parcs);
    
    Parc toDomain(ParcEntity todoEntity);
    
    Set<Parc> toDomain(Set<ParcEntity> todoEntities);
    
    ParcEntity toEntity(Parc parc);
}
