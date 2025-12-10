/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.entity.MountSkill
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.entity;

import com.xy.entity.MountSkill;
import com.xy.v.IIiiIiiiiIIiI;
import java.math.BigDecimal;
import java.util.List;

public class Mount {
    private Integer live;
    private Integer power;
    private Integer mountlvl;
    private Integer Proficiency;
    private Integer useNumber;
    private BigDecimal sid;
    private Integer mountid;
    private Integer bone;
    private String mountname;
    private Integer exquisiteUseTime;
    private String data;
    private BigDecimal sid3;
    private BigDecimal othrersid;
    private Integer exp;
    private Integer spri;
    private BigDecimal roleid;
    List<MountSkill> mountskill;
    private BigDecimal mid;

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public List<MountSkill> getMountskill() {
        return this.mountskill;
    }

    public Integer getPower() {
        return this.power;
    }

    public String getMountlvlString() {
        if (this.mountlvl > 100) return "\u70b9\u5316" + (this.mountlvl - 100) + "\u7ea7";
        return this.mountlvl + "\u7ea7";
    }

    public void setMountid(Integer mountid) {
        this.mountid = mountid;
    }

    public Integer getUseNumber() {
        return this.useNumber;
    }

    public BigDecimal getMid() {
        return this.mid;
    }

    public void setExquisiteUseTime(Integer exquisiteUseTime) {
        this.exquisiteUseTime = exquisiteUseTime;
    }

    public void setLive(Integer live) {
        this.live = live;
    }

    public Integer getProficiency() {
        return this.Proficiency;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public Integer getExp() {
        return this.exp;
    }

    public void setMountskill(List<MountSkill> mountskill) {
        this.mountskill = mountskill;
    }

    public String getData() {
        return this.data;
    }

    public Integer getMountid() {
        return this.mountid;
    }

    public void setSid3(BigDecimal sid3) {
        this.sid3 = sid3;
    }

    public void setDataValue(String head, String value) {
        this.data = IIiiIiiiiIIiI.ALLATORIxDEMO((String)this.data, (String)head, (String)"|", (String)value);
    }

    public int getMountCZ() {
        if (this.mountid < 1) return 0;
        if (this.mountid > 5) {
            return 0;
        }
        String IiiiiiiiIIIII = this.getDataValue("CZ");
        if (!IIiiIiiiiIIiI.iIiIiiiiIIiIi((String)IiiiiiiiIIIII)) return IIiiIiiiiIIiI.ALLATORIxDEMO((String)IiiiiiiiIIIII);
        return 0;
    }

    public void setUseNumber(Integer useNumber) {
        this.useNumber = useNumber;
    }

    public Integer getMountlvl() {
        return this.mountlvl;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public void setOthrersid(BigDecimal othrersid) {
        this.othrersid = othrersid;
    }

    public Integer getExquisiteUseTime() {
        return this.exquisiteUseTime;
    }

    public String getDataValue(String head) {
        return IIiiIiiiiIIiI.iIiIiiiiIIiii((String)this.data, (String)head, (String)"|");
    }

    public BigDecimal getSid() {
        return this.sid;
    }

    public BigDecimal getRoleid() {
        return this.roleid;
    }

    public void setSpri(Integer spri) {
        this.spri = spri;
    }

    public void setSid(BigDecimal sid) {
        this.sid = sid;
    }

    public Integer getLive() {
        return this.live;
    }

    public void setMountname(String mountname) {
        this.mountname = mountname;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }

    public void setProficiency(Integer proficiency) {
        this.Proficiency = proficiency;
    }

    public Integer getSpri() {
        return this.spri;
    }

    public Integer getBone() {
        return this.bone;
    }

    public void setBone(Integer bone) {
        this.bone = bone;
    }

    public BigDecimal getOthrersid() {
        return this.othrersid;
    }

    public BigDecimal getSid3() {
        return this.sid3;
    }

    public String getMountname() {
        return this.mountname;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setMountlvl(Integer mountlvl) {
        this.mountlvl = mountlvl;
    }

    public boolean ALLATORIxDEMO(BigDecimal ID) {
        if (ID == null) {
            return false;
        }
        if (this.sid != null && this.sid.compareTo(ID) == 0) {
            return true;
        }
        if (this.othrersid != null && this.othrersid.compareTo(ID) == 0) {
            return true;
        }
        if (this.sid3 == null) return false;
        if (this.sid3.compareTo(ID) != 0) return false;
        return true;
    }
}
