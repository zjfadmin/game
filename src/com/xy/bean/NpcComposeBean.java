/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;
import java.util.List;

public class NpcComposeBean {
    private String composetype;
    private List<BigDecimal> goodstables;

    public void setComposetype(String composetype) {
        this.composetype = composetype;
    }

    public String getComposetype() {
        return this.composetype;
    }

    public List<BigDecimal> getGoodstables() {
        return this.goodstables;
    }

    public void setGoodstables(List<BigDecimal> goodstables) {
        this.goodstables = goodstables;
    }
}
