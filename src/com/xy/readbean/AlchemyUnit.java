/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IiiiIiiiiIiIi
 */
package com.xy.readbean;

import com.xy.v.IiiiIiiiiIiIi;

public class AlchemyUnit {
    private int size;
    private double min;
    private double max;
    private String key;

    public void setKey(String key) {
        this.key = key;
    }

    public AlchemyUnit(String data, int index, int indexFlag) {
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            IiiiiiiiIIIII2 = data.indexOf("#", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                IiiiiiiiIIIII2 = indexFlag;
            }
            if (IiiiiiiiIIIII == 0) {
                this.key = data.substring(index, IiiiiiiiIIIII2);
            } else if (IiiiiiiiIIIII == 1) {
                this.min = Double.parseDouble(data.substring(index, IiiiiiiiIIIII2));
            } else if (IiiiiiiiIIIII == 2) {
                this.max = Double.parseDouble(data.substring(index, IiiiiiiiIIIII2));
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
        this.size = this.key.equals("\u9644\u52a0\u6c14\u8840") || this.key.equals("\u9644\u52a0\u9b54\u6cd5") || this.key.equals("\u9644\u52a0\u653b\u51fb") || this.key.equals("\u9644\u52a0\u901f\u5ea6") || this.key.equals("\u6839\u9aa8") || this.key.equals("\u7075\u6027") || this.key.equals("\u529b\u91cf") || this.key.equals("\u654f\u6377") || this.key.equals("\u9632\u5fa1") || this.key.equals("\u6297\u4e09\u5c38\u866b") || this.key.equals("\u6297\u6bd2\u4f24\u5bb3") || this.key.equals("\u6297\u53cd\u9707") || this.key.equals("\u6bcf\u56de\u5408HP") || this.key.equals("\u6bcf\u56de\u5408MP") ? 0 : 1;
    }

    public double getMax() {
        return this.max;
    }

    public String getKey() {
        return this.key;
    }

    public double getDoubleByMax(int min, int max) {
        double IiiiiiiiIIIII = this.max;
        double IiiiiiiiIIIII2 = this.min;
        if (IiiiiiiiIIIII <= IiiiiiiiIIIII2) {
            return IiiiiiiiIIIII;
        }
        int IiiiiiiiIIIII3 = min + (min < max ? IiiiIiiiiIiIi.iIiIiiiiIiIii.nextInt(max - min + 1) : 0);
        return Math.max(IiiiiiiiIIIII2, IiiiiiiiIIIII * (double)IiiiiiiiIIIII3 / 100.0);
    }

    public void setMax(double max) {
        this.max = max;
    }

    public double getMin() {
        return this.min;
    }

    public AlchemyUnit() {
    }

    public void setMin(double min) {
        this.min = min;
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
