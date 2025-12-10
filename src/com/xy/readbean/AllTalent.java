/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Talent
 */
package com.xy.readbean;

import com.xy.readbean.Talent;
import java.util.Map;

public class AllTalent {
    private Map<Integer, Talent> allTalent;

    public void setAllTalent(Map<Integer, Talent> allTalent) {
        this.allTalent = allTalent;
    }

    public Map<Integer, Talent> getAllTalent() {
        return this.allTalent;
    }
}
