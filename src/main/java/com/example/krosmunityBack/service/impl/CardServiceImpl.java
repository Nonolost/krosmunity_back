package com.example.krosmunityBack.service.impl;

import com.example.krosmunityBack.domain.CardEntity;
import com.example.krosmunityBack.repository.CardRepository;
import com.example.krosmunityBack.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.krosmunityBack.specification.CardSpecification.*;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public List<CardEntity> fetchWithSpecs() {
        return cardRepository.findAll(filterByIsSpell(false)
                .and(filterByIsToken(null))
                .and(filterByHpGreaterThan(null))
                .and(filterByHpLessThan(null))
                .and(filterByApGreaterThan(4))
                .and(filterByApLessThan(4))
                .and(filterByMpGreaterThan(null))
                .and(filterByMpLessThan(null))
                .and(filterByAtGreaterThan(null))
                .and(filterByAtLessThan(null))
                .and(filterByGod(3))
                .and(filterByRarity(null))
                .and(filterByExtension(null))
                .and(filterByLanguage(null))
                .and(filterByNameLikeContent("%inflige%")
                        .or(filterByFamilyLikeContent("%inflige%"))
                        .or(filterByDescriptionLikeContent("%inflige%")))
        );
    }

    @Override
    public void create(CardEntity card) {
        cardRepository.save(card);
    }
}
