package com.example.krosmunityBack.domain.CompositeKey;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

import static com.example.krosmunityBack.domain.CardEntity.ID_COLUMN;
import static com.example.krosmunityBack.domain.CardEntity.LANGUAGE_COLUMN;

@Embeddable
public class CardIdentity implements Serializable {

    @Column(name = ID_COLUMN)
    private int id;

    @Column(name = LANGUAGE_COLUMN)
    private int language;

    public CardIdentity() {
    }

    public CardIdentity(int id, int language) {
        this.id = id;
        this.language = language;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLanguage() {
        return language;
    }

    public void setLanguage(int language) {
        this.language = language;
    }
}
