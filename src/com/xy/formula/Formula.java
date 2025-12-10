/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.CustomFunction
 */
package com.xy.formula;

import com.xy.formula.CustomFunction;

public class Formula {
    private double sv;
    private double base;
    private double value;
    private boolean lvl;

    public double ALLATORIxDEMO(double sld, int lvl, int zs) {
        double IiiiiiiiIIIII = this.value + CustomFunction.getLogAndPow((double)sld) * this.sv;
        if (!this.lvl) return IiiiiiiiIIIII + this.base;
        IiiiiiiiIIIII *= (double)(zs >= 4 ? 180 : lvl);
        return IiiiiiiiIIIII + this.base;
    }

    public Formula(String data, int index, int indexFlag) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            IiiiiiiiIIIII2 = data.indexOf(",", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                IiiiiiiiIIIII2 = indexFlag;
            }
            if (IiiiiiiiIIIII == 0) {
                this.value = Double.parseDouble(data.substring(index, IiiiiiiiIIIII2));
            } else if (IiiiiiiiIIIII == 1) {
                this.sv = Double.parseDouble(data.substring(index, IiiiiiiiIIIII2));
            } else {
                char IiiiiiiiIIIII3 = data.charAt(index);
                if (IiiiiiiiIIIII3 == 'B') {
                    this.base = Double.parseDouble(data.substring(index + 1, IiiiiiiiIIIII2));
                } else if (IiiiiiiiIIIII3 == 'L') {
                    this.lvl = true;
                }
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }
}
