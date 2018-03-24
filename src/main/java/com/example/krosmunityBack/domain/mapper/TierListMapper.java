package com.example.krosmunityBack.domain.mapper;

import com.example.krosmunityBack.domain.DTO.TierListDTO;
import com.example.krosmunityBack.domain.TierListEntity;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

@Mapper(ignoreMissingProperties = true)
public interface TierListMapper {
    List<TierListDTO> asTierListDTO(List<TierListEntity> tierListEntities);
}
