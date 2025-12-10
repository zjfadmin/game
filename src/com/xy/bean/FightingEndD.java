/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 *  com.xy.entity.Lingbao
 *  com.xy.entity.RoleSummoning
 */
package com.xy.bean;

import com.xy.bean.LoginResult;
import com.xy.entity.Lingbao;
import com.xy.entity.RoleSummoning;
import java.util.ArrayList;
import java.util.List;

public class FightingEndD {
    private String mData;
    private int type;
    private LoginResult loginResult;
    private List<Lingbao> lingbaos;
    private Integer doorId;
    private RoleSummoning pet;
    private int Fightingsumber;

    public void setFightingsumber(int fightingsumber) {
        this.Fightingsumber = fightingsumber;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void setDoorId(Integer doorId) {
        this.doorId = doorId;
    }

    public List<Lingbao> getLingbaos() {
        if (this.lingbaos != null) return this.lingbaos;
        this.lingbaos = new ArrayList<Lingbao>();
        return this.lingbaos;
    }

    public int getFightingsumber() {
        return this.Fightingsumber;
    }

    public LoginResult getLoginResult() {
        return this.loginResult;
    }

    public int getType() {
        return this.type;
    }

    public void setLoginResult(LoginResult loginResult) {
        this.loginResult = loginResult;
    }

    public void ALLATORIxDEMO(String data) {
        if (this.mData == null) {
            this.mData = data;
            return;
        }
        this.mData = String.valueOf(this.mData) + "%" + data;
    }

    public void setmData(String mData) {
        this.mData = mData;
    }

    public Integer getDoorId() {
        return this.doorId;
    }

    public void setPet(RoleSummoning pet) {
        this.pet = pet;
    }

    public String getmData() {
        return this.mData;
    }

    public RoleSummoning getPet() {
        return this.pet;
    }

    public void setLingbaos(List<Lingbao> lingbaos) {
        this.lingbaos = lingbaos;
    }

    public void ALLATORIxDEMO(Lingbao lingbao) {
        this.getLingbaos().add(lingbao);
    }
}
