/*
 * Decompiled with CFR 0.152.
 */
package com.xy.formula;

public class BaseStar {
    private int man;
    private String[] vs;
    private double xs;

    public static double ALLATORIxDEMO(String attr, String value, String num) {
        Integer IiiiiiiiIIIII = BaseStar.iIiIiiiiIIiii(attr);
        Integer IiiiiiiiIIIII2 = BaseStar.iIiIiiiiIIiii(value);
        int IiiiiiiiIIIII3 = Math.abs(IiiiiiiiIIIII - IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 == 1 || IiiiiiiiIIIII3 == 4) {
            if (IiiiiiiiIIIII == 1) {
                if (IiiiiiiiIIIII2 == 5) return (double)Integer.parseInt(num) * 0.1;
            }
            if (IiiiiiiiIIIII > IiiiiiiiIIIII2) {
                return (double)Integer.parseInt(num) * 0.1;
            }
        }
        IiiiiiiiIIIII = BaseStar.ALLATORIxDEMO(attr);
        IiiiiiiiIIIII2 = BaseStar.ALLATORIxDEMO(value);
        IiiiiiiiIIIII3 = Math.abs(IiiiiiiiIIIII - IiiiiiiiIIIII2);
        if (IiiiiiiiIIIII3 != 1) {
            if (IiiiiiiiIIIII3 != 4) return (double)Integer.parseInt(num) * 0.2;
        }
        if (IiiiiiiiIIIII == 1) {
            if (IiiiiiiiIIIII2 == 5) return (double)Integer.parseInt(num) * 0.3;
        }
        if (IiiiiiiiIIIII <= IiiiiiiiIIIII2) return (double)Integer.parseInt(num) * 0.2;
        return (double)Integer.parseInt(num) * 0.3;
    }

    public static Integer iIiIiiiiIIiii(String attr) {
        if (attr.equals("\u91d1")) {
            return 1;
        }
        if (attr.equals("\u6728")) {
            return 2;
        }
        if (attr.equals("\u571f")) {
            return 3;
        }
        if (attr.equals("\u6c34")) {
            return 4;
        }
        if (!attr.equals("\u706b")) return null;
        return 5;
    }

    public void setXs(double xs) {
        this.xs = xs;
    }

    public String[] getVs() {
        return this.vs;
    }

    public void setVs(String[] vs) {
        this.vs = vs;
    }

    public int getMan() {
        return this.man;
    }

    public BaseStar(String xz, String wx) {
        this.vs = xz.split("=");
        String[] IiiiiiiiIIIII = wx.split("&");
        this.xs = 0.0;
        int IiiiiiiiIIIII2 = 1;
        while (IiiiiiiiIIIII2 < IiiiiiiiIIIII.length) {
            String[] IiiiiiiiIIIII3 = IiiiiiiiIIIII[IiiiiiiiIIIII2].split("=");
            ++IiiiiiiiIIIII2;
            this.xs += BaseStar.ALLATORIxDEMO(this.vs[2], IiiiiiiiIIIII3[0], IiiiiiiiIIIII3[1]);
        }
        this.xs /= 100.0;
    }

    public static Integer ALLATORIxDEMO(String attr) {
        if (attr.equals("\u91d1")) {
            return 1;
        }
        if (attr.equals("\u6c34")) {
            return 2;
        }
        if (attr.equals("\u6728")) {
            return 3;
        }
        if (attr.equals("\u706b")) {
            return 4;
        }
        if (!attr.equals("\u571f")) return null;
        return 5;
    }

    public void setMan(int man) {
        this.man = man;
    }

    public double getXs() {
        return this.xs;
    }
}
