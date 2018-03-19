package com.example.krosmunityBack.specification;

import com.example.krosmunityBack.domain.CardEntity;
import com.example.krosmunityBack.domain.CardEntity_;
import org.springframework.data.jpa.domain.Specification;

public class CardSpecification {

    public static Specification<CardEntity> filterByIsSpell(Boolean isSpell) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (isSpell == null) {
                return builder.and();
            }
            return builder.equal(root.get(CardEntity_.isSpell), isSpell);
        };
    }

    public static Specification<CardEntity> filterByIsToken(Boolean isToken) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (isToken == null) {
                return builder.and();
            } else {
                return builder.equal(root.get(CardEntity_.isToken), isToken);
            }
        };
    }

    public static Specification<CardEntity> filterByHpGreaterThan(Integer hpMin) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (hpMin == null) {
                return builder.and();
            } else {
                return builder.greaterThanOrEqualTo(root.get(CardEntity_.hp), hpMin);
            }
        };
    }

    public static Specification<CardEntity> filterByHpLessThan(Integer hpMax) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (hpMax == null) {
                return builder.and();
            } else {
                return builder.lessThanOrEqualTo(root.get(CardEntity_.hp), hpMax);
            }
        };
    }

    public static Specification<CardEntity> filterByApGreaterThan(Integer apMin) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (apMin == null) {
                return builder.and();
            } else {
                return builder.greaterThanOrEqualTo(root.get(CardEntity_.ap), apMin);
            }
        };
    }

    public static Specification<CardEntity> filterByApLessThan(Integer apMax) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (apMax == null) {
                return builder.and();
            } else {
                return builder.lessThanOrEqualTo(root.get(CardEntity_.ap), apMax);
            }
        };
    }

    public static Specification<CardEntity> filterByAtGreaterThan(Integer atMin) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (atMin == null) {
                return builder.and();
            } else {
                return builder.greaterThanOrEqualTo(root.get(CardEntity_.at), atMin);
            }
        };
    }

    public static Specification<CardEntity> filterByAtLessThan(Integer atMax) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (atMax == null) {
                return builder.and();
            } else {
                return builder.lessThanOrEqualTo(root.get(CardEntity_.at), atMax);
            }
        };
    }

    public static Specification<CardEntity> filterByMpLessThan(Integer mpMax) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (mpMax == null) {
                return builder.and();
            } else {
                return builder.lessThanOrEqualTo(root.get(CardEntity_.mp), mpMax);
            }
        };
    }

    public static Specification<CardEntity> filterByMpGreaterThan(Integer mpMin) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (mpMin == null) {
                return builder.and();
            } else {
                return builder.greaterThanOrEqualTo(root.get(CardEntity_.mp), mpMin);
            }
        };
    }

    public static Specification<CardEntity> filterByGod(Integer god) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (god == null) {
                return builder.and();
            } else {
                return builder.equal(root.get(CardEntity_.god), god);
            }
        };
    }

    public static Specification<CardEntity> filterByRarity(Integer rarity) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (rarity == null) {
                return builder.and();
            } else {
                return builder.equal(root.get(CardEntity_.rarity), rarity);
            }
        };
    }

    public static Specification<CardEntity> filterByExtension(Integer extension) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (extension == null) {
                return builder.and();
            } else {
                return builder.equal(root.get(CardEntity_.extension), extension);
            }
        };
    }

    public static Specification<CardEntity> filterByLanguage(Integer language) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (language == null) {
                return builder.and();
            } else {
                return builder.equal(root.get(CardEntity_.cardIdentity).get("language"), language);
            }
        };
    }

    public static Specification<CardEntity> filterByNameLikeContent(String content) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (content == null) {
                return builder.and();
            } else {
                return builder.like(root.get(CardEntity_.name), content);
            }
        };
    }

    public static Specification<CardEntity> filterByDescriptionLikeContent(String content) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (content == null) {
                return builder.and();
            } else {
                return builder.like(root.get(CardEntity_.description), content);
            }
        };
    }

    public static Specification<CardEntity> filterByFamilyLikeContent(String content) {
        return (Specification<CardEntity>) (root, query, builder) -> {
            if (content == null) {
                return builder.and();
            } else {
                return builder.like(root.get(CardEntity_.family), content);
            }
        };
    }
}
