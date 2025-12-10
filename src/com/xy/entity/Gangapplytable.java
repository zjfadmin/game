/*
 * Decompiled with CFR 0.152.
 */
package com.xy.entity;

import java.math.BigDecimal;

public class Gangapplytable {
    private BigDecimal role_id;
    private BigDecimal gangid;
    private BigDecimal grade;
    private String rolename;
    private String race_name;

    public void setGangid(BigDecimal gangid) {
        this.gangid = gangid;
    }

    public String getRace_name() {
        return this.race_name;
    }

    public BigDecimal getGangid() {
        return this.gangid;
    }

    public BigDecimal getGrade() {
        return this.grade;
    }

    public void setRole_id(BigDecimal role_id) {
        this.role_id = role_id;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public BigDecimal getRole_id() {
        return this.role_id;
    }

    public void setGrade(BigDecimal grade) {
        this.grade = grade;
    }

    public String getRolename() {
        return this.rolename;
    }

    public void setRace_name(String race_name) {
        this.race_name = race_name;
    }
}
