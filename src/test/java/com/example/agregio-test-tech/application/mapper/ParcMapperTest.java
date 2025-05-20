package com.example.agregiotest.application.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.agregiotest.domain.enums.Marche;
import com.example.agregiotest.domain.enums.ParcType;
import com.example.agregiotest.domain.model.BlocHoraire;
import com.example.agregiotest.domain.model.Parc;
import com.example.agregiotest.infrastructure.adapter.api.dto.ParcDto;
import com.example.agregiotest.infrastructure.adapter.persistence.entity.ParcEntity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ParcMapperTest {
    
    private final ParcMapper parcMapper = ParcMapper.INSTANCE;
    
    @Nested
    @DisplayName("to dto")
    class toDto {
        @Test
        void should_map_dto_from_domain() {
            // Given
            Parc parc = Parc.builder()
                            .id(1L)
                            .nom("Parc test")
                            .type(ParcType.EOLIEN)
                            .build();
            
            // When
            var result = parcMapper.toDto(parc);
            
            // Then
            assertParcDto(result, 1, "Parc test", ParcType.EOLIEN);
        }
        
        @Test
        void should_map_dto_set_from_domain() {
            // Given
            Parc parc = Parc.builder()
                            .id(1L)
                            .nom("Parc test")
                            .type(ParcType.EOLIEN)
                            .build();
            
            // When
            var result = parcMapper.toDto(Set.of(parc));
            
            // Then
            assertParcDto(result.stream().findFirst().get(), 1, "Parc test", ParcType.EOLIEN);
        }
    }
    
    @Nested
    @DisplayName("to domain")
    class toDomain {
        
        @Test
        void should_map_domain_list_from_entities() {
            // Given
            ParcEntity parcDto = ParcEntity.builder()
                                           .id(1L)
                                           .nom("Parc test")
                                           .type(ParcType.EOLIEN)
                                           .build();
            
            // When
            var result = parcMapper.toDomain(Set.of(parcDto));
            
            // Then
            assertParc(result.stream().findFirst().get(), 1, "Parc test", ParcType.EOLIEN);
        }
        
        @Test
        void should_map_domain_from_entity() {
            //Given
            ParcEntity parcEntity = ParcEntity.builder()
                                              .id(1L)
                                              .nom("Parc test")
                                              .type(ParcType.EOLIEN)
                                              .build();
            
            // When
            var result = parcMapper.toDomain(parcEntity);
            
            // Then
            assertParc(result, 1, "Parc test", ParcType.EOLIEN);
        }
    }
    
    @Nested
    @DisplayName("to entity")
    class toEntity {
        @Test
        void should_map_entity_from_domain() {
            // Given
            Parc parc = Parc.builder()
                            .id(1L)
                            .nom("Parc test")
                            .type(ParcType.EOLIEN)
                            .build();
            
            // When
            var result = parcMapper.toEntity(parc);
            
            // Then
            assertParcEntity(result, 1, "Parc test", ParcType.EOLIEN);
        }
    }
    
    private void assertParcDto(ParcDto parcDto, int id, String nom, ParcType type) {
        assertEquals(id, parcDto.getId());
        assertEquals(nom, parcDto.getNom());
        assertEquals(type, parcDto.getType());
    }
    
    private void assertParc(Parc parc, int id, String nom, ParcType type) {
        assertEquals(id, parc.getId());
        assertEquals(nom, parc.getNom());
        assertEquals(type, parc.getType());
    }
    
    private void assertParcEntity(ParcEntity parcEntity, int id, String nom, ParcType type) {
        assertEquals(id, parcEntity.getId());
        assertEquals(nom, parcEntity.getNom());
        assertEquals(type, parcEntity.getType());
    }
    
    

}
