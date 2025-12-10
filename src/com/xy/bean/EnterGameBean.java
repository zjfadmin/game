/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.bean.PrivateData
 *  com.xy.bean.RoleShow
 *  com.xy.bean.RoleSystem
 *  com.xy.bean.StallBean
 *  com.xy.bean.TeamBean
 *  com.xy.entity.Baby
 *  com.xy.entity.Lingbao
 *  com.xy.entity.Mount
 *  com.xy.entity.PackRecord
 *  com.xy.entity.Pal
 *  com.xy.entity.RoleSummoning
 *  com.xy.readbean.Goodstable
 */
package com.xy.bean;

import com.xy.bean.LoginResult;
import com.xy.bean.PrivateData;
import com.xy.bean.RoleShow;
import com.xy.bean.RoleSystem;
import com.xy.bean.StallBean;
import com.xy.bean.TeamBean;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.entity.Mount;
import com.xy.entity.PackRecord;
import com.xy.entity.Pal;
import com.xy.entity.RoleSummoning;
import com.xy.readbean.Goodstable;
import java.util.List;

public class EnterGameBean {
    private long serverTime;
    private List<RoleSummoning> roleSummonings;
    private String monster;
    private List<Pal> pals;
    private TeamBean teamBean;
    private String activity;
    private String sceneMsg;
    private List<RoleShow> roleShows;
    private PrivateData privateData;
    private List<StallBean> stallBeans;
    private PackRecord packRecord;
    private List<Baby> babys;
    private List<Goodstable> list;
    private List<Lingbao> lingbaos;
    private List<Mount> mounts;
    private LoginResult loginResult;
    private RoleSystem roleSystem;

    public List<RoleSummoning> getRoleSummonings() {
        return this.roleSummonings;
    }

    public void setSceneMsg(String sceneMsg) {
        this.sceneMsg = sceneMsg;
    }

    public TeamBean getTeamBean() {
        return this.teamBean;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public void setRoleSummonings(List<RoleSummoning> roleSummonings) {
        this.roleSummonings = roleSummonings;
    }

    public void setRoleSystem(RoleSystem roleSystem) {
        this.roleSystem = roleSystem;
    }

    public void setList(List<Goodstable> list) {
        this.list = list;
    }

    public List<StallBean> getStallBeans() {
        return this.stallBeans;
    }

    public void setBabys(List<Baby> babys) {
        this.babys = babys;
    }

    public RoleSystem getRoleSystem() {
        return this.roleSystem;
    }

    public void setPals(List<Pal> pals) {
        this.pals = pals;
    }

    public void setServerTime(long serverTime) {
        this.serverTime = serverTime;
    }

    public String getMonster() {
        return this.monster;
    }

    public long getServerTime() {
        return this.serverTime;
    }

    public void setLingbaos(List<Lingbao> lingbaos) {
        this.lingbaos = lingbaos;
    }

    public List<RoleShow> getRoleShows() {
        return this.roleShows;
    }

    public List<Mount> getMounts() {
        return this.mounts;
    }

    public void setStallBeans(List<StallBean> stallBeans) {
        this.stallBeans = stallBeans;
    }

    public List<Lingbao> getLingbaos() {
        return this.lingbaos;
    }

    public String getActivity() {
        return this.activity;
    }

    public List<Goodstable> getList() {
        return this.list;
    }

    public List<Pal> getPals() {
        return this.pals;
    }

    public PackRecord getPackRecord() {
        return this.packRecord;
    }

    public String getSceneMsg() {
        return this.sceneMsg;
    }

    public void setTeamBean(TeamBean teamBean) {
        this.teamBean = teamBean;
    }

    public void setRoleShows(List<RoleShow> roleShows) {
        this.roleShows = roleShows;
    }

    public void setMonster(String monster) {
        this.monster = monster;
    }

    public void setLoginResult(LoginResult loginResult) {
        this.loginResult = loginResult;
    }

    public void setPrivateData(PrivateData privateData) {
        this.privateData = privateData;
    }

    public PrivateData getPrivateData() {
        return this.privateData;
    }

    public void setMounts(List<Mount> mounts) {
        this.mounts = mounts;
    }

    public void setPackRecord(PackRecord packRecord) {
        this.packRecord = packRecord;
    }

    public List<Baby> getBabys() {
        return this.babys;
    }

    public LoginResult getLoginResult() {
        return this.loginResult;
    }
}
