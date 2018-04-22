package com.example.krosmunityBack.service.impl;

import com.example.krosmunityBack.domain.CodeEntity;
import com.example.krosmunityBack.repository.CodeRepository;
import com.example.krosmunityBack.service.CodeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeServiceImpl implements CodeService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CodeRepository codeRepository;

    public List<CodeEntity> findAllActiveCodes() {
        LOGGER.debug("[CodeService - findAllActiveCodes]");
        return codeRepository.findAllByIsActive(true);
    }

}
