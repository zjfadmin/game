/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.FightingEvents
 */
package com.xy.battle;

import com.xy.battle.FightingEvents;
import java.util.ArrayList;
import java.util.List;

public class FightingRound {
    private List<FightingEvents> Round = new ArrayList<FightingEvents>();
    private int Fightingsumber;
    private int CurrentRound;

    public void setRound(List<FightingEvents> round) {
        this.Round = round;
    }

    public int getCurrentRound() {
        return this.CurrentRound;
    }

    public void setCurrentRound(int currentRound) {
        this.CurrentRound = currentRound;
    }

    public void setFightingsumber(int fightingsumber) {
        this.Fightingsumber = fightingsumber;
    }

    public int getFightingsumber() {
        return this.Fightingsumber;
    }

    public List<FightingEvents> getRound() {
        return this.Round;
    }
}
