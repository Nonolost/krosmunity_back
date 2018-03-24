package com.example.krosmunityBack.service;

import com.example.krosmunityBack.domain.CodeEntity;

import java.util.List;

public interface CodeService {
    List<CodeEntity> findAllActiveCodes();
}
