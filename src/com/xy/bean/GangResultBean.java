/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.entity.Gang
 *  com.xy.entity.GangGroup
 *  com.xy.entity.Gangapplytable
 */
package com.xy.bean;

import com.xy.bean.LoginResult;
import com.xy.entity.Gang;
import com.xy.entity.GangGroup;
import com.xy.entity.Gangapplytable;
import java.util.List;

public class GangResultBean {
    private List<Gangapplytable> gangapplytables;
    private List<LoginResult> roleTables;
    private Gang gang;
    private GangGroup gangGroup;

    public List<LoginResult> getRoleTables() {
        return this.roleTables;
    }

    public GangGroup getGangGroup() {
        return this.gangGroup;
    }

    public void setRoleTables(List<LoginResult> roleTables) {
        this.roleTables = roleTables;
    }

    public Gang getGang() {
        return this.gang;
    }

    public List<Gangapplytable> getGangapplytables() {
        return this.gangapplytables;
    }

    public void setGang(Gang gang) {
        this.gang = gang;
    }

    public void setGangapplytables(List<Gangapplytable> gangapplytables) {
        this.gangapplytables = gangapplytables;
    }

    public void setGangGroup(GangGroup gangGroup) {
        this.gangGroup = gangGroup;
    }
}
