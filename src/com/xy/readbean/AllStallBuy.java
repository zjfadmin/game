/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.StallBuyData
 *  com.xy.readbean.StallBuyMenu
 */
package com.xy.readbean;

import com.xy.readbean.StallBuyData;
import com.xy.readbean.StallBuyMenu;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class AllStallBuy {
    private List<StallBuyMenu> buyMenuList;
    private ConcurrentHashMap<Integer, StallBuyData> buyDataMap;

    public void setBuyDataMap(ConcurrentHashMap<Integer, StallBuyData> buyDataMap) {
        this.buyDataMap = buyDataMap;
    }

    public void setBuyMenuList(List<StallBuyMenu> buyMenuList) {
        this.buyMenuList = buyMenuList;
    }

    public ConcurrentHashMap<Integer, StallBuyData> getBuyDataMap() {
        return this.buyDataMap;
    }

    public List<StallBuyMenu> getBuyMenuList() {
        return this.buyMenuList;
    }

    public void ALLATORIxDEMO() {
        Iterator<StallBuyData> iterator = this.buyDataMap.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().ALLATORIxDEMO();
        }
    }
}
