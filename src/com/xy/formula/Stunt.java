/*
 * Decompiled with CFR 0.152.
 */
package com.xy.formula;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class Stunt {
    private int maxSum;
    private double value;
    private int sum;
    private int suitid;
    private int skillId;
    private int lvl;

    public int getSuitid() {
        return this.suitid;
    }

    public int getMaxSum() {
        return this.maxSum;
    }

    public Stunt(int skillId, int suitid, int lvl, int maxSum) {
        this.skillId = skillId;
        this.suitid = suitid;
        this.lvl = lvl;
        this.maxSum = maxSum;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public boolean iIiIiiiiIIiii() {
        if (this.sum < this.maxSum) return false;
        return true;
    }

    public int getSkillId() {
        return this.skillId;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void ALLATORIxDEMO() {
        ++this.sum;
    }

    public int getSum() {
        return this.sum;
    }

    public double getValue() {
        return this.value;
    }

    public void setMaxSum(int maxSum) {
        this.maxSum = maxSum;
    }

    public boolean ALLATORIxDEMO() {
        if (this.skillId >= 6001) {
            if (this.skillId <= 6017) return true;
        }
        if (this.skillId == 6030) return true;
        if (this.skillId == 6035) return true;
        if (this.skillId == 6036) return true;
        if (this.skillId == 6039) return true;
        if (this.skillId == 6031) return true;
        if (this.skillId == 6032) return true;
        if (this.skillId >= 8001) {
            if (this.skillId <= 8023) return true;
        }
        if (this.skillId >= 8030) {
            if (this.skillId <= 8036) return true;
        }
        if (this.skillId < 8038) return false;
        if (this.skillId > 8039) return false;
        return true;
    }

    public void setSuitid(int suitid) {
        this.suitid = suitid;
    }

    public int getLvl() {
        return this.lvl;
    }
}
