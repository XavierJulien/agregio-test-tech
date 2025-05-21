package com.example.agregio.application.mapper;

import com.example.agregio.domain.model.BlocHoraire;
import com.example.agregio.infrastructure.adapter.api.dto.CreateBlocHoraireDto;
import java.util.Set;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BlocHoraireMapper {
    
    @Mapping(target = "parcs", ignore = true)
    BlocHoraire toDomain(CreateBlocHoraireDto dto);
    
    @Mapping(target = "parcs", ignore = true)
    Set<BlocHoraire> toDomain(Set<CreateBlocHoraireDto> dtos);
}
