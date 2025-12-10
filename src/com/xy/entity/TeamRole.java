/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.bean.LoginResult
 */
package com.xy.entity;

import com.xy.bean.LoginResult;
import java.math.BigDecimal;

public class TeamRole {
    private int grade;
    private String name;
    private BigDecimal roleId;
    private int state;
    private BigDecimal speciesId;

    public BigDecimal getSpeciesId() {
        return this.speciesId;
    }

    public void ALLATORIxDEMO(TeamRole teamRole) {
        this.name = teamRole.name;
        this.speciesId = teamRole.speciesId;
        this.grade = teamRole.grade;
        this.state = teamRole.state;
    }

    public void setSpeciesId(BigDecimal speciesId) {
        this.speciesId = speciesId;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public TeamRole(LoginResult loginResult) {
        this.roleId = loginResult.getRole_id();
        this.name = loginResult.getRolename();
        this.speciesId = loginResult.getSpecies_id();
        this.grade = loginResult.getGrade();
        this.state = 0;
    }

    public void setRoleId(BigDecimal roleId) {
        this.roleId = roleId;
    }

    public int getState() {
        return this.state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getGrade() {
        return this.grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRoleId() {
        return this.roleId;
    }
}
