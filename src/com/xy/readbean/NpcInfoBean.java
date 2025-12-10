/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Door
 *  com.xy.readbean.Npctable
 *  com.xy.readbean.Talk
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.readbean;

import com.xy.readbean.Door;
import com.xy.readbean.Npctable;
import com.xy.readbean.Talk;
import com.xy.v.IiiiIiiiiIiIi;
import java.util.List;

public class NpcInfoBean {
    private Npctable npctable;
    private List<Talk> talks;
    private List<Door> doors;

    public List<Door> getDoors() {
        return this.doors;
    }

    public Npctable getNpctable() {
        return this.npctable;
    }

    public void setDoors(List<Door> doors) {
        this.doors = doors;
    }

    public void setTalks(List<Talk> talks) {
        this.talks = talks;
    }

    public Talk ALLATORIxDEMO() {
        if (this.talks == null) return null;
        if (this.talks.size() != 0) return this.talks.get(IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(this.talks.size()));
        return null;
    }

    public List<Talk> getTalks() {
        return this.talks;
    }

    public void setNpctable(Npctable npctable) {
        this.npctable = npctable;
    }
}
