package com.example.krosmunityBack.domain.mapper;

import com.example.krosmunityBack.domain.CodeEntity;
import com.example.krosmunityBack.domain.DTO.CodeDTO;
import fr.xebia.extras.selma.Mapper;

import java.util.List;

@Mapper(ignoreMissingProperties = true)
public interface CodeMapper {

    List<CodeDTO> asCodeDTO(List<CodeEntity> codeEntityList);

}
