/*
 * Decompiled with CFR 0.152.
 */
package com.xy.entity;

import java.math.BigDecimal;

public class MountSkill {
    private String skillname;
    private BigDecimal mid;
    private BigDecimal skillid;

    public void setSkillid(BigDecimal skillid) {
        this.skillid = skillid;
    }

    public BigDecimal getSkillid() {
        return this.skillid;
    }

    public String getSkillname() {
        return this.skillname;
    }

    public BigDecimal getMid() {
        return this.mid;
    }

    public void setSkillname(String skillname) {
        this.skillname = skillname;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }
}
