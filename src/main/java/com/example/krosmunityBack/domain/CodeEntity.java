package com.example.krosmunityBack.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import static com.example.krosmunityBack.domain.CodeEntity.CODE_TABLE;

@Entity
@Table(name = CODE_TABLE)
public class CodeEntity {
    public static final String CODE_TABLE = "Code";


    public static final String ID_COLUMN = "id";

    public static final String CODE_COLUMN = "code";

    public static final String SOURCE_COLUMN = "source";

    public static final String SOURCE_URL_COLUMN = "source_url";

    public static final String IS_ACTIVE_COLUMN = "is_active";

    @Id
    @Column(name = ID_COLUMN)
    private int id;

    @Column(name = CODE_COLUMN)
    private String code;

    @Column(name = SOURCE_COLUMN)
    private String source;

    @Column(name = SOURCE_URL_COLUMN)
    private String sourceUrl;

    @Column(name = IS_ACTIVE_COLUMN)
    private boolean isActive;

    public CodeEntity() {
    }

    public CodeEntity(int id, String code, String source, String sourceUrl, boolean isActive) {
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



