/*
 * Decompiled with CFR 0.152.
 */
package com.xy.entity;

import java.math.BigDecimal;

public class Friend {
    private BigDecimal roleid;
    private BigDecimal friendid;
    private BigDecimal fid;

    public void setFid(BigDecimal fid) {
        this.fid = fid;
    }

    public BigDecimal getRoleid() {
        return this.roleid;
    }

    public BigDecimal getFid() {
        return this.fid;
    }

    public BigDecimal getFriendid() {
        return this.friendid;
    }

    public void setFriendid(BigDecimal friendid) {
        this.friendid = friendid;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }
}
