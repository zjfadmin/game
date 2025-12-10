/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class FightOperation {
    private String Spell;
    private int camp = -1;
    private int type;
    private int man = -1;
    private BigDecimal good;

    public void setMan(int man) {
        this.man = man;
    }

    public void setGood(BigDecimal good) {
        this.good = good;
    }

    public int getType() {
        return this.type;
    }

    public void setCamp(int camp) {
        this.camp = camp;
    }

    public void setSpell(String spell) {
        this.Spell = spell;
    }

    public int getCamp() {
        return this.camp;
    }

    public String getSpell() {
        return this.Spell;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getGood() {
        return this.good;
    }

    public void ALLATORIxDEMO(boolean camp, int man, int type, String name) {
        this.camp = camp ? 1 : 0;
        this.man = man;
        this.type = type;
        if (type == 1) {
            this.Spell = name;
            return;
        }
        if (type != 2) return;
        this.good = new BigDecimal(name);
    }

    public int getMan() {
        return this.man;
    }
}
