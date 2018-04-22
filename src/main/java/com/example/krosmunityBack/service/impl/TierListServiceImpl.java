package com.example.krosmunityBack.service.impl;

import com.example.krosmunityBack.domain.TierListEntity;
import com.example.krosmunityBack.repository.TierListRepository;
import com.example.krosmunityBack.service.TierListService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TierListServiceImpl implements TierListService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    TierListRepository tierListRepository;

    public List<TierListEntity> findAll() {
        LOGGER.debug("[TierListService - findAll]");
        return tierListRepository.findAll();
    }
}
