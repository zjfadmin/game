/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.bean.PathPoint
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.bean;

import com.xy.bean.LoginResult;
import com.xy.bean.PathPoint;
import com.xy.v.IIiiIiiiiIIiI;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class RoleShow {
    private String skin;
    private int x;
    private String gangname;
    private String teamInfo;
    private int mount_id;
    private int y;
    private BigDecimal booth_id;
    private String rolename;
    private transient int captian;
    private BigDecimal species_id;
    private List<PathPoint> Player_Paths;
    private int TurnAround = 0;
    private int fighting;
    private Long mapid;
    private Integer skill_id;
    private BigDecimal gang_id;
    private String title;
    private BigDecimal troop_id;
    private Integer grade;
    private double sp = 0.24;
    private BigDecimal role_id;

    public BigDecimal getRole_id() {
        return this.role_id;
    }

    public void setFighting(int fighting) {
        this.fighting = fighting;
    }

    public void setRole_id(BigDecimal role_id) {
        this.role_id = role_id;
    }

    public void setTroop_id(BigDecimal troop_id) {
        this.troop_id = troop_id;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public int getX() {
        return this.x;
    }

    public BigDecimal getTroop_id() {
        return this.troop_id;
    }

    public void setMapid(Long mapid) {
        this.mapid = mapid;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public int getFighting() {
        return this.fighting;
    }

    public String getTeamInfo() {
        return this.teamInfo;
    }

    public List<PathPoint> getPlayer_Paths() {
        return this.Player_Paths;
    }

    public RoleShow() {
    }

    public void ALLATORIxDEMO(LoginResult loginResult) {
        if (this.Player_Paths == null) {
            this.Player_Paths = new ArrayList<PathPoint>();
        } else {
            this.Player_Paths.clear();
        }
        this.x = loginResult.getX().intValue();
        this.y = loginResult.getY().intValue();
        this.mapid = loginResult.getMapid();
        this.role_id = loginResult.getRole_id();
        this.gang_id = loginResult.getGang_id();
        this.gangname = loginResult.getGangname();
        this.species_id = loginResult.getSpecies_id();
        this.booth_id = loginResult.getBooth_id();
        this.skill_id = loginResult.getSkill_id();
        this.TurnAround = loginResult.getTurnAround();
        this.grade = loginResult.getGrade();
        this.rolename = loginResult.getRolename();
        this.title = loginResult.getTitle();
        this.fighting = loginResult.getFighting();
        this.mount_id = loginResult.getMount_id();
        this.troop_id = loginResult.getTroop_id();
        this.teamInfo = loginResult.getTeamInfo();
        this.skin = loginResult.getSkin();
    }

    public void setSp(double sp) {
        this.sp = sp;
    }

    public String getGangname() {
        return this.gangname;
    }

    public int getMount_id() {
        return this.mount_id;
    }

    public void setPlayer_Paths(List<PathPoint> player_Paths) {
        this.Player_Paths = player_Paths;
    }

    public String getRolename() {
        return this.rolename;
    }

    public void setSpecies_id(BigDecimal species_id) {
        this.species_id = species_id;
    }

    public double getSp() {
        return this.sp;
    }

    public BigDecimal getGang_id() {
        return this.gang_id;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public RoleShow(LoginResult loginResult) {
        this.ALLATORIxDEMO(loginResult);
    }

    public void setCaptian(int captian) {
        this.captian = captian;
    }

    public void setGangname(String gangname) {
        this.gangname = gangname;
    }

    public boolean ALLATORIxDEMO() {
        if (this.Player_Paths == null) return false;
        if (this.Player_Paths.size() <= 1) return false;
        return true;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSkill_id(Integer skill_id) {
        this.skill_id = skill_id;
    }

    public BigDecimal getSpecies_id() {
        return this.species_id;
    }

    public BigDecimal getBooth_id() {
        return this.booth_id;
    }

    public String getTeam() {
        if (this.teamInfo == null) return this.rolename;
        if (this.teamInfo.equals("")) return this.rolename;
        if (!this.teamInfo.equals("|")) return this.teamInfo;
        return this.rolename;
    }

    public void setBooth_id(BigDecimal booth_id) {
        this.booth_id = booth_id;
    }

    public void setGang_id(BigDecimal gang_id) {
        this.gang_id = gang_id;
    }

    public Integer getSkill_id() {
        return this.skill_id;
    }

    public int getTurnAround() {
        return this.TurnAround;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSkin() {
        return this.skin;
    }

    public int getCaptian() {
        return this.captian;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void ALLATORIxDEMO(String data, int index, int indexFlag) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            IiiiiiiiIIIII2 = data.indexOf("#", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                IiiiiiiiIIIII2 = indexFlag;
            }
            if (IiiiiiiiIIIII == 0) {
                this.role_id = new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2));
            } else if (IiiiiiiiIIIII == 1) {
                this.species_id = new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2));
            } else if (IiiiiiiiIIIII == 2) {
                this.grade = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 3) {
                this.rolename = data.substring(index, IiiiiiiiIIIII2);
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public void setTeamInfo(String teamInfo) {
        this.teamInfo = teamInfo;
    }

    public Long getMapid() {
        return this.mapid;
    }

    public void setTurnAround(int turnAround) {
        this.TurnAround = turnAround;
    }

    public int getY() {
        return this.y;
    }

    public void setMount_id(int mount_id) {
        this.mount_id = mount_id;
    }
}
