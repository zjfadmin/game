/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Buff
 */
package com.xy.readbean;

import com.xy.readbean.Buff;
import java.util.Map;

public class AllBuff {
    private Map<Integer, Buff> buffMap;

    public Buff getBuff(int id) {
        return this.buffMap.get(id);
    }

    public void setBuffMap(Map<Integer, Buff> buffMap) {
        this.buffMap = buffMap;
    }

    public Map<Integer, Buff> getBuffMap() {
        return this.buffMap;
    }
}
