/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class Talent {
    private String demand;
    private double fail;
    private String value;
    private int camp;
    private int id;
    private double touch;
    private String TalentName;
    private String text;

    public String getValue() {
        return this.value;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDemand() {
        return this.demand;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getText() {
        return this.text;
    }

    public int getCamp() {
        return this.camp;
    }

    public double getTouch() {
        return this.touch;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setTouch(double touch) {
        this.touch = touch;
    }

    public String getTalentName() {
        return this.TalentName;
    }

    public void setTalentName(String talentName) {
        this.TalentName = talentName;
    }

    public void setCamp(int camp) {
        this.camp = camp;
    }

    public void setFail(double fail) {
        this.fail = fail;
    }

    public void setDemand(String demand) {
        this.demand = demand;
    }

    public double getFail() {
        return this.fail;
    }
}
