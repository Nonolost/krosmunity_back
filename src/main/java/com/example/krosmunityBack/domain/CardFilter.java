package com.example.krosmunityBack.domain;

public class CardFilter {

    private Boolean isSpell;
    private Boolean isToken;
    private Integer hpGreaterThan;
    private Integer hpLessThan;
    private Integer apGreaterThan;
    private Integer apLessThan;
    private Integer mpGreaterThan;
    private Integer mpLessThan;
    private Integer atGreaterThan;
    private Integer atLessThan;
    private Integer god;
    private Integer rarity;
    private Integer extension;
    private Integer language;
    private String content;
    private Integer pageNumber;
    private Integer pageContent;

    public CardFilter() {
    }

    public CardFilter(Boolean isSpell, Boolean isToken, Integer hpGreaterThan, Integer hpLessThan, Integer apGreaterThan, Integer apLessThan, Integer mpGreaterThan, Integer mpLessThan, Integer atGreaterThan, Integer atLessThan, Integer god, Integer rarity, Integer extension, Integer language, String content, Integer pageNumber, Integer pageContent) {
        this.isSpell = isSpell;
        this.isToken = isToken;
        this.hpGreaterThan = hpGreaterThan;
        this.hpLessThan = hpLessThan;
        this.apGreaterThan = apGreaterThan;
        this.apLessThan = apLessThan;
        this.mpGreaterThan = mpGreaterThan;
        this.mpLessThan = mpLessThan;
        this.atGreaterThan = atGreaterThan;
        this.atLessThan = atLessThan;
        this.god = god;
        this.rarity = rarity;
        this.extension = extension;
        this.language = language;
        this.content = content;
        this.pageNumber = pageNumber;
        this.pageContent = pageContent;
    }

    public Boolean getIsSpell() {
        return isSpell;
    }

    public void setIsSpell(Boolean isSpell) {
        this.isSpell = isSpell;
    }

    public Boolean getIsToken() {
        return isToken;
    }

    public void setIsToken(Boolean isToken) {
        this.isToken = isToken;
    }

    public Integer getHpGreaterThan() {
        return hpGreaterThan;
    }

    public void setHpGreaterThan(Integer hpGreaterThan) {
        this.hpGreaterThan = hpGreaterThan;
    }

    public Integer getHpLessThan() {
        return hpLessThan;
    }

    public void setHpLessThan(Integer hpLessThan) {
        this.hpLessThan = hpLessThan;
    }

    public Integer getApGreaterThan() {
        return apGreaterThan;
    }

    public void setApGreaterThan(Integer apGreaterThan) {
        this.apGreaterThan = apGreaterThan;
    }

    public Integer getApLessThan() {
        return apLessThan;
    }

    public void setApLessThan(Integer apLessThan) {
        this.apLessThan = apLessThan;
    }

    public Integer getMpGreaterThan() {
        return mpGreaterThan;
    }

    public void setMpGreaterThan(Integer mpGreaterThan) {
        this.mpGreaterThan = mpGreaterThan;
    }

    public Integer getMpLessThan() {
        return mpLessThan;
    }

    public void setMpLessThan(Integer mpLessThan) {
        this.mpLessThan = mpLessThan;
    }

    public Integer getAtGreaterThan() {
        return atGreaterThan;
    }

    public void setAtGreaterThan(Integer atGreaterThan) {
        this.atGreaterThan = atGreaterThan;
    }

    public Integer getAtLessThan() {
        return atLessThan;
    }

    public void setAtLessThan(Integer atLessThan) {
        this.atLessThan = atLessThan;
    }

    public Integer getGod() {
        return god;
    }

    public void setGod(Integer god) {
        this.god = god;
    }

    public Integer getRarity() {
        return rarity;
    }

    public void setRarity(Integer rarity) {
        this.rarity = rarity;
    }

    public Integer getExtension() {
        return extension;
    }

    public void setExtension(Integer extension) {
        this.extension = extension;
    }

    public Integer getLanguage() {
        return language;
    }

    public void setLanguage(Integer language) {
        this.language = language;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageContent() {
        return pageContent;
    }

    public void setPageContent(Integer pageContent) {
        this.pageContent = pageContent;
    }

    @Override
    public String toString() {
        return "CardFilter{" +
                "isSpell=" + isSpell +
                ", isToken=" + isToken +
                ", hpGreaterThan=" + hpGreaterThan +
                ", hpLessThan=" + hpLessThan +
                ", apGreaterThan=" + apGreaterThan +
                ", apLessThan=" + apLessThan +
                ", mpGreaterThan=" + mpGreaterThan +
                ", mpLessThan=" + mpLessThan +
                ", atGreaterThan=" + atGreaterThan +
                ", atLessThan=" + atLessThan +
                ", god=" + god +
                ", rarity=" + rarity +
                ", extension=" + extension +
                ", language=" + language +
                ", content='" + content + '\'' +
                ", pageNumber=" + pageNumber +
                ", pageContent=" + pageContent +
                '}';
    }
}
