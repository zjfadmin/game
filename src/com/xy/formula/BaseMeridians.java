/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.BaseValue
 */
package com.xy.formula;

import com.xy.formula.BaseValue;

public class BaseMeridians {
    private int xs;
    private double value;
    private int bh;
    private String key;
    private int exp;

    public int getNextExp(int lvl) {
        return BaseValue.getMeridiansExp((int)lvl);
    }

    /*
     * WARNING - void declaration
     */
    public BaseMeridians(int n, int n2, int n3, String string, double d) {
        void value;
        void key;
        void xs;
        void exp;
        void bh;
        this.bh = bh;
        this.exp = exp;
        this.ALLATORIxDEMO((int)xs, (String)key, (double)value);
    }

    public int getUpExp(int lvl) {
        return this.exp - BaseValue.getMeridiansTotalExp((int)(lvl - 1));
    }

    public void ALLATORIxDEMO(StringBuffer buffer) {
        if (this.bh == 99) {
            buffer.append(this.bh);
            buffer.append("=");
            buffer.append(this.key);
            return;
        }
        buffer.append(this.bh);
        buffer.append("_");
        buffer.append(this.exp);
        buffer.append("_");
        buffer.append(this.xs);
        if (this.key == null) return;
        buffer.append("_");
        buffer.append(this.key);
        buffer.append("_");
        buffer.append(this.value);
    }

    public int getBh() {
        return this.bh;
    }

    public int getXs() {
        return this.xs;
    }

    public int getLvl() {
        return BaseValue.getMeridiansLvl((int)this.exp);
    }

    public double getKeyValue() {
        return this.value * (double)this.getLvl() * (double)this.xs / 100.0;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public String getKey() {
        return this.key;
    }

    public int getExp() {
        return this.exp;
    }

    public void ALLATORIxDEMO(int xs, String key, double value) {
        this.xs = xs;
        this.key = key;
        this.value = value;
    }
}
