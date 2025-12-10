/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.PartJade
 */
package com.xy.bean;

import com.xy.entity.PartJade;
import java.math.BigDecimal;
import java.util.List;

public class SuitOperBean {
    private int type;
    private List<BigDecimal> goods;
    private PartJade jade;

    public PartJade getJade() {
        return this.jade;
    }

    public void setGoods(List<BigDecimal> goods) {
        this.goods = goods;
    }

    public void setJade(PartJade jade) {
        this.jade = jade;
    }

    public void setType(int type) {
        this.type = type;
    }

    public List<BigDecimal> getGoods() {
        return this.goods;
    }

    public int getType() {
        return this.type;
    }
}
