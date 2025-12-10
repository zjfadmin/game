/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.RoleShow
 *  com.xy.bean.StallBean
 */
package com.xy.bean;

import com.xy.bean.RoleShow;
import com.xy.bean.StallBean;
import java.util.List;

public class GetClientUserMesageBean {
    private String monster;
    private int ismap;
    private List<RoleShow> roleShows;
    private String sceneMsg;
    private List<StallBean> stallBeans;

    public void setRoleShows(List<RoleShow> roleShows) {
        this.roleShows = roleShows;
    }

    public String getMonster() {
        return this.monster;
    }

    public String getSceneMsg() {
        return this.sceneMsg;
    }

    public List<RoleShow> getRoleShows() {
        return this.roleShows;
    }

    public RoleShow ALLATORIxDEMO(long roleId) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = this.roleShows.size();
        while (IiiiiiiiIIIII < IiiiiiiiIIIII2) {
            RoleShow IiiiiiiiIIIII3 = this.roleShows.get(IiiiiiiiIIIII);
            if (IiiiiiiiIIIII3.getRole_id().longValue() == roleId) {
                this.roleShows.remove(IiiiiiiiIIIII);
                return IiiiiiiiIIIII3;
            }
            ++IiiiiiiiIIIII;
        }
        return null;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public void setSceneMsg(String sceneMsg) {
        this.sceneMsg = sceneMsg;
    }

    public List<StallBean> getStallBeans() {
        return this.stallBeans;
    }

    public void setIsmap(int ismap) {
        this.ismap = ismap;
    }

    public void setStallBeans(List<StallBean> stallBeans) {
        this.stallBeans = stallBeans;
    }

    public int getIsmap() {
        return this.ismap;
    }
}
