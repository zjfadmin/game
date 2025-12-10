/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.FMRole
 */
package com.xy.bean;

import com.xy.bean.FMRole;
import java.math.BigDecimal;
import java.util.List;

public class FMBean {
    private List<FMRole> fmRoleList;
    private FMRole myRole;
    private FMRole fmRole;
    private BigDecimal[] goodIds;
    private String fmTime;

    public void setMyRole(FMRole myRole) {
        this.myRole = myRole;
    }

    public FMRole getFmRole() {
        return this.fmRole;
    }

    public void setFmRoleList(List<FMRole> fmRoleList) {
        this.fmRoleList = fmRoleList;
    }

    public BigDecimal[] getGoodIds() {
        return this.goodIds;
    }

    public FMRole getMyRole() {
        return this.myRole;
    }

    public List<FMRole> getFmRoleList() {
        return this.fmRoleList;
    }

    public void setFmTime(String fmTime) {
        this.fmTime = fmTime;
    }

    public void setGoodIds(BigDecimal[] goodIds) {
        this.goodIds = goodIds;
    }

    public void setFmRole(FMRole fmRole) {
        this.fmRole = fmRole;
    }

    public String getFmTime() {
        return this.fmTime;
    }
}
