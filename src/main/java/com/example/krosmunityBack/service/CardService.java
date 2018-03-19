package com.example.krosmunityBack.service;

import com.example.krosmunityBack.domain.CardEntity;

import java.util.List;

public interface CardService {
    List<CardEntity> fetchWithSpecs();

    void create(CardEntity card);

}
