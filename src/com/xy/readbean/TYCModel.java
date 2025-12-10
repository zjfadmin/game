/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Skill
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.readbean;

import com.xy.readbean.Skill;
import com.xy.v.IiiiiiiiiIIII;

public class TYCModel {
    private int key;
    private int index;
    private int lvl;
    private int type;
    private Skill skill;
    private int skillId;

    public boolean ALLATORIxDEMO(TYCModel model) {
        if (this.type != model.getType()) return false;
        if (this.key != model.getKey()) return false;
        if (this.lvl != model.getLvl()) return false;
        return true;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public TYCModel(int type, int key, int index) {
        this.type = type;
        this.key = key;
        this.index = index;
    }

    public int getKey() {
        return this.key;
    }

    public Skill getSkill(IiiiiiiiiIIII objectArea) {
        if (this.skill != null) return this.skill;
        this.skill = objectArea.iIiIiiiiIIiii(String.valueOf(this.skillId));
        return this.skill;
    }

    public int getType() {
        return this.type;
    }

    public int getIndex() {
        return this.index;
    }

    public String getSkillName(IiiiiiiiiIIII objectArea) {
        this.getSkill(objectArea);
        if (this.skill == null) return "\u672a\u77e5\u6280\u80fd";
        return this.skill.getSkillname();
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return this.skillId;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getLvl() {
        return this.lvl;
    }
}
