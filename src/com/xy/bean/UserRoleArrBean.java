/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 */
package com.xy.bean;

import com.xy.bean.LoginResult;
import java.util.List;

public class UserRoleArrBean {
    private int phonestatues;
    private List<LoginResult> list;

    public List<LoginResult> getList() {
        return this.list;
    }

    public void setList(List<LoginResult> list) {
        this.list = list;
    }

    public void setPhonestatues(int phonestatues) {
        this.phonestatues = phonestatues;
    }

    public int getPhonestatues() {
        return this.phonestatues;
    }
}
