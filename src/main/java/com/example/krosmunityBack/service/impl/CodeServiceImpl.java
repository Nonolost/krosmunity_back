package com.example.krosmunityBack.service.impl;

import com.example.krosmunityBack.domain.CodeEntity;
import com.example.krosmunityBack.repository.CodeRepository;
import com.example.krosmunityBack.service.CodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {

    @Autowired
    private CodeRepository codeRepository;

    public List<CodeEntity> findAllActiveCodes() {
        return codeRepository.findAllByIsActive(true);
    }

}
