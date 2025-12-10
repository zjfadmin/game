/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.StarSoul
 */
package com.xy.readbean;

import com.xy.readbean.StarSoul;
import java.util.concurrent.ConcurrentHashMap;

public class AllStarSoul {
    private ConcurrentHashMap<Integer, StarSoul> starSoulMap;
    private int skillId;
    private transient double[] ls;

    public void setStarSoulMap(ConcurrentHashMap<Integer, StarSoul> starSoulMap) {
        this.starSoulMap = starSoulMap;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public int getSkillId() {
        return this.skillId;
    }

    public ConcurrentHashMap<Integer, StarSoul> getStarSoulMap() {
        return this.starSoulMap;
    }

    public void setLs(double[] ls) {
        this.ls = ls;
    }

    public double[] getLs() {
        return this.ls;
    }
}
