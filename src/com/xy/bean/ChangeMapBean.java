/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

public class ChangeMapBean {
    private int type;
    private String mapid;
    private int mapy;
    private int mapx;

    public int getMapy() {
        return this.mapy;
    }

    public int getType() {
        return this.type;
    }

    public void setMapid(String mapid) {
        this.mapid = mapid;
    }

    public String getMapid() {
        return this.mapid;
    }

    public int getMapx() {
        return this.mapx;
    }

    public void setMapy(int mapy) {
        this.mapy = mapy;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setMapx(int mapx) {
        this.mapx = mapx;
    }
}
