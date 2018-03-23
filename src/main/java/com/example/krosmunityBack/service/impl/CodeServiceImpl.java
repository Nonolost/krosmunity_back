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

    public void create() {
        codeRepository.save(new CodeEntity(1,"coucou1","facebook","https://www.facebook.com/arnaud.lods",true));
        codeRepository.save(new CodeEntity(2,"coucou2","twitter","https://www.facebook.com/arnaud.lods",false));
        codeRepository.save(new CodeEntity(3,"coucou3","facebook","https://www.facebook.com/arnaud.lods",true));

    }
}
