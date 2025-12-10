/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class PalacePkBean {
    private BigDecimal xianyu;
    private int type;
    private int choices = 0;
    private String sendStr;
    private String username;
    private int Ntype;
    private BigDecimal gold;
    private BigDecimal exp;
    private int PId;

    public int getType() {
        return this.type;
    }

    public BigDecimal getExp() {
        return this.exp;
    }

    public String getSendStr() {
        return this.sendStr;
    }

    public void setExp(BigDecimal exp) {
        this.exp = exp;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getPId() {
        return this.PId;
    }

    public BigDecimal getGold() {
        return this.gold;
    }

    public int getChoices() {
        return this.choices;
    }

    public int getNtype() {
        return this.Ntype;
    }

    public void setSendStr(String sendStr) {
        this.sendStr = sendStr;
    }

    public void setXianyu(BigDecimal xianyu) {
        this.xianyu = xianyu;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setPId(int pId) {
        this.PId = pId;
    }

    public void setChoices(int choices) {
        this.choices = choices;
    }

    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    public BigDecimal getXianyu() {
        return this.xianyu;
    }

    public String getUsername() {
        return this.username;
    }

    public void setNtype(int ntype) {
        this.Ntype = ntype;
    }
}
