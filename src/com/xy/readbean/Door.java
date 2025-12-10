/*
 * Decompiled with CFR 0.152.
 */
package com.xy.readbean;

public class Door {
    private String doorkey;
    private String doorpoint;
    private String doormap;
    private String doorrect;
    private int[] rects;
    private String doorid;

    public void setRects(int[] rects) {
        this.rects = rects;
    }

    public String getDoorkey() {
        return this.doorkey;
    }

    public int[] getRects() {
        if (this.rects != null) return this.rects;
        if (this.doorrect == null) return this.rects;
        if (!this.doorrect.equals("") && !this.doorrect.equals("0|0|0|0")) {
            String[] IiiiiiiiIIIII = this.doorrect.split("\\|");
            this.rects = new int[4];
            int IiiiiiiiIIIII2 = 0;
            while (IiiiiiiiIIIII2 < this.rects.length) {
                int n = IiiiiiiiIIIII2;
                int n2 = Math.abs(Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII2]));
                ++IiiiiiiiIIIII2;
                this.rects[n] = n2;
            }
        }
        this.doorrect = null;
        return this.rects;
    }

    public void setDoormap(String doormap) {
        this.doormap = doormap;
    }

    public String getDoorrect() {
        return this.doorrect;
    }

    public String getDoormap() {
        return this.doormap;
    }

    public void setDoorid(String doorid) {
        this.doorid = doorid;
    }

    public String getDoorid() {
        return this.doorid;
    }

    public void setDoorkey(String doorkey) {
        this.doorkey = doorkey;
    }

    public void setDoorrect(String doorrect) {
        this.doorrect = doorrect;
    }

    public String getDoorpoint() {
        return this.doorpoint;
    }

    public void setDoorpoint(String doorpoint) {
        this.doorpoint = doorpoint;
    }
}
