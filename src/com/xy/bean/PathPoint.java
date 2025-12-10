/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

public class PathPoint {
    public int y;
    public int x;

    public void setY(int y) {
        this.y = y;
    }

    public PathPoint() {
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public PathPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
