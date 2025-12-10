/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.formula;

import com.xy.v.IIiiIiiiiIIiI;
import com.xy.v.IiiiIiiiiIiIi;

public class FormulaNum {
    private long base;
    private int range;

    public int getSize() {
        return this.range;
    }

    public long getZhiCount(int count) {
        if (this.range == 1) {
            return this.base * (long)count;
        }
        long IiiiiiiiIIIII = 0L;
        while (count > 0) {
            int IiiiiiiiIIIII2 = Math.min(5, count);
            long IiiiiiiiIIIII3 = this.getZhi();
            IiiiiiiiIIIII += IiiiiiiiIIIII3 * (long)IiiiiiiiIIIII2;
            count -= IiiiiiiiIIIII2;
        }
        return IiiiiiiiIIIII;
    }

    /*
     * WARNING - void declaration
     */
    public FormulaNum(String string) {
        void text;
        int IiiiiiiiIIIII = string.indexOf("-", 1);
        long IiiiiiiiIIIII2 = 0L;
        long IiiiiiiiIIIII3 = 0L;
        if (IiiiiiiiIIIII == -1) {
            IiiiiiiiIIIII2 = IiiiiiiiIIIII3 = Long.parseLong((String)text);
        } else {
            IiiiiiiiIIIII2 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)text, (int)0, (int)IiiiiiiiIIIII);
            IiiiiiiiIIIII3 = IIiiIiiiiIIiI.ALLATORIxDEMO((String)text, (int)(IiiiiiiiIIIII + 1), (int)text.length());
        }
        if (IiiiiiiiIIIII2 > IiiiiiiiIIIII3) {
            this.base = IiiiiiiiIIIII3;
            IiiiiiiiIIIII3 = IiiiiiiiIIIII2;
            IiiiiiiiIIIII2 = this.base;
        }
        this.base = IiiiiiiiIIIII2;
        this.range = (IiiiiiiiIIIII3 = IiiiiiiiIIIII3 - IiiiiiiiIIIII2 + 1L) > Integer.MAX_VALUE ? Integer.MAX_VALUE : (int)IiiiiiiiIIIII3;
    }

    public boolean ALLATORIxDEMO() {
        if (this.range != 1) return false;
        return true;
    }

    public long getZhi() {
        if (this.range != 1) return this.base + (long)IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(this.range);
        return this.base;
    }

    public long getZhi(int index) {
        if (this.range == 1) {
            return this.base;
        }
        if (index >= this.getSize()) return this.base;
        return this.base + (long)index;
    }
}
