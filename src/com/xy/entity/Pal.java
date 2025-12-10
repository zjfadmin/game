/*
 * Decompiled with CFR 0.152.
 */
package com.xy.entity;

import java.math.BigDecimal;

public class Pal {
    private int pId;
    private BigDecimal roleId;
    private double grow;
    private BigDecimal id;
    private String parts;
    private long exp;

    public void setParts(String parts) {
        this.parts = parts;
    }

    public void setGrow(double grow) {
        this.grow = grow;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public String getParts() {
        return this.parts;
    }

    public void setExp(long exp) {
        this.exp = exp;
    }

    public BigDecimal getId() {
        return this.id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public double getGrow() {
        return this.grow;
    }

    public BigDecimal getRoleId() {
        return this.roleId;
    }

    public int getpId() {
        return this.pId;
    }

    public long getExp() {
        return this.exp;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }
}
