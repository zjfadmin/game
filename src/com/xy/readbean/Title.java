/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class Title {
    private String skin;
    private String text;
    private String value;
    private String exist;
    private String titlename;
    private Integer id;

    public String getSkin() {
        return this.skin;
    }

    public String getValue() {
        return this.value;
    }

    public String getExist() {
        return this.exist;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public String getTitlename() {
        return this.titlename;
    }

    public void setExist(String exist) {
        this.exist = exist;
    }

    public String getText() {
        return this.text;
    }
}
