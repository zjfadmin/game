/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class OneArenaRole {
    private String skin;
    private int lvl;
    private BigDecimal roleId;
    private int place;
    private String name;

    public String getSkin() {
        return this.skin;
    }

    public BigDecimal getRoleId() {
        return this.roleId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getPlace() {
        return this.place;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    public String getName() {
        return this.name;
    }
}
