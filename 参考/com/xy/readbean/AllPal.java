package com.xy.readbean;

import java.util.concurrent.ConcurrentHashMap;

public class AllPal {
   private ConcurrentHashMap<Integer, PalData> allPalData;

   public void setAllPalData(ConcurrentHashMap<Integer, PalData> var1) {
      this.allPalData = var1;
   }

   public ConcurrentHashMap<Integer, PalData> getAllPalData() {
      return this.allPalData;
   }
}
