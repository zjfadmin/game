/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class MoneyType {
    private String key;
    private int id;
    private long max;

    public void setMax(long max) {
        this.max = max;
    }

    public void setIdAndKey(int id, String key) {
        this.id = id;
        this.key = key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setIdAndMax(int id, long max) {
        this.id = id;
        this.max = max;
    }

    public long getMax() {
        return this.max;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKey() {
        return this.key;
    }

    public MoneyType() {
    }

    public MoneyType(int id, long max) {
        this.id = id;
        this.max = max;
    }
}
