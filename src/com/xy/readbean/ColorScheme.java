/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class ColorScheme {
    private int zid;
    private String name;
    private int id;
    private String value;
    private int max;
    private int min;

    public void setZid(int zid) {
        this.zid = zid;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMin() {
        return this.min;
    }

    public String getName() {
        return this.name;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getZid() {
        return this.zid;
    }

    public int getId() {
        return this.id;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getMax() {
        return this.max;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.value;
    }

    public void setId(int id) {
        this.id = id;
    }
}
