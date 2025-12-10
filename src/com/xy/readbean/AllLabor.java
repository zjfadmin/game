/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.LaborShop
 *  com.xy.readbean.LaborVip
 */
package com.xy.readbean;

import com.xy.readbean.LaborShop;
import com.xy.readbean.LaborVip;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllLabor {
    private long timeStop;
    private Map<Integer, LaborShop> shops;
    private LaborVip[] vips;
    private long timeOpen;
    private long timeEnd;
    private Map<Integer, List<LaborShop>> shopTypes;

    public List<LaborShop> getShopList(int type) {
        if (this.shopTypes != null) return this.shopTypes.get(type);
        this.ALLATORIxDEMO();
        return this.shopTypes.get(type);
    }

    public void setShops(Map<Integer, LaborShop> shops) {
        this.shops = shops;
    }

    public Map<Integer, LaborShop> getShops() {
        return this.shops;
    }

    public long getTimeStop() {
        return this.timeStop;
    }

    public void setTimeOpen(long timeOpen) {
        this.timeOpen = timeOpen;
    }

    public synchronized void ALLATORIxDEMO() {
        if (this.shopTypes != null) {
            return;
        }
        this.shopTypes = new HashMap<Integer, List<LaborShop>>();
        block0: for (LaborShop IiiiiiiiIIIII : this.shops.values()) {
            List<LaborShop> IiiiiiiiIIIII2 = this.shopTypes.get(IiiiiiiiIIIII.getType());
            if (IiiiiiiiIIIII2 == null) {
                IiiiiiiiIIIII2 = new ArrayList<LaborShop>();
                this.shopTypes.put(IiiiiiiiIIIII.getType(), IiiiiiiiIIIII2);
            }
            int IiiiiiiiIIIII3 = IiiiiiiiIIIII.getId();
            int IiiiiiiiIIIII4 = 0;
            int IiiiiiiiIIIII5 = IiiiiiiiIIIII2.size();
            while (IiiiiiiiIIIII4 < IiiiiiiiIIIII5) {
                LaborShop IiiiiiiiIIIII6 = IiiiiiiiIIIII2.get(IiiiiiiiIIIII4);
                if (IiiiiiiiIIIII3 < IiiiiiiiIIIII6.getId()) {
                    IiiiiiiiIIIII2.add(IiiiiiiiIIIII4, IiiiiiiiIIIII);
                    continue block0;
                }
                ++IiiiiiiiIIIII4;
            }
            IiiiiiiiIIIII2.add(IiiiiiiiIIIII);
        }
    }

    public void setTimeStop(long timeStop) {
        this.timeStop = timeStop;
    }

    public long getTimeEnd() {
        return this.timeEnd;
    }

    public void setTimeEnd(long timeEnd) {
        this.timeEnd = timeEnd;
    }

    public void setVips(LaborVip[] vips) {
        this.vips = vips;
    }

    public long getTimeOpen() {
        return this.timeOpen;
    }

    public LaborVip[] getVips() {
        return this.vips;
    }
}
