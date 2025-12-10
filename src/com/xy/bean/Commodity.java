/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 *  com.xy.readbean.Goodstable
 */
package com.xy.bean;

import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;

public class Commodity {
    private long money;
    private String currency;
    private Goodstable good;
    private RoleSummoning pet;
    private Lingbao lingbao;

    public Lingbao getLingbao() {
        return this.lingbao;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCurrency() {
        return this.currency;
    }

    public Goodstable getGood() {
        return this.good;
    }

    public void setLingbao(Lingbao lingbao) {
        this.lingbao = lingbao;
    }

    public RoleSummoning getPet() {
        return this.pet;
    }

    public void setGood(Goodstable good) {
        this.good = good;
    }

    public long getMoney() {
        return this.money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public void setPet(RoleSummoning pet) {
        this.pet = pet;
    }
}
