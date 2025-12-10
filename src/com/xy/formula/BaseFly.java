/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Fly
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.formula;

import com.xy.readbean.Fly;
import com.xy.v.IiiiiiiiiIIII;

public class BaseFly {
    private int rl;
    private int lvl;
    private int id;
    private int exp;

    public String getSkinGood(IiiiiiiiiIIII objectArea) {
        return this.getFly(objectArea).getSn1();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRl(int rl) {
        this.rl = rl;
    }

    public String getSkinPart(IiiiiiiiiIIII objectArea) {
        return this.getFly(objectArea).getSn2();
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getLvl() {
        return this.lvl;
    }

    public int getId() {
        return this.id;
    }

    public BaseFly(String value) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 != value.length()) {
            IiiiiiiiIIIII3 = value.indexOf("|", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = value.length();
            }
            if (IiiiiiiiIIIII == 0) {
                this.id = Integer.parseInt(value.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII == 1) {
                this.rl = Integer.parseInt(value.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII == 2) {
                this.lvl = Integer.parseInt(value.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII == 3) {
                this.exp = Integer.parseInt(value.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
    }

    public int getExp() {
        return this.exp;
    }

    public Fly getFly(IiiiiiiiiIIII objectArea) {
        return objectArea.ALLATORIxDEMO(this.id);
    }

    public int getRl() {
        return this.rl;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }
}
