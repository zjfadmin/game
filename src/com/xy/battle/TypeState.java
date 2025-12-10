/*
 * Decompiled with CFR 0.152.
 */
package com.xy.battle;

public class TypeState {
    private String type;
    private int state;

    public void setState(int state) {
        this.state = state;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return this.type;
    }

    public int getState() {
        return this.state;
    }
}
