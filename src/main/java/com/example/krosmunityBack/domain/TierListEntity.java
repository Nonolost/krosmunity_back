package com.example.krosmunityBack.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.example.krosmunityBack.domain.TierListEntity.TIER_LIST_TABLE;


@Entity
@Table(name = TIER_LIST_TABLE)
public class TierListEntity {

    public static final String TIER_LIST_TABLE = "TierList";

    public static final String ID_COLUMN = "id";

    public static final String GOD_COLUMN = "god";

    public static final String NAME_COLUMN = "name";

    public static final String TIER_COLUMN = "tier";

    public static final String AUTHOR_COLUMN = "author";

    public static final String TYPE_COLUMN = "type";

    public static final String NOTE_COLUMN = "note";

    public static final String KAMAS_PRICE_COLUMN = "kamas_price";

    public static final String DUST_PRICE_COLUMN = "dust_price";

    public static final String KROSBUILDER_LINK_COLUMN = "krosbuilder_link";

    @Id
    @Column(name = ID_COLUMN)
    private int id;

    @Column(name = GOD_COLUMN)
    private int god;

    @Column(name = NAME_COLUMN)
    private String name;

    @Column(name = AUTHOR_COLUMN)
    private String author;

    @Column(name = TYPE_COLUMN)
    private String type;

    @Column(name = TIER_COLUMN)
    private int tier;

    @Column(name = NOTE_COLUMN)
    private float note;

    @Column(name = KAMAS_PRICE_COLUMN)
    private int kamasPrice;

    @Column(name = DUST_PRICE_COLUMN)
    private int dustPrice;

    @Column(name = KROSBUILDER_LINK_COLUMN)
    private String krosbuilderLink;

    public TierListEntity(int id, int god, String name, String author, String type, int tier, float note, int kamasPrice, int dustPrice, String krosbuilderLink) {
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

    public TierListEntity() {
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
