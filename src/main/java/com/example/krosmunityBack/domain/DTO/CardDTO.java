package com.example.krosmunityBack.domain.DTO;

public class CardDTO {

    private int god;
    private String name;
    private String description;
    private int at;
    private int ap;
    private int hp;
    private int mp;
    private boolean isSpell;
    private String family;
    private int rarity;
    private int extension;
    private boolean isToken;
    private String imageLink;

    public CardDTO() {
    }

    public CardDTO(int god, String name, String description, int at, int ap, int hp, int mp, boolean isSpell, String family, int rarity, int extension, boolean isToken, String imageLink) {
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
        this.isToken = isToken;
        this.imageLink = imageLink;
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

    public boolean getIsSpell() {
        return isSpell;
    }

    public void setIsSpell(boolean spell) {
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

    public boolean getIsToken() {
        return isToken;
    }

    public void setIsToken(boolean token) {
        isToken = token;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    @Override
    public String toString() {
        return "CardDTO{" +
                "god=" + god +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", at=" + at +
                ", ap=" + ap +
                ", hp=" + hp +
                ", mp=" + mp +
                ", isSpell=" + isSpell +
                ", family='" + family + '\'' +
                ", rarity=" + rarity +
                ", extension=" + extension +
                ", isToken=" + isToken +
                ", imageLink='" + imageLink + '\'' +
                '}';
    }
}
