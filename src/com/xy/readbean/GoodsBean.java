/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.formula.GoodExchange
 *  com.xy.readbean.Goodstable
 *  com.xy.v.IIiiIiiiiIIiI
 */
package com.xy.readbean;

import com.xy.formula.GoodExchange;
import com.xy.readbean.Goodstable;
import com.xy.v.IIiiIiiiiIIiI;
import java.math.BigDecimal;
import java.util.Map;

public class GoodsBean {
    private Map<BigDecimal, Goodstable> allGoodsMap;

    public Map<BigDecimal, Goodstable> getAllGoodsMap() {
        return this.allGoodsMap;
    }

    public void setAllGoodsMap(Map<BigDecimal, Goodstable> allGoodsMap) {
        this.allGoodsMap = allGoodsMap;
    }

    public void ALLATORIxDEMO() {
        for (Goodstable IiiiiiiiIIIII : this.allGoodsMap.values()) {
            if (IiiiiiiiIIIII.getType() != 132L) continue;
            String IiiiiiiiIIIII2 = IiiiiiiiIIIII.getValue();
            GoodExchange[] IiiiiiiiIIIII3 = new GoodExchange[1 + IIiiIiiiiIIiI.ALLATORIxDEMO((char)'|', (String)IiiiiiiiIIIII2)];
            int IiiiiiiiIIIII4 = 0;
            int IiiiiiiiIIIII5 = 0;
            int IiiiiiiiIIIII6 = 0;
            while (IiiiiiiiIIIII6 < IiiiiiiiIIIII2.length()) {
                IiiiiiiiIIIII6 = IiiiiiiiIIIII2.indexOf("|", IiiiiiiiIIIII5 + 1);
                if (IiiiiiiiIIIII6 == -1) {
                    IiiiiiiiIIIII6 = IiiiiiiiIIIII2.length();
                }
                IiiiiiiiIIIII3[IiiiiiiiIIIII4] = new GoodExchange(IiiiiiiiIIIII4, IiiiiiiiIIIII2, IiiiiiiiIIIII5, IiiiiiiiIIIII6);
                ++IiiiiiiiIIIII4;
                IiiiiiiiIIIII5 = IiiiiiiiIIIII6 + 1;
            }
            IiiiiiiiIIIII.setExchanges(IiiiiiiiIIIII3);
            IiiiiiiiIIIII.setValue(null);
        }
    }
}
