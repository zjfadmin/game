/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Skill
 */
package com.xy.formula;

import com.xy.readbean.Skill;

public class BaseSkillData {
    private Skill skill;
    private int sldMax;
    private int sld;

    public int getSld() {
        return this.sld;
    }

    public BaseSkillData(Skill skill) {
        this.skill = skill;
    }

    public void setSldMax(int sldMax) {
        this.sldMax = sldMax;
    }

    public Skill getSkill() {
        return this.skill;
    }

    public int getSldMax() {
        return this.sldMax;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public void setSld(int sld) {
        this.sld = sld;
    }
}
