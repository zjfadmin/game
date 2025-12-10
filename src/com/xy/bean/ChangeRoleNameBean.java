/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class ChangeRoleNameBean {
    private boolean flag;
    private BigDecimal rgid;
    private String newName;
    private String oldName;

    public void setNewName(String newName) {
        this.newName = newName;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public void setRgid(BigDecimal rgid) {
        this.rgid = rgid;
    }

    public BigDecimal getRgid() {
        return this.rgid;
    }

    public void setOldName(String oldName) {
        this.oldName = oldName;
    }

    public String getOldName() {
        return this.oldName;
    }

    public boolean ALLATORIxDEMO() {
        return this.flag;
    }

    public String getNewName() {
        return this.newName;
    }
}
