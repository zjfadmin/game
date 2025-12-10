/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.PalData
 */
package com.xy.readbean;

import com.xy.readbean.PalData;
import java.util.concurrent.ConcurrentHashMap;

public class AllPal {
    private ConcurrentHashMap<Integer, PalData> allPalData;

    public void setAllPalData(ConcurrentHashMap<Integer, PalData> allPalData) {
        this.allPalData = allPalData;
    }

    public ConcurrentHashMap<Integer, PalData> getAllPalData() {
        return this.allPalData;
    }
}
