/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.GemOld
 *  com.xy.v.IiiiiiiiiIIII
 */
package com.xy.formula;

import com.xy.readbean.GemOld;
import com.xy.v.IiiiiiiiiIIII;

public class BaseGemOld {
    private int id;
    private int lvl;
    private int value;

    public BaseGemOld(String data) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        int IiiiiiiiIIIII3 = 0;
        while (IiiiiiiiIIIII3 != data.length()) {
            IiiiiiiiIIIII3 = data.indexOf("#", IiiiiiiiIIIII2 + 1);
            if (IiiiiiiiIIIII3 == -1) {
                IiiiiiiiIIIII3 = data.length();
            }
            if (IiiiiiiiIIIII == 0) {
                this.lvl = Integer.parseInt(data.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII == 1) {
                this.id = Integer.parseInt(data.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            } else if (IiiiiiiiIIIII == 2) {
                this.value = Integer.parseInt(data.substring(IiiiiiiiIIIII2, IiiiiiiiIIIII3));
            }
            ++IiiiiiiiIIIII;
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 + 1;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId() {
        return this.id;
    }

    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public GemOld getGemOld(IiiiiiiiiIIII objectArea) {
        return objectArea.ALLATORIxDEMO(this.id);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLvl() {
        return this.lvl;
    }
}
