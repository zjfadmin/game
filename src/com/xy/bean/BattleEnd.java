/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.AssetUpdate
 *  com.xy.bean.OneArenaBean
 */
package com.xy.bean;

import com.xy.bean.AssetUpdate;
import com.xy.bean.OneArenaBean;

public class BattleEnd {
    private String taskn;
    private String msg;
    private String taskDaily;
    private AssetUpdate assetUpdate;
    private int camp;
    private OneArenaBean arenaBean;
    private int FightingNumber;

    public int getCamp() {
        return this.camp;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public OneArenaBean getArenaBean() {
        return this.arenaBean;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getTaskDaily() {
        return this.taskDaily;
    }

    public int getFightingNumber() {
        return this.FightingNumber;
    }

    public void setTaskDaily(String taskDaily) {
        this.taskDaily = taskDaily;
    }

    public void setFightingNumber(int fightingNumber) {
        this.FightingNumber = fightingNumber;
    }

    public AssetUpdate getAssetUpdate() {
        return this.assetUpdate;
    }

    public void setArenaBean(OneArenaBean arenaBean) {
        this.arenaBean = arenaBean;
    }

    public String getTaskn() {
        return this.taskn;
    }

    public void setCamp(int camp) {
        this.camp = camp;
    }

    public void setTaskn(String taskn) {
        this.taskn = taskn;
    }

    public void setAssetUpdate(AssetUpdate assetUpdate) {
        this.assetUpdate = assetUpdate;
    }
}
