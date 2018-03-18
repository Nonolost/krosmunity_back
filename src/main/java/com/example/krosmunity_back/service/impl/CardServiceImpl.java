package com.example.krosmunity_back.service.impl;

import com.example.krosmunity_back.repository.CardRepository;
import com.example.krosmunity_back.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService{

    @Autowired
    CardRepository cardRepository;

}
