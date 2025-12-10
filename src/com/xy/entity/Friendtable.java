/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.BeauBean
 */
package com.xy.entity;

import com.xy.bean.BeauBean;
import java.math.BigDecimal;

public class Friendtable {
    private int OnlineState;
    private BigDecimal grade;
    private BigDecimal species_id;
    private BigDecimal roleid;
    private BigDecimal role_id;
    private String race_name;
    private BeauBean beauBean;
    private String rolename;

    public void setSpecies_id(BigDecimal species_id) {
        this.species_id = species_id;
    }

    public BigDecimal getRoleid() {
        return this.roleid;
    }

    public String getRace_name() {
        return this.race_name;
    }

    public BeauBean getBeauBean() {
        return this.beauBean;
    }

    public BigDecimal getSpecies_id() {
        return this.species_id;
    }

    public void setRoleid(BigDecimal roleid) {
        this.roleid = roleid;
    }

    public int getOnlineState() {
        return this.OnlineState;
    }

    public void setRole_id(BigDecimal role_id) {
        this.role_id = role_id;
    }

    public String getRolename() {
        return this.rolename;
    }

    public void setBeauBean(BeauBean beauBean) {
        this.beauBean = beauBean;
    }

    public BigDecimal getGrade() {
        return this.grade;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public BigDecimal getRole_id() {
        return this.role_id;
    }

    public void setOnlineState(int onlineState) {
        this.OnlineState = onlineState;
    }

    public void setRace_name(String race_name) {
        this.race_name = race_name;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }
}
