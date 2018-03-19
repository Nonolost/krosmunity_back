package com.example.krosmunityBack.restapi;

import com.example.krosmunityBack.domain.CardEntity;
import com.example.krosmunityBack.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(CardResource.CARD_BASE_PATH)
public class CardResource {


    public static final String CARD_BASE_PATH = "/card";


    private CardService cardService;

    @Autowired
    public CardResource(CardService cardService) {
        this.cardService = cardService;
    }

    @GetMapping
    public List<CardEntity> fetch() {
        return cardService.fetchWithSpecs();
    }


}
