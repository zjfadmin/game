/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 */
package com.xy.bean;

import com.xy.bean.LoginResult;
import java.math.BigDecimal;

public class GangChangeBean {
    private String gangName;
    private BigDecimal gangid;
    private String msg;
    private String post;

    public void setGangid(BigDecimal gangid) {
        this.gangid = gangid;
    }

    public void setGangName(String gangName) {
        this.gangName = gangName;
    }

    public String getGangName() {
        return this.gangName;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public BigDecimal getGangid() {
        return this.gangid;
    }

    public String getPost() {
        return this.post;
    }

    public GangChangeBean(LoginResult result, String msg) {
        this.gangid = result.getGang_id();
        this.gangName = result.getGangname();
        this.post = result.getGangpost();
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }
}
