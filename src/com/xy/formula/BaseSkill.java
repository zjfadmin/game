/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.BaseQl
 *  com.xy.readbean.Skill
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.formula;

import com.xy.formula.BaseQl;
import com.xy.readbean.Skill;
import com.xy.v.IiiiiiiiiIIII;

public class BaseSkill {
    private BaseQl ql;
    private Skill skill;
    private int skillId;
    private double pz;
    private int lvl;

    public BaseSkill(int skillId, int lvl, Skill skill, BaseQl ql) {
        this.skillId = skillId;
        this.lvl = lvl;
        this.skill = skill;
        this.ql = ql;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public boolean ALLATORIxDEMO() {
        if (this.skillId >= 6001) {
            if (this.skillId <= 6017) return true;
        }
        if (this.skillId == 6030) return true;
        if (this.skillId == 6035) return true;
        if (this.skillId == 6036) return true;
        if (this.skillId == 6039) return true;
        if (this.skillId == 6031) return true;
        if (this.skillId == 6032) return true;
        if (this.skillId >= 8001) {
            if (this.skillId <= 8023) return true;
        }
        if (this.skillId >= 8030) {
            if (this.skillId <= 8036) return true;
        }
        if (this.skillId < 8038) return false;
        if (this.skillId > 8039) return false;
        return true;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public BaseSkill() {
    }

    public void setPz(double pz) {
        this.pz = pz;
    }

    public void setQl(BaseQl ql) {
        this.ql = ql;
    }

    public int getSkillId() {
        return this.skillId;
    }

    public BaseSkill(int skillId, int lvl, double pz, Skill skill) {
        this.skillId = skillId;
        this.lvl = lvl;
        this.pz = pz;
        this.skill = skill;
    }

    public BaseQl getQl() {
        return this.ql;
    }

    public double getPz() {
        return this.pz;
    }

    public Skill getSkill(IiiiiiiiiIIII objectArea) {
        if (this.skill != null) return this.skill;
        this.skill = objectArea.iIiIiiiiIIiii(String.valueOf(this.skillId));
        return this.skill;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public BaseSkill(int skillId, int lvl) {
        this.skillId = skillId;
        this.lvl = lvl;
    }

    public int getLvl() {
        return this.lvl;
    }
}
