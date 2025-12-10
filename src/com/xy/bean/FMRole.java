/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

import java.math.BigDecimal;

public class FMRole {
    private int fmjf;
    private Integer grade;
    private int fmjfPast;
    private int fmPlace;
    private BigDecimal role_id;
    private int fmPlacePast;
    private String rolename;
    private BigDecimal species_id;

    public BigDecimal getSpecies_id() {
        return this.species_id;
    }

    public int getFmPlace() {
        return this.fmPlace;
    }

    public void setFmPlacePast(int fmPlacePast) {
        this.fmPlacePast = fmPlacePast;
    }

    public void setSpecies_id(BigDecimal species_id) {
        this.species_id = species_id;
    }

    public int getFmPlacePast() {
        return this.fmPlacePast;
    }

    public void setFmjfPast(int fmjfPast) {
        this.fmjfPast = fmjfPast;
    }

    public int getFmjfPast() {
        return this.fmjfPast;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public void setRole_id(BigDecimal role_id) {
        this.role_id = role_id;
    }

    public void setFmPlace(int fmPlace) {
        this.fmPlace = fmPlace;
    }

    public Integer getGrade() {
        return this.grade;
    }

    public void setFmjf(int fmjf) {
        this.fmjf = fmjf;
    }

    public int getFmjf() {
        return this.fmjf;
    }

    public BigDecimal getRole_id() {
        return this.role_id;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename;
    }

    public String getRolename() {
        return this.rolename;
    }
}
