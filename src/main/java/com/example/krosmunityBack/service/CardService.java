package com.example.krosmunityBack.service;

import com.example.krosmunityBack.domain.CardEntity;
import com.example.krosmunityBack.domain.CardFilter;
import org.springframework.data.domain.Page;

public interface CardService {
    Page<CardEntity> fetchWithSpecs(CardFilter cardFilter);
}
