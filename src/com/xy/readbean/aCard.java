/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class aCard {
    private int id;
    private String name;
    private int cardType;
    private String gn;
    private int money;
    private int type;
    private String skin;
    private int time;
    private String value;

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getMoney() {
        return this.money;
    }

    public int getCardType() {
        return this.cardType;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTime() {
        return this.time;
    }

    public void setGn(String gn) {
        this.gn = gn;
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getValue() {
        return this.value;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getSkin() {
        return this.skin;
    }

    public String getName() {
        return this.name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getGn() {
        return this.gn;
    }

    public int getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }
}
