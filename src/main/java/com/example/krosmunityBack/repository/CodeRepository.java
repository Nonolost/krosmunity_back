package com.example.krosmunityBack.repository;

import com.example.krosmunityBack.domain.CodeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CodeRepository extends JpaRepository<CodeEntity, Integer> {
    List<CodeEntity> findAllByIsActive(boolean isActive);
}
