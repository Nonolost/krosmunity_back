package com.example.krosmunityBack.restapi;

import com.example.krosmunityBack.domain.DTO.TierListDTO;
import com.example.krosmunityBack.domain.mapper.TierListMapper;
import com.example.krosmunityBack.service.TierListService;
import fr.xebia.extras.selma.Selma;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(TierListResource.TIER_LIST_BASE_PATH)
public class TierListResource {

    public static final String TIER_LIST_BASE_PATH = "/tierList";

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    TierListMapper tierListMapper = Selma.builder(TierListMapper.class).build();

    @Autowired
    TierListService tierListService;

    @GetMapping
    public List<TierListDTO> fetch() {
        LOGGER.debug("[GET-tierList]");
        return tierListMapper.asTierListDTO(tierListService.findAll());
    }


}
