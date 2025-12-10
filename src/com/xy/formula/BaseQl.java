/*
 * Decompiled with CFR 0.152.
 */
package com.xy.formula;

public class BaseQl {
    private double value;
    private double value2;
    private String key;

    public double getValue2() {
        return this.value2;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue2(double value2) {
        this.value2 = value2;
    }

    public String getKey() {
        return this.key;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getValue() {
        return this.value;
    }

    public BaseQl(String key, double value) {
        this.key = key;
        this.value = value;
    }
}
