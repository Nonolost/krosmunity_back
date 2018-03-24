package com.example.krosmunityBack.service.impl;

import com.example.krosmunityBack.domain.TierListEntity;
import com.example.krosmunityBack.repository.TierListRepository;
import com.example.krosmunityBack.service.TierListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TierListServiceImpl implements TierListService {

    @Autowired
    TierListRepository tierListRepository;

    public List<TierListEntity> findAll() {
        return tierListRepository.findAll();
    }
}
