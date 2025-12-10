/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class GiveGoodsBean {
    private int sum;
    private BigDecimal gold;
    private BigDecimal otherID;
    private int type;
    private BigDecimal rgid;
    private String otherName;

    public void setSum(int sum) {
        this.sum = sum;
    }

    public BigDecimal getOtherID() {
        return this.otherID;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public void setRgid(BigDecimal rgid) {
        this.rgid = rgid;
    }

    public String getOtherName() {
        return this.otherName;
    }

    public void setGold(BigDecimal gold) {
        this.gold = gold;
    }

    public int getSum() {
        return this.sum;
    }

    public void setOtherID(BigDecimal otherID) {
        this.otherID = otherID;
    }

    public BigDecimal getRgid() {
        return this.rgid;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public BigDecimal getGold() {
        return this.gold;
    }
}
