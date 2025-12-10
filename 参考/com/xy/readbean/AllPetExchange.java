package com.xy.readbean;

import java.util.concurrent.ConcurrentHashMap;

public class AllPetExchange {
   private ConcurrentHashMap<Integer, petExchange> allPetExchange;

   public void setAllPetExchange(ConcurrentHashMap<Integer, petExchange> var1) {
      this.allPetExchange = var1;
   }

   public ConcurrentHashMap<Integer, petExchange> getAllPetExchange() {
      return this.allPetExchange;
   }
}
