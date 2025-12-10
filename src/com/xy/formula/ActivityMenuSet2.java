/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.FormulaNum
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.formula;

import com.xy.formula.FormulaNum;
import com.xy.v.IIiiIiiiiIIiI;

public class ActivityMenuSet2 {
    private int id;
    private int t2;
    private static String[] KEYS = new String[]{"\u8bf4\u660e", "\u5956\u52b1\u5c55\u793a"};
    private String key;
    private int t1;
    private FormulaNum[] bases;

    public int getT1() {
        return this.t1;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ActivityMenuSet2(String value, int index, int valueEnd) {
        int IiiiiiiiIIIII = value.indexOf("#", index + 1);
        this.id = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)index, (int)IiiiiiiiIIIII);
        index = IiiiiiiiIIIII + 1;
        IiiiiiiiIIIII = value.indexOf(",", index + 1);
        this.key = value.substring(index, IiiiiiiiIIIII);
        index = IiiiiiiiIIIII + 1;
        IiiiiiiiIIIII = value.indexOf(",", index + 1);
        if (IiiiiiiiIIIII == -1 || IiiiiiiiIIIII > valueEnd) {
            IiiiiiiiIIIII = valueEnd;
        }
        this.ALLATORIxDEMO(value, index, IiiiiiiiIIIII);
        int IiiiiiiiIIIII2 = index = IiiiiiiiIIIII + 1;
        while (IiiiiiiiIIIII2 < valueEnd) {
            String IiiiiiiiIIIII3;
            IiiiiiiiIIIII2 = value.indexOf(",", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
                IiiiiiiiIIIII2 = valueEnd;
            }
            if ((IiiiiiiiIIIII = value.indexOf("#", index + 1)) == -1 || IiiiiiiiIIIII > IiiiiiiiIIIII2) {
                IiiiiiiiIIIII = IiiiiiiiIIIII2;
            }
            if ((IiiiiiiiIIIII3 = value.substring(index, IiiiiiiiIIIII)).equals(KEYS[0])) {
                this.t1 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII + 1), (int)IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII3.equals(KEYS[1])) {
                this.t2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)value, (int)(IiiiiiiiIIIII + 1), (int)IiiiiiiiIIIII2);
            }
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public void setT1(int t1) {
        this.t1 = t1;
    }

    public FormulaNum[] getBases() {
        return this.bases;
    }

    public void setT2(int t2) {
        this.t2 = t2;
    }

    public int getId() {
        return this.id;
    }

    public String getKey() {
        return this.key;
    }

    public void ALLATORIxDEMO(String value, int index, int valueEnd) {
        this.bases = new FormulaNum[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'#', (String)value, (int)index, (int)valueEnd)];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < valueEnd) {
            IiiiiiiiIIIII2 = value.indexOf("#", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
                IiiiiiiiIIIII2 = valueEnd;
            }
            this.bases[IiiiiiiiIIIII] = new FormulaNum(value.substring(index, IiiiiiiiIIIII2));
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBases(FormulaNum[] bases) {
        this.bases = bases;
    }

    public int getT2() {
        return this.t2;
    }
}
