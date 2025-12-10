/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class SummonPetBean {
    private int opertype;
    private BigDecimal goodid;
    private BigDecimal petid;

    public BigDecimal getPetid() {
        return this.petid;
    }

    public void setPetid(BigDecimal petid) {
        this.petid = petid;
    }

    public void setOpertype(int opertype) {
        this.opertype = opertype;
    }

    public void setGoodid(BigDecimal goodid) {
        this.goodid = goodid;
    }

    public SummonPetBean() {
    }

    public BigDecimal getGoodid() {
        return this.goodid;
    }

    public int getOpertype() {
        return this.opertype;
    }

    public SummonPetBean(int opertype) {
        this.opertype = opertype;
    }
}
