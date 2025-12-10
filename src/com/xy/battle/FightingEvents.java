/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.FightingState
 */
package com.xy.battle;

import com.xy.battle.FightingState;
import java.util.List;

public class FightingEvents {
    private List<FightingState> Accepterlist;
    private String tips;
    private FightingState Originator;
    private int Fightingsum;
    private int CurrentRound;

    public void setCurrentRound(int currentRound) {
        this.CurrentRound = currentRound;
    }

    public int getCurrentRound() {
        return this.CurrentRound;
    }

    public void setAccepterlist(List<FightingState> accepterlist) {
        this.Accepterlist = accepterlist;
    }

    public FightingState getOriginator() {
        return this.Originator;
    }

    public List<FightingState> getAccepterlist() {
        return this.Accepterlist;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }

    public void setOriginator(FightingState originator) {
        this.Originator = originator;
    }

    public String getTips() {
        return this.tips;
    }

    public int getFightingsum() {
        return this.Fightingsum;
    }

    public void setFightingsum(int fightingsum) {
        this.Fightingsum = fightingsum;
    }
}
