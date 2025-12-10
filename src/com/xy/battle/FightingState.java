/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.battle.BattleMan
 */
package com.xy.battle;

import com.xy.battle.BattleMan;
import java.math.BigDecimal;

public class FightingState {
    private int man;
    private String endState;
    private String skin;
    private BigDecimal nq_c;
    private String state_1;
    private Integer delayTime;
    private String proces;
    private String state_2;
    private String up;
    private String skillskin;
    private int Camp;
    private String StartState;
    private BigDecimal mp_c;
    private BigDecimal yq_c;
    private String buff;
    private String text;
    private BigDecimal hp_c;
    private String msg;
    private BattleMan data;
    private String skillsy;

    public String getProcessState() {
        return this.proces;
    }

    public BigDecimal getYq_c() {
        return this.yq_c;
    }

    public void setEndState_1(String endState_1) {
        this.state_1 = endState_1;
    }

    public String getStartState() {
        if (this.StartState != null) {
            if (!this.StartState.equals("")) return this.StartState;
        }
        this.StartState = "\u4ee3\u4ef7";
        return this.StartState;
    }

    public FightingState() {
    }

    public Integer getDelayTime() {
        return this.delayTime;
    }

    public FightingState(int camp, int man, String startState) {
        this.Camp = camp;
        this.man = man;
        this.StartState = startState;
    }

    public void setProcessState(String ProcessState) {
        this.proces = ProcessState;
    }

    public String getSkin() {
        return this.skin;
    }

    public BigDecimal getMp_Change() {
        return this.mp_c;
    }

    public String getText() {
        return this.text;
    }

    public void setMan(int man) {
        this.man = man;
    }

    public BigDecimal getNq_c() {
        return this.nq_c;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public int getCamp() {
        return this.Camp;
    }

    public void setMp_Change(int mp_Change) {
        if (this.mp_c == null) {
            this.mp_c = new BigDecimal(mp_Change);
            return;
        }
        this.mp_c = new BigDecimal(this.mp_c.intValue() + mp_Change);
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setStartState(String startState) {
        this.StartState = startState;
    }

    public void setCamp(int camp) {
        this.Camp = camp;
    }

    public void setSkillsy(String skillsy) {
        this.skillsy = skillsy;
    }

    public void setUp(String up) {
        this.up = up;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }

    public String getBuff() {
        return this.buff;
    }

    public String getEndState() {
        return this.endState;
    }

    public void setNq_c(int nq_c) {
        if (this.nq_c == null) {
            this.nq_c = new BigDecimal(nq_c);
            return;
        }
        this.nq_c = new BigDecimal(this.nq_c.intValue() + nq_c);
    }

    public String getEndState_1() {
        return this.state_1;
    }

    public void setSkillskin(String skillskin) {
        this.skillskin = skillskin;
    }

    public void setYq_c(int yq_c) {
        if (this.yq_c == null) {
            this.yq_c = new BigDecimal(yq_c);
            return;
        }
        this.yq_c = new BigDecimal(this.yq_c.intValue() + yq_c);
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public BigDecimal getHp_Change() {
        return this.hp_c;
    }

    public BattleMan getFightingManData() {
        return this.data;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getEndState_2() {
        return this.state_2;
    }

    public int getMan() {
        return this.man;
    }

    public void setHp_Change(int hp_Change) {
        if (this.hp_c == null) {
            this.hp_c = new BigDecimal(hp_Change);
            return;
        }
        this.hp_c = new BigDecimal(this.hp_c.intValue() + hp_Change);
    }

    public String getSkillsy() {
        return this.skillsy;
    }

    public void setEndState_2(String endState_2) {
        this.state_2 = endState_2;
    }

    public String getSkillskin() {
        return this.skillskin;
    }

    public void setEndState(String endState) {
        this.endState = endState;
    }

    public String getUp() {
        return this.up;
    }

    public void setFightingManData(BattleMan fightingManData) {
        this.data = fightingManData;
    }
}
