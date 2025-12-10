/*
 * Decompiled with CFR 0.152.
 */
package com.xy.formula;

public class BaseLimit {
    private int lvlMax;
    private int gg;
    private int zsMax;
    private int lvl;
    private int lm;
    private int mj;
    private String role;
    private double xs;
    private boolean isL;
    private int lx;
    private int zs;
    private int sw;
    private int sex;

    public BaseLimit(int lm, int lx, int gg, int mj, double xs, int zs, int lvl, int zsMax, int lvlMax, boolean isL, int sex) {
        this.lm = lm;
        this.lx = lx;
        this.gg = gg;
        this.mj = mj;
        this.xs = xs;
        this.zs = zs;
        this.lvl = lvl;
        this.zsMax = zsMax;
        this.lvlMax = lvlMax;
        this.isL = isL;
        this.sex = sex;
    }

    public BaseLimit() {
        this.xs = 100.0;
        this.zsMax = 4;
        this.lvlMax = 200;
        this.isL = false;
        this.sex = 2;
    }

    public int getSXValue(int type) {
        if (type == 0) {
            return (int)((double)this.gg * this.xs / 100.0);
        }
        if (type == 1) {
            return (int)((double)this.lx * this.xs / 100.0);
        }
        if (type == 2) {
            return (int)((double)this.lm * this.xs / 100.0);
        }
        if (type != 3) return 0;
        return (int)((double)this.mj * this.xs / 100.0);
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getMj() {
        return this.mj;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setLx(int lx) {
        this.lx = lx;
    }

    public int getLvl() {
        return this.lvl;
    }

    public void setZs(int zs) {
        this.zs = zs;
    }

    public int getGg() {
        return this.gg;
    }

    public double getXs() {
        return this.xs;
    }

    public int getLx() {
        return this.lx;
    }

    public int getSw() {
        return this.sw;
    }

    public void setMj(int mj) {
        this.mj = mj;
    }

    public void setXs(double xs) {
        this.xs = xs;
    }

    public int getLm() {
        return this.lm;
    }

    public int getLvlMax() {
        return this.lvlMax;
    }

    public String getRole() {
        return this.role;
    }

    public boolean ALLATORIxDEMO() {
        return this.isL;
    }

    public void setLm(int lm) {
        this.lm = lm;
    }

    public void setL(boolean isL) {
        this.isL = isL;
    }

    public int getSex() {
        return this.sex;
    }

    public void setGg(int gg) {
        this.gg = gg;
    }

    public int getZs() {
        return this.zs;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setSw(int sw) {
        this.sw = sw;
    }

    public int getZsMax() {
        return this.zsMax;
    }

    public void setZsMax(int zsMax) {
        this.zsMax = zsMax;
    }

    public void setLvlMax(int lvlMax) {
        this.lvlMax = lvlMax;
    }
}
