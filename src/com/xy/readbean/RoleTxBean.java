/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class RoleTxBean {
    private int RdType;
    private int RdId;
    private int RdStatues;
    private int Gid;
    private String RdName;
    private String RdAsk;

    public void setRdId(int rdId) {
        this.RdId = rdId;
    }

    public void setRdType(int rdType) {
        this.RdType = rdType;
    }

    public String getRdName() {
        return this.RdName;
    }

    public void setRdName(String rdName) {
        this.RdName = rdName;
    }

    public void setRdStatues(int rdStatues) {
        this.RdStatues = rdStatues;
    }

    public int getGid() {
        return this.Gid;
    }

    public void setRdAsk(String rdAsk) {
        this.RdAsk = rdAsk;
    }

    public String getRdAsk() {
        return this.RdAsk;
    }

    public int getRdId() {
        return this.RdId;
    }

    public int getRdStatues() {
        return this.RdStatues;
    }

    public int getRdType() {
        return this.RdType;
    }

    public void setGid(int gid) {
        this.Gid = gid;
    }
}
