/*
 * Decompiled with CFR 0.152.
 */
package com.xy.entity;

import java.math.BigDecimal;

public class Titletable {
    private BigDecimal roleid;
    private BigDecimal titleid;
    private String titlename;

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public void setTitlename(String titlename) {
        this.titlename = titlename;
    }

    public void setTitleid(BigDecimal titleid) {
        this.titleid = titleid;
    }

    public BigDecimal getTitleid() {
        return this.titleid;
    }

    public BigDecimal getRoleid() {
        return this.roleid;
    }

    public String getTitlename() {
        return this.titlename;
    }
}
