package com.xy.readbean;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class AllStallBuy {
   private List<StallBuyMenu> buyMenuList;
   private ConcurrentHashMap<Integer, StallBuyData> buyDataMap;

   public ConcurrentHashMap<Integer, StallBuyData> getBuyDataMap() {
      return this.buyDataMap;
   }

   public List<StallBuyMenu> getBuyMenuList() {
      return this.buyMenuList;
   }

   public void a() {
      Iterator var1;
      for(Iterator var10000 = var1 = this.buyDataMap.values().iterator(); var10000.hasNext(); var10000 = var1) {
         ((StallBuyData)var1.next()).b();
      }

   }

   public void setBuyDataMap(ConcurrentHashMap<Integer, StallBuyData> var1) {
      this.buyDataMap = var1;
   }

   public void setBuyMenuList(List<StallBuyMenu> var1) {
      this.buyMenuList = var1;
   }
}
