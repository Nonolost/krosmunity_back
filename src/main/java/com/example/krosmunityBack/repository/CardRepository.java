package com.example.krosmunityBack.repository;

import com.example.krosmunityBack.domain.CardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<CardEntity, String>, JpaSpecificationExecutor<CardEntity> {
}
