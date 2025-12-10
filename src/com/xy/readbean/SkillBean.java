/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Skill
 */
package com.xy.readbean;

import com.xy.readbean.Skill;
import java.util.Iterator;
import java.util.Map;

public class SkillBean {
    private Map<String, Skill> skillMap;

    public void ALLATORIxDEMO() {
        Iterator<Skill> iterator = this.skillMap.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().ALLATORIxDEMO();
        }
    }

    public void setSkillMap(Map<String, Skill> skillMap) {
        this.skillMap = skillMap;
    }

    public Map<String, Skill> getSkillMap() {
        return this.skillMap;
    }
}
