package com.example.krosmunityBack.domain.mapper;

import com.example.krosmunityBack.domain.CardEntity;
import com.example.krosmunityBack.domain.DTO.CardDTO;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

@Mapper(ignoreMissingProperties = true)
public interface CardMapper {

    List<CardDTO> asCardDTO(List<CardEntity> card);

}

