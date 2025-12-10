/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

public class QuoteOutBean {
    private String data;
    private int type;
    private long value;

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public int getType() {
        return this.type;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public long getValue() {
        return this.value;
    }

    public void setType(int type) {
        this.type = type;
    }
}
