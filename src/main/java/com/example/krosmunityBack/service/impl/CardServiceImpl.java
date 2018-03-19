package com.example.krosmunityBack.service.impl;

import com.example.krosmunityBack.domain.CardEntity;
import com.example.krosmunityBack.repository.CardRepository;
import com.example.krosmunityBack.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.krosmunityBack.specification.CardSpecification.filterBySpell;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public List<CardEntity> fetchWithSpecs() {
        return cardRepository.findAll(filterBySpell(Boolean.TRUE));
    }

    @Override
    public void create(CardEntity card) {
        cardRepository.save(card);
    }
}
