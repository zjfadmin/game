/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.ActiveAward
 *  com.xy.readbean.ActiveBase
 *  com.xy.readbean.Assist
 */
package com.xy.readbean;

import com.xy.readbean.ActiveAward;
import com.xy.readbean.ActiveBase;
import com.xy.readbean.Assist;
import java.util.List;

public class AllActive {
    private ActiveAward[] awards;
    private String[] totals;
    private List<Assist> assistList;
    private ActiveBase[] bases;

    public void setAssistList(List<Assist> assistList) {
        this.assistList = assistList;
    }

    public void setAwards(ActiveAward[] awards) {
        this.awards = awards;
    }

    public ActiveBase[] getBases() {
        return this.bases;
    }

    public String[] getTotals() {
        return this.totals;
    }

    public void setTotals(String[] totals) {
        this.totals = totals;
    }

    public void setBases(ActiveBase[] bases) {
        this.bases = bases;
    }

    public List<Assist> getAssistList() {
        return this.assistList;
    }

    public ActiveAward[] getAwards() {
        return this.awards;
    }
}
