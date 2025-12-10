/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattlePlayProgress
 *  com.xy.battle.FightingEvents
 */
package com.xy.battle;

import com.xy.battle.BattlePlayProgress;
import com.xy.battle.FightingEvents;
import java.util.List;

public class BattlePlay {
    private int Progress = 0;
    private long battleId;
    private int battleRound;
    private List<FightingEvents> Round;
    private List<BattlePlayProgress> State;

    public FightingEvents getEvents() {
        return this.Round.get(this.Progress);
    }

    public int getProgress() {
        return this.Progress;
    }

    public void setState(List<BattlePlayProgress> state) {
        this.State = state;
    }

    public void setRound(List<FightingEvents> round) {
        this.Round = round;
    }

    public List<BattlePlayProgress> getState() {
        return this.State;
    }

    public List<FightingEvents> getRound() {
        return this.Round;
    }

    public BattlePlay() {
    }

    public void setProgress(int progress) {
        this.Progress = progress;
    }

    public BattlePlay(long battleId, int battleRound) {
        this.battleId = battleId;
        this.battleRound = battleRound;
    }

    public boolean ALLATORIxDEMO() {
        if (this.Progress >= this.Round.size()) return false;
        return true;
    }
}
