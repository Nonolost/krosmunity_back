package com.example.krosmunityBack.service.impl;

import com.example.krosmunityBack.domain.CardEntity;
import com.example.krosmunityBack.domain.CardFilter;
import com.example.krosmunityBack.repository.CardRepository;
import com.example.krosmunityBack.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import static com.example.krosmunityBack.specification.CardSpecification.*;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public Page<CardEntity> fetchWithSpecs(CardFilter cardFilter) {
        return cardRepository.findAll(
                filterByIsSpell(cardFilter.getIsSpell())
                        .and(filterByIsToken(cardFilter.getIsToken()))
                        .and(filterByHpGreaterThan(cardFilter.getHpGreaterThan()))
                        .and(filterByHpLessThan(cardFilter.getHpLessThan()))
                        .and(filterByApGreaterThan(cardFilter.getApGreaterThan()))
                        .and(filterByApLessThan(cardFilter.getApLessThan()))
                        .and(filterByMpGreaterThan(cardFilter.getMpGreaterThan()))
                        .and(filterByMpLessThan(cardFilter.getMpLessThan()))
                        .and(filterByAtGreaterThan(cardFilter.getAtGreaterThan()))
                        .and(filterByAtLessThan(cardFilter.getAtLessThan()))
                        .and(filterByGod(cardFilter.getGod()))
                        .and(filterByRarity(cardFilter.getRarity()))
                        .and(filterByExtension(cardFilter.getExtension()))
                        .and(filterByLanguage(cardFilter.getLanguage()))
                        .and(filterByNameLikeContent(cardFilter.getContent())
                                .or(filterByFamilyLikeContent(cardFilter.getContent()))
                                .or(filterByDescriptionLikeContent(cardFilter.getContent())))
                , PageRequest.of(cardFilter.getPageNumber(), cardFilter.getPageContent(), Sort.Direction.ASC, "ap", "name"));
    }
}
