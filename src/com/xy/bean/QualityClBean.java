/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class QualityClBean {
    private BigDecimal rgid;
    private String newAttr;
    private String data;
    private int type;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public String getNewAttr() {
        return this.newAttr;
    }

    public void setNewAttr(String newAttr) {
        this.newAttr = newAttr;
    }

    public int getType() {
        return this.type;
    }

    public BigDecimal getRgid() {
        return this.rgid;
    }

    public void setRgid(BigDecimal rgid) {
        this.rgid = rgid;
    }

    public void setType(int type) {
        this.type = type;
    }
}
