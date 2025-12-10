/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

public class CreepsMovePath {
    private String points;
    private int x;
    private int y;
    private int time;

    /*
     * WARNING - void declaration
     */
    public String toString() {
        void IiiiiiiiIIIII;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.x);
        stringBuffer.append("*");
        IiiiiiiiIIIII.append(this.y);
        IiiiiiiiIIIII.append("*");
        IiiiiiiiIIIII.append(this.points);
        return IiiiiiiiIIIII.toString();
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getTime() {
        return this.time;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public CreepsMovePath(int x, int y, int time, String points) {
        this.x = x;
        this.y = y;
        this.time = time;
        this.points = points;
    }

    public String getPoints() {
        return this.points;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setPoints(String points) {
        this.points = points;
    }
}
