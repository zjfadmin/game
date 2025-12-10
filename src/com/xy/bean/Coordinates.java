/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

public class Coordinates {
    private int y;
    private int x;
    private int mapID;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public Coordinates(int mapID, int x, int y) {
        this.mapID = mapID;
        this.x = x;
        this.y = y;
    }

    public int getMapID() {
        return this.mapID;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setMapID(int mapID) {
        this.mapID = mapID;
    }
}
