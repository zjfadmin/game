/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.AssetUpdate
 */
package com.xy.bean;

import com.xy.bean.AssetUpdate;
import java.math.BigDecimal;

public class QuackGameBean {
    private int type;
    private BigDecimal money;
    private String petmsg2;
    private AssetUpdate assetUpdate;
    private String petmsg;
    private Integer index;

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getPetmsg() {
        return this.petmsg;
    }

    public Integer getIndex() {
        return this.index;
    }

    public int getType() {
        return this.type;
    }

    public void setPetmsg(String petmsg) {
        this.petmsg = petmsg;
    }

    public void setAssetUpdate(AssetUpdate assetUpdate) {
        this.assetUpdate = assetUpdate;
    }

    public AssetUpdate getAssetUpdate() {
        return this.assetUpdate;
    }

    public void setType(int type) {
        this.type = type;
    }

    public BigDecimal getMoney() {
        return this.money;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public void setPetmsg2(String petmsg2) {
        this.petmsg2 = petmsg2;
    }

    public String getPetmsg2() {
        return this.petmsg2;
    }
}
