/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

import java.math.BigDecimal;

public class petExchange {
    private int eId;
    private String type;
    private int eType;
    private String consume;
    private String skin;
    private String name;
    private int hp;
    private String five;
    private String skill;
    private int ap;
    private int sp;
    private BigDecimal pid;
    private int mp;
    private double grow;

    public void setMp(int mp) {
        this.mp = mp;
    }

    public int geteType() {
        return this.eType;
    }

    public String getFive() {
        return this.five;
    }

    public int getMp() {
        return this.mp;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public BigDecimal getPid() {
        return this.pid;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getName() {
        return this.name;
    }

    public String getConsume() {
        return this.consume;
    }

    public void setSp(int sp) {
        this.sp = sp;
    }

    public void setConsume(String consume) {
        this.consume = consume;
    }

    public String getSkill() {
        return this.skill;
    }

    public String getType() {
        return this.type;
    }

    public int getSp() {
        return this.sp;
    }

    public String getSkin() {
        return this.skin;
    }

    public double getGrow() {
        return this.grow;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void seteType(int eType) {
        this.eType = eType;
    }

    public void setAp(int ap) {
        this.ap = ap;
    }

    public int getAp() {
        return this.ap;
    }

    public int geteId() {
        return this.eId;
    }

    public void setPid(BigDecimal pid) {
        this.pid = pid;
    }

    public void setGrow(double grow) {
        this.grow = grow;
    }

    public void setFive(String five) {
        this.five = five;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public int getHp() {
        return this.hp;
    }
}
