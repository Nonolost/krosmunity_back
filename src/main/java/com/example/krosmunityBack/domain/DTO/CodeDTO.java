package com.example.krosmunityBack.domain.DTO;

public class CodeDTO {

    int id;

    String code;

    String source;

    String sourceUrl;

    boolean isActive;

    public CodeDTO() {
    }


    public CodeDTO(int id, String code, String source, String sourceUrl, boolean isActive) {
        this.id = id;
        this.code = code;
        this.source = source;
        this.sourceUrl = sourceUrl;
        this.isActive = isActive;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
