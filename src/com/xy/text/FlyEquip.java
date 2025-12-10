/*
 * Decompiled with CFR 0.152.
 */
package com.xy.text;

public class FlyEquip {
    private boolean isMove;
    private long time;
    private int x;
    private int y;

    public FlyEquip(int x, int y, boolean isMove, long time) {
        this.x = x;
        this.y = y;
        this.isMove = isMove;
        this.time = time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public void setMove(boolean isMove) {
        this.isMove = isMove;
    }

    public void setY(int y) {
        this.y = y;
    }

    public long getTime() {
        return this.time;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean ALLATORIxDEMO() {
        return this.isMove;
    }
}
