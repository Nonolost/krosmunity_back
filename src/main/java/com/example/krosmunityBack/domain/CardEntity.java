package com.example.krosmunityBack.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = CardEntity.CARD_TABLE)
public class CardEntity {

    public static final String CARD_TABLE = "Card";

    public static final String ID_COLUMN = "id";

    public static final String GOD_COLUMN = "god";

    public static final String NAME_COLUMN = "name";

    public static final String DESCRIPTION_COLUMN = "description";

    public static final String AT_COLUMN = "at";

    public static final String AP_COLUMN = "ap";

    public static final String HP_COLUMN = "hp";

    public static final String MP_COLUMN = "mp";

    public static final String IS_SPELL_COLUMN = "is_spell";

    public static final String FAMILY_COLUMN = "family";

    public static final String RARITY_COLUMN = "rarity";

    public static final String EXTENSION_COLUMN = "extension";

    public static final String IS_TOKEN_COLUMN = "is_token";

    public static final String IMAGE_LINK_COLUMN = "image_link";

    public static final String LANGUAGE_COLUMN = "language";


    @Id
    @Column(name = ID_COLUMN)
    int id;

    @Column(name = GOD_COLUMN)
    int god;

    @Column(name = NAME_COLUMN)
    String name;

    @Column(name = DESCRIPTION_COLUMN)
    String description;

    @Column(name = AT_COLUMN)
    int at;

    @Column(name = AP_COLUMN)
    int ap;

    @Column(name = HP_COLUMN)
    int hp;

    @Column(name = MP_COLUMN)
    int mp;

    @Column(name = IS_SPELL_COLUMN)
    boolean isSpell;

    @Column(name = FAMILY_COLUMN)
    String family;

    @Column(name = RARITY_COLUMN)
    int rarity;

    @Column(name = EXTENSION_COLUMN)
    int extension;

    @Column(name = IS_TOKEN_COLUMN)
    boolean IsToken;

    @Column(name = IMAGE_LINK_COLUMN)
    String imageLink;

    @Column(name = LANGUAGE_COLUMN)
    int langage;

    public CardEntity() {
    }

    public CardEntity(int id, int god, String name, String description, int at, int ap, int hp, int mp, boolean isSpell, String family, int rarity, int extension, boolean isToken, String imageLink, int langage) {
        this.id = id;
        this.god = god;
        this.name = name;
        this.description = description;
        this.at = at;
        this.ap = ap;
        this.hp = hp;
        this.mp = mp;
        this.isSpell = isSpell;
        this.family = family;
        this.rarity = rarity;
        this.extension = extension;
        IsToken = isToken;
        this.imageLink = imageLink;
        this.langage = langage;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGod() {
        return god;
    }

    public void setGod(int god) {
        this.god = god;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAt() {
        return at;
    }

    public void setAt(int at) {
        this.at = at;
    }

    public int getAp() {
        return ap;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public boolean isSpell() {
        return isSpell;
    }

    public void setSpell(boolean spell) {
        isSpell = spell;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getExtension() {
        return extension;
    }

    public void setExtension(int extension) {
        this.extension = extension;
    }

    public boolean isToken() {
        return IsToken;
    }

    public void setToken(boolean token) {
        IsToken = token;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public int getLangage() {
        return langage;
    }

    public void setLangage(int langage) {
        this.langage = langage;
    }
}
