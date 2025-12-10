/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class GangReward {
    private int rewardNum;
    private int dropNum;
    private BigDecimal goodId;

    public void setRewardNum(int rewardNum) {
        this.rewardNum = rewardNum;
    }

    public void setDropNum(int dropNum) {
        this.dropNum = dropNum;
    }

    public BigDecimal getGoodId() {
        return this.goodId;
    }

    public GangReward(BigDecimal goodId, int dropNum) {
        this.goodId = goodId;
        this.dropNum = dropNum;
    }

    public GangReward(BigDecimal goodId, int dropNum, int rewardNum) {
        this.goodId = goodId;
        this.dropNum = dropNum;
        this.rewardNum = rewardNum;
    }

    public void setGoodId(BigDecimal goodId) {
        this.goodId = goodId;
    }

    public int getDropNum() {
        return this.dropNum;
    }

    public int getRewardNum() {
        return this.rewardNum;
    }

    public void ALLATORIxDEMO() {
        ++this.rewardNum;
    }

    public GangReward() {
    }
}
