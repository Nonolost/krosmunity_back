package com.example.krosmunityBack.domain.DTO;

public class TierListDTO {

    private int id;

    private int god;

    private String name;

    private String author;

    private String type;

    private int tier;

    private float note;

    private int kamasPrice;

    private int dustPrice;

    private String krosbuilderLink;

    public TierListDTO() {
    }

    public TierListDTO(int id, int god, String name, String author, String type, int tier, float note, int kamasPrice, int dustPrice, String krosbuilderLink) {
        this.id = id;
        this.god = god;
        this.name = name;
        this.author = author;
        this.type = type;
        this.tier = tier;
        this.note = note;
        this.kamasPrice = kamasPrice;
        this.dustPrice = dustPrice;
        this.krosbuilderLink = krosbuilderLink;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public float getNote() {
        return note;
    }

    public void setNote(float note) {
        this.note = note;
    }

    public int getKamasPrice() {
        return kamasPrice;
    }

    public void setKamasPrice(int kamasPrice) {
        this.kamasPrice = kamasPrice;
    }

    public int getDustPrice() {
        return dustPrice;
    }

    public void setDustPrice(int dustPrice) {
        this.dustPrice = dustPrice;
    }

    public String getKrosbuilderLink() {
        return krosbuilderLink;
    }

    public void setKrosbuilderLink(String krosbuilderLink) {
        this.krosbuilderLink = krosbuilderLink;
    }
}
