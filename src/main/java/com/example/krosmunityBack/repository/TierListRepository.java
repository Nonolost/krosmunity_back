package com.example.krosmunityBack.repository;

import com.example.krosmunityBack.domain.TierListEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TierListRepository extends JpaRepository<TierListEntity, Integer> {
}
