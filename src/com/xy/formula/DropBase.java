/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.FormulaNum
 */
package com.xy.formula;

import com.xy.formula.FormulaNum;

public class DropBase {
    private int v;
    private int id;
    private FormulaNum num;

    public FormulaNum getFormulaNum() {
        return this.num;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getNum(int count) {
        if (this.num == null) return 1L;
        return this.num.getZhiCount(count);
    }

    public int getId() {
        return this.id;
    }

    public DropBase(int id, int v, FormulaNum num) {
        this.id = id;
        this.v = v;
        this.num = num;
    }

    public long getNum() {
        if (this.num == null) return 1L;
        return this.num.getZhi();
    }

    public int getV() {
        return this.v;
    }

    public void setNum(FormulaNum num) {
        this.num = num;
    }

    public DropBase() {
    }
}
