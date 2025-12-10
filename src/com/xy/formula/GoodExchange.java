/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.formula;

import com.xy.v.IIiiIiiiiIIiI;
import java.math.BigDecimal;

public class GoodExchange {
    private int index;
    private BigDecimal[] goods;
    private String key;

    public void setIndex(int index) {
        this.index = index;
    }

    public int getIndex() {
        return this.index;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setGoods(BigDecimal[] goods) {
        this.goods = goods;
    }

    public GoodExchange(int flag, String data, int index, int indexFlag) {
        this.index = flag;
        this.goods = new BigDecimal[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'#', (String)data, (int)index, (int)indexFlag)];
        int IiiiiiiiIIIII = 0;
        int IiiiiiiiIIIII2 = 0;
        while (IiiiiiiiIIIII2 < indexFlag) {
            if (IiiiiiiiIIIII == 0) {
                IiiiiiiiIIIII2 = data.indexOf("=", index + 1);
                if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                    IiiiiiiiIIIII2 = indexFlag;
                }
                this.key = data.substring(index, IiiiiiiiIIIII2);
            } else {
                IiiiiiiiIIIII2 = data.indexOf("#", index + 1);
                if (IiiiiiiiIIIII2 == -1 || IiiiiiiiIIIII2 > indexFlag) {
                    IiiiiiiiIIIII2 = indexFlag;
                }
                this.goods[IiiiiiiiIIIII - 1] = new BigDecimal(IIiiIiiiiIIiI.ALLATORIxDEMO((String)data, (int)index, (int)IiiiiiiiIIIII2));
            }
            ++IiiiiiiiIIIII;
            index = IiiiiiiiIIIII2 + 1;
        }
    }

    public BigDecimal[] getGoods() {
        return this.goods;
    }

    public String getKey() {
        return this.key;
    }
}
