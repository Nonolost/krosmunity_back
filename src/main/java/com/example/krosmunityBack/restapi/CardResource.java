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

    @Autowired
    CardService cardService;

    @GetMapping
    public List fetch() {
        return cardService.fetchWithSpecs();
    }

    @GetMapping("/generate")
    public void create() {
        cardService.create(new CardEntity(1, 1, "name", "description", 1, 1, 1, 1, true, "family", 0, 2, false, "imageLink", 2));
        cardService.create(new CardEntity(2, 1, "name", "description", 1, 1, 1, 1, false, "family", 0, 2, false, "imageLink", 2));
    }

}
