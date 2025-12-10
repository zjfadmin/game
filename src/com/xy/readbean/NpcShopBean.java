/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.Shop
 */
package com.xy.readbean;

import com.xy.readbean.Shop;
import java.util.List;
import java.util.Map;

public class NpcShopBean {
    private Map<String, List<Shop>> npcShopMap;

    public void setNpcShopMap(Map<String, List<Shop>> npcShopMap) {
        this.npcShopMap = npcShopMap;
    }

    public Map<String, List<Shop>> getNpcShopMap() {
        return this.npcShopMap;
    }
}
