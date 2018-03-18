package com.example.krosmunity_back.restapi;

import com.example.krosmunity_back.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(CardResource.CARD_BASE_PATH)
public class CardResource {


        public static final String CARD_BASE_PATH = "/card";

        @Autowired
        CardService cardService;
}
