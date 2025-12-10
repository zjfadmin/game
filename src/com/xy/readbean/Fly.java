/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class Fly {
    private int ExpGrow;
    private int id;
    private int lvlMax;
    private String sn2;
    private int rlUse;
    private double sp;
    private int lvl;
    private String name;
    private int rlMax;
    private String sn1;
    private int next;

    public int getNext() {
        return this.next;
    }

    public int getRlMax() {
        return this.rlMax;
    }

    public void setNext(int next) {
        this.next = next;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRlUse() {
        return this.rlUse;
    }

    public void setSn2(String sn2) {
        this.sn2 = sn2;
    }

    public int getLvl() {
        return this.lvl;
    }

    public int getExpGrow() {
        return this.ExpGrow;
    }

    public String getSn2() {
        return this.sn2;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public int getTotalExp(int lvl) {
        return lvl * lvl * this.ExpGrow;
    }

    public void setRlMax(int rlMax) {
        this.rlMax = rlMax;
    }

    public void setSp(double sp) {
        this.sp = sp;
    }

    public double getSp() {
        return this.sp;
    }

    public String getSn1() {
        return this.sn1;
    }

    public void setLvlMax(int lvlMax) {
        this.lvlMax = lvlMax;
    }

    public void setSn1(String sn1) {
        this.sn1 = sn1;
    }

    public int getLvlMax() {
        return this.lvlMax;
    }

    public void setExpGrow(int expGrow) {
        this.ExpGrow = expGrow;
    }

    public void setRlUse(int rlUse) {
        this.rlUse = rlUse;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
}
