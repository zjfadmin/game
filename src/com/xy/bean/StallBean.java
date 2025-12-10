/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class StallBean {
    private int state;
    private int x;
    private int id;
    private String role;
    private String stall;
    private int y;
    private int mapid;
    private BigDecimal roleid;
    private boolean buy;

    public int getState() {
        return this.state;
    }

    public boolean ALLATORIxDEMO() {
        return this.buy;
    }

    public int getId() {
        return this.id;
    }

    public String getStall() {
        return this.stall;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public int getX() {
        return this.x;
    }

    public void setStall(String stall) {
        this.stall = stall;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setMapid(int mapid) {
        this.mapid = mapid;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setBuy(boolean buy) {
        this.buy = buy;
    }

    public String getRole() {
        return this.role;
    }

    public BigDecimal getRoleid() {
        return this.roleid;
    }

    public int getMapid() {
        return this.mapid;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
