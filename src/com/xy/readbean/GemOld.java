/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class GemOld {
    private double value;
    private int type;
    private String key;
    private int[] parts;
    private int id;

    public void setKey(String key) {
        this.key = key;
    }

    public int[] getParts() {
        return this.parts;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setParts(int[] parts) {
        this.parts = parts;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getValue() {
        return this.value;
    }

    public int getId() {
        return this.id;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getType() {
        return this.type;
    }

    public String getKey() {
        return this.key;
    }
}
