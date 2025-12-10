/*
 * Decompiled with CFR 0.152.
 */
package com.xy.script;

import java.math.BigDecimal;

public class ScriptOpen {
    private int map;
    private int z;
    private int y;
    private BigDecimal rgid;
    private int x;
    private int type;
    private long id;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getMap() {
        return this.map;
    }

    public int getX() {
        return this.x;
    }

    public ScriptOpen(int type, long id) {
        this.type = type;
        this.id = id;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setX(int x) {
        this.x = x;
    }

    public BigDecimal getRgid() {
        return this.rgid;
    }

    public int getType() {
        return this.type;
    }

    public void setRgid(BigDecimal rgid) {
        this.rgid = rgid;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public ScriptOpen(int x, int y, int z) {
        this.type = 0;
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public ScriptOpen(int type, long id, int map, int x, int y, int z) {
        this.type = type;
        this.id = id;
        this.map = map;
        this.x = x;
        this.y = y;
        this.z = z;
    }
}
