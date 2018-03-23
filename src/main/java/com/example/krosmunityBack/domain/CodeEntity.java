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

    public static final String IS_ACTIVE_COLUMN = "is_active";

    @Id
    @Column(name = ID_COLUMN)
    int id;

    @Column(name = CODE_COLUMN)
    String code;

    @Column(name = SOURCE_COLUMN)
    String source;

    @Column(name = IS_ACTIVE_COLUMN)
    boolean isActive;

    public CodeEntity() {
    }

    public CodeEntity(int id, String code, String source, boolean isActive) {
        this.id = id;
        this.code = code;
        this.source = source;
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

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}



