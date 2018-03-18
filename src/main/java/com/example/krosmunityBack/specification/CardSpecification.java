package com.example.krosmunityBack.specification;

import com.example.krosmunityBack.domain.CardEntity;
import com.example.krosmunityBack.domain.CardEntity_;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class CardSpecification {

    public static Specification<CardEntity> filterBySpell(Boolean isSpell) {
        return new Specification<CardEntity>() {
            public Predicate toPredicate(Root<CardEntity> root, CriteriaQuery<?> query,
                                         CriteriaBuilder builder) {
                if (isSpell == null) {
                    return null;
                }
                if (isSpell) {
                    return builder.equal(root.get(CardEntity_.isSpell), true);
                } else {
                    return builder.equal(root.get(CardEntity_.isSpell), false);
                }
            }
        };

    }
}
