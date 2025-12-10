/*
 * Decompiled with CFR 0.152.
 */
package com.xy.script;

public class ScriptEnd {
    private int map;
    private int type;
    private int x;
    private int z;
    private int y;

    public ScriptEnd(int type) {
        this.type = type;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public int getMap() {
        return this.map;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public int getType() {
        return this.type;
    }

    public ScriptEnd(int map, int x, int y, int z) {
        this.type = 0;
        this.map = map;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getZ() {
        return this.z;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
