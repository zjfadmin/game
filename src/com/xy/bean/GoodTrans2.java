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
import java.math.BigDecimal;

public class GoodTrans2 {
    private BigDecimal money;
    private boolean i;
    private Goodstable goods;
    private Lingbao lingbao;
    private RoleSummoning pet;

    public Lingbao getLingbao() {
        return this.lingbao;
    }

    public Goodstable getGoods() {
        return this.goods;
    }

    public BigDecimal getMoney() {
        return this.money;
    }

    public void setGoods(Goodstable goods) {
        this.goods = goods;
    }

    public void setPet(RoleSummoning pet) {
        this.pet = pet;
    }

    public boolean ALLATORIxDEMO() {
        return this.i;
    }

    public void setI(boolean i) {
        this.i = i;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public void setLingbao(Lingbao lingbao) {
        this.lingbao = lingbao;
    }

    public RoleSummoning getPet() {
        return this.pet;
    }
}
