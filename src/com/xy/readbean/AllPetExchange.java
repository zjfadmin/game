/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.xy.readbean.petExchange
 */
package com.xy.readbean;

import com.xy.readbean.petExchange;
import java.util.concurrent.ConcurrentHashMap;

public class AllPetExchange {
    private ConcurrentHashMap<Integer, petExchange> allPetExchange;

    public void setAllPetExchange(ConcurrentHashMap<Integer, petExchange> allPetExchange) {
        this.allPetExchange = allPetExchange;
    }

    public ConcurrentHashMap<Integer, petExchange> getAllPetExchange() {
        return this.allPetExchange;
    }
}
