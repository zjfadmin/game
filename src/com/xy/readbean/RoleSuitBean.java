/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.BaseSkill
 */
package com.xy.readbean;

import com.xy.formula.BaseSkill;

public class RoleSuitBean {
    private String Introduce;
    private String HaveParts;
    private int Sysex;
    private String Sname;
    private String HaveSkill;
    private transient BaseSkill[] Suits;
    private transient int[] parts;
    private int SuitID;

    public String getSname() {
        return this.Sname;
    }

    public int getSysex() {
        return this.Sysex;
    }

    public String getHaveSkill() {
        return this.HaveSkill;
    }

    public void setSysex(int sysex) {
        this.Sysex = sysex;
    }

    public int getSuitID() {
        return this.SuitID;
    }

    public String getHaveParts() {
        return this.HaveParts;
    }

    public String getIntroduce() {
        return this.Introduce;
    }

    public BaseSkill[] getSuits() {
        if (this.HaveSkill == null) return this.Suits;
        if (this.HaveSkill.equals("")) return this.Suits;
        String[] IiiiiiiiIIIII = this.HaveSkill.split("\\|");
        this.Suits = new BaseSkill[IiiiiiiiIIIII.length];
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("-");
            this.Suits[IiiiiiiiIIIII2++] = new BaseSkill(Integer.parseInt(IiiiiiiiIIIII3[1]), Integer.parseInt(IiiiiiiiIIIII3[0]));
        }
        return this.Suits;
    }

    public void setHaveSkill(String haveSkill) {
        this.HaveSkill = haveSkill;
    }

    public void setHaveParts(String haveParts) {
        this.HaveParts = haveParts;
    }

    public void setIntroduce(String introduce) {
        this.Introduce = introduce;
    }

    public void setSname(String sname) {
        this.Sname = sname;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     */
    public int[] getParts() {
        var1_1 = this;
        synchronized (var1_1) {
            if (this.parts != null) return this.parts;
            if (this.HaveParts == null || this.HaveParts.equals("")) ** GOTO lbl-1000
            IiiiiiiiIIIII = this.HaveParts.split("\\|");
            this.parts = new int[IiiiiiiiIIIII.length];
            IiiiiiiiIIIII = 0;
            if (true) ** GOTO lbl17
            do {
                v1 = IiiiiiiiIIIII;
                v2 = Integer.parseInt(IiiiiiiiIIIII[IiiiiiiiIIIII]);
                ++IiiiiiiiIIIII;
                this.parts[v1] = v2;
lbl17:
                // 2 sources

            } while (IiiiiiiiIIIII < IiiiiiiiIIIII.length);
            ** GOTO lbl20
lbl-1000:
            // 1 sources

            {
                this.parts = new int[0];
lbl20:
                // 2 sources

                return this.parts;
            }
        }
    }

    public void setSuitID(int suitID) {
        this.SuitID = suitID;
    }
}
