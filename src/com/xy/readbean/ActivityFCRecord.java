/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.FormulaNum
 */
package com.xy.readbean;

import com.xy.formula.FormulaNum;

public class ActivityFCRecord {
    private int reset;
    private String key2;
    private FormulaNum[] key3;
    private int key1;
    private int id;
    private int type;

    public FormulaNum[] getKey3() {
        return this.key3;
    }

    public int getKey1() {
        return this.key1;
    }

    public int getReset() {
        return this.reset;
    }

    public int getId() {
        return this.id;
    }

    public String getKey2() {
        return this.key2;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setReset(int reset) {
        this.reset = reset;
    }

    public int getType() {
        return this.type;
    }

    public void setKey1(int key1) {
        this.key1 = key1;
    }

    public void setKey2(String key2) {
        this.key2 = key2;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void ALLATORIxDEMO(int count, String value, int index, int valueEnd) {
        this.key3 = new FormulaNum[count];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < valueEnd) {
            IiiiiiiiIIIII2 = value.indexOf("#", index + 1);
            if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > valueEnd) {
                IiiiiiiiIIIII2 = valueEnd;
            }
            this.key3[IiiiiiiiIIIII] = new FormulaNum(value.substring(index, IiiiiiiiIIIII2));
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public void setKey3(FormulaNum[] key3) {
        this.key3 = key3;
    }
}
