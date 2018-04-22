package com.example.krosmunityBack.restapi;

import com.example.krosmunityBack.domain.DTO.CodeDTO;
import com.example.krosmunityBack.domain.mapper.CodeMapper;
import com.example.krosmunityBack.service.CodeService;
import fr.xebia.extras.selma.Selma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(CodeResource.CODE_BASE_PATH)
public class CodeResource {

    public static final String CODE_BASE_PATH = "/code";

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CodeService codeService;

    private CodeMapper mapper = Selma.builder(CodeMapper.class).build();

    @GetMapping
    public List<CodeDTO> fetch() {
        LOGGER.debug("[GET-code]");
        return mapper.asCodeDTO(codeService.findAllActiveCodes());
    }

}
