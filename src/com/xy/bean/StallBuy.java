/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class StallBuy {
    private int type;
    private int sum;
    private int soldId;
    private int id;
    private BigDecimal buyid;

    public void setSoldId(int soldId) {
        this.soldId = soldId;
    }

    public int getSum() {
        return this.sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return this.id;
    }

    public BigDecimal getBuyid() {
        return this.buyid;
    }

    public int getType() {
        return this.type;
    }

    public void setBuyid(BigDecimal buyid) {
        this.buyid = buyid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSoldId() {
        return this.soldId;
    }
}
