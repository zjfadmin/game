/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class XXGDBean {
    private BigDecimal id;
    private int sum;
    private long tag;

    public long getTag() {
        return this.tag;
    }

    public int getSum() {
        return this.sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setTag(long tag) {
        this.tag = tag;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }
}
