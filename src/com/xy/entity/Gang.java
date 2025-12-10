/*
 * Decompiled with CFR 0.152.
 */
package com.xy.entity;

import java.math.BigDecimal;

public class Gang {
    private BigDecimal builder;
    private BigDecimal pkvalue;
    private BigDecimal property;
    private BigDecimal gangnumber;
    private String introduction;
    private BigDecimal gangid;
    private String gangname;
    private BigDecimal ganggrade;
    private String gangbelong;
    private String founder;

    public String getIntroduction() {
        return this.introduction;
    }

    public BigDecimal getGangnumber() {
        return this.gangnumber;
    }

    public void setFounder(String founder) {
        this.founder = founder == null ? null : founder.trim();
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public void setBuilder(BigDecimal builder) {
        this.builder = builder;
    }

    public void setGanggrade(BigDecimal ganggrade) {
        this.ganggrade = ganggrade;
    }

    public void setGangid(BigDecimal gangid) {
        this.gangid = gangid;
    }

    public void setGangnumber(BigDecimal gangnumber) {
        this.gangnumber = gangnumber;
    }

    public BigDecimal getProperty() {
        return this.property;
    }

    public BigDecimal getGangid() {
        return this.gangid;
    }

    public BigDecimal getPkvalue() {
        return this.pkvalue;
    }

    public BigDecimal getBuilder() {
        return this.builder;
    }

    public String getFounder() {
        return this.founder;
    }

    public String getGangname() {
        return this.gangname;
    }

    public void setGangbelong(String gangbelong) {
        this.gangbelong = gangbelong == null ? null : gangbelong.trim();
    }

    public BigDecimal getGanggrade() {
        return this.ganggrade;
    }

    public void setPkvalue(BigDecimal pkvalue) {
        this.pkvalue = pkvalue;
    }

    public String getGangbelong() {
        return this.gangbelong;
    }

    public void setGangname(String gangname) {
        this.gangname = gangname == null ? null : gangname.trim();
    }

    public void setProperty(BigDecimal property) {
        this.property = property;
    }
}
