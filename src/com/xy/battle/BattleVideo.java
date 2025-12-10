/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleMan
 *  com.xy.battle.FightingEvents
 */
package com.xy.battle;

import com.xy.battle.BattleMan;
import com.xy.battle.FightingEvents;
import java.util.List;

public class BattleVideo {
    public String tip;
    private List<BattleMan> datas;
    private int round;
    public int BattleType;
    private List<List<FightingEvents>> lists;
    public String buff;

    public List<BattleMan> getDatas() {
        return this.datas;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setLists(List<List<FightingEvents>> lists) {
        this.lists = lists;
    }

    public void setBattleType(int battleType) {
        this.BattleType = battleType;
    }

    public List<List<FightingEvents>> getLists() {
        return this.lists;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }

    public int getBattleType() {
        return this.BattleType;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public String getBuff() {
        return this.buff;
    }

    public int getRound() {
        return this.round;
    }

    public String getTip() {
        return this.tip;
    }

    public void setDatas(List<BattleMan> datas) {
        this.datas = datas;
    }
}
