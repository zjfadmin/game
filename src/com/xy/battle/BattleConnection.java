/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleMan
 *  com.xy.battle.BattlePlay
 *  com.xy.battle.FightingEvents
 */
package com.xy.battle;

import com.xy.battle.BattleMan;
import com.xy.battle.BattlePlay;
import com.xy.battle.FightingEvents;
import java.util.List;

public class BattleConnection {
    public int BattleType;
    private int eventState;
    public int FightingNumber;
    private List<BattleMan> datas;
    private List<FightingEvents> playeEvents;
    private long time;
    private int Round;
    public String buff;
    public String tip;
    private int state;

    public int getRound() {
        return this.Round;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setFightingNumber(int fightingNumber) {
        this.FightingNumber = fightingNumber;
    }

    public List<BattleMan> getDatas() {
        return this.datas;
    }

    public void setEventState(int eventState) {
        this.eventState = eventState;
    }

    public List<FightingEvents> getPlayeEvents() {
        return this.playeEvents;
    }

    public void setRound(int round) {
        this.Round = round;
    }

    public String getTip() {
        return this.tip;
    }

    public void setPlayeEvents(List<FightingEvents> playeEvents) {
        this.playeEvents = playeEvents;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getBattleType() {
        return this.BattleType;
    }

    public void setDatas(List<BattleMan> datas) {
        this.datas = datas;
    }

    public int getEventState() {
        return this.eventState;
    }

    public void setBattleType(int battleType) {
        this.BattleType = battleType;
    }

    public long getTime() {
        return this.time;
    }

    public String getBuff() {
        return this.buff;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }

    public int getFightingNumber() {
        return this.FightingNumber;
    }

    public int getState() {
        return this.state;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public BattlePlay getPlay() {
        BattlePlay battlePlay = new BattlePlay((long)this.FightingNumber, this.Round);
        battlePlay.setRound(this.playeEvents);
        return battlePlay;
    }
}
