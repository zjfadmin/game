/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.bean.PrivateData
 *  com.xy.entity.Mount
 */
package com.xy.bean;

import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.entity.Mount;
import java.util.List;

public class RoleTransBean {
    private PrivateData privateData;
    private LoginResult loginResult;
    private List<Mount> mounts;

    public List<Mount> getMounts() {
        return this.mounts;
    }

    public void setLoginResult(LoginResult loginResult) {
        this.loginResult = loginResult;
    }

    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }

    public PrivateData getPrivateData() {
        return this.privateData;
    }

    public LoginResult getLoginResult() {
        return this.loginResult;
    }

    public void setPrivateData(PrivateData privateData) {
        this.privateData = privateData;
    }
}
