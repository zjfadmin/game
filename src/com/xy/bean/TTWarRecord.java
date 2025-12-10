/*
 * Decompiled with CFR 0.152.
 */
package com.xy.bean;

public class TTWarRecord {
    private int TTJF;
    private int TTSL;
    private int TTSJ;
    private int TTRank;
    private boolean TTDraw;
    private int TTCZ;

    public TTWarRecord(String value) {
        int IiiiiiiiIIIII = value.indexOf("=");
        this.TTSJ = Integer.parseInt(value.substring(0, IiiiiiiiIIIII));
        String[] IiiiiiiiIIIII2 = value.substring(IiiiiiiiIIIII + 1).split("&");
        this.TTCZ = Integer.parseInt(IiiiiiiiIIIII2[0]);
        this.TTSL = Integer.parseInt(IiiiiiiiIIIII2[1]);
        this.TTJF = Integer.parseInt(IiiiiiiiIIIII2[2]);
        this.TTRank = Integer.parseInt(IiiiiiiiIIIII2[3]);
        this.TTDraw = !IiiiiiiiIIIII2[4].equals("0");
    }

    public int getTTCZ() {
        return this.TTCZ;
    }

    public String toString() {
        return String.valueOf(this.TTCZ) + "&" + this.TTSL + "&" + this.TTJF + "&" + this.TTRank + "&" + (this.TTDraw ? 1 : 0);
    }

    public void setTTDraw(boolean tTDraw) {
        this.TTDraw = tTDraw;
    }

    public int getTTSJ() {
        return this.TTSJ;
    }

    public boolean ALLATORIxDEMO() {
        return this.TTDraw;
    }

    public int getTTJF() {
        return this.TTJF;
    }

    public int getTTRank() {
        return this.TTRank;
    }

    public int getTTSL() {
        return this.TTSL;
    }
}
