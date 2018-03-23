package com.example.krosmunityBack.restapi;

import com.example.krosmunityBack.domain.CardFilter;
import com.example.krosmunityBack.domain.DTO.CardDTO;
import com.example.krosmunityBack.domain.mapper.CardMapper;
import com.example.krosmunityBack.service.CardService;
import fr.xebia.extras.selma.Selma;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(CardResource.CARD_BASE_PATH)
public class CardResource {


    public static final String CARD_BASE_PATH = "/card";
    private CardMapper mapper = Selma.builder(CardMapper.class).build();

    private CardService cardService;

    @Autowired
    public CardResource(CardService cardService) {
        this.cardService = cardService;
    }

    @PostMapping
    public List<CardDTO> fetch(@RequestBody CardFilter cardFilter) {
        System.out.println(cardService.fetchWithSpecs(cardFilter).getContent());

        return mapper.asCardDTO(cardService.fetchWithSpecs(cardFilter).getContent());
    }

}
