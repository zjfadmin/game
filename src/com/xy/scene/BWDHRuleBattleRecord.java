/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.scene.BWDHRuleBattle
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.scene;

import com.xy.scene.BWDHRuleBattle;
import com.xy.v.IIiiIiiiiIIiI;

public class BWDHRuleBattleRecord {
    private int type;
    private int win;
    private int index;
    private BWDHRuleBattle bwdhRuleBattle;
    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return this.type;
    }

    public int getId() {
        return this.id;
    }

    public BWDHRuleBattleRecord(int recordIndex, String data, int index, int indexFlag, BWDHRuleBattle bwdhRuleBattle) {
        this.index = recordIndex;
        this.bwdhRuleBattle = bwdhRuleBattle;
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            IiiiiiiiIIIII2 = data.indexOf(",", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                IiiiiiiiIIIII2 = indexFlag;
            }
            if (IiiiiiiiIIIII == 0) {
                this.id = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 1) {
                this.type = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 2) {
                this.win = IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2);
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public int getIndex() {
        return this.index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getWin() {
        return this.win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public void setBwdhRuleBattle(BWDHRuleBattle bwdhRuleBattle) {
        this.bwdhRuleBattle = bwdhRuleBattle;
    }

    public BWDHRuleBattle getBwdhRuleBattle() {
        return this.bwdhRuleBattle;
    }
}
