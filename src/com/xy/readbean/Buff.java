/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class Buff {
    private String bName;
    private int bLvl;
    private String bText;
    private int bId;
    private int bType;
    private String bValue;

    public void setbText(String bText) {
        this.bText = bText;
    }

    public int getbLvl() {
        return this.bLvl;
    }

    public void setbValue(String bValue) {
        this.bValue = bValue;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public String getbName() {
        return this.bName;
    }

    public String getColor() {
        if (this.bLvl == 0) {
            return "#G";
        }
        if (this.bLvl == 1) {
            return "#B";
        }
        if (this.bLvl == 2) {
            return "#c800080";
        }
        if (this.bLvl != 3) return "#R";
        return "#cFF7F00";
    }

    public String getbText() {
        return this.bText;
    }

    public String getbValue() {
        return this.bValue;
    }

    public int getbId() {
        return this.bId;
    }

    public void setbLvl(int bLvl) {
        this.bLvl = bLvl;
    }

    public int getbType() {
        return this.bType;
    }

    public String getColorName() {
        return String.valueOf(this.getColor()) + this.bName + "#Y";
    }

    public void setbType(int bType) {
        this.bType = bType;
    }

    public void setbId(int bId) {
        this.bId = bId;
    }
}
