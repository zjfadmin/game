/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

public class ConfirmBean {
    private int type;
    private String MSG;
    private String value;

    public ConfirmBean() {
    }

    public void setMSG(String mSG) {
        this.MSG = mSG;
    }

    public ConfirmBean(int type, String value, String MSG) {
        this.type = type;
        this.MSG = MSG;
        this.value = value;
    }

    public String getMSG() {
        return this.MSG;
    }

    public String getValue() {
        return this.value;
    }

    public int getType() {
        return this.type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
