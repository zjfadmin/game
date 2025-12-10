package com.xy.readbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class AllLabor {
   private Map<Integer, LaborShop> shops;
   private LaborVip[] vips;
   private long timeOpen;
   private long timeStop;
   private long timeEnd;
   private Map<Integer, List<LaborShop>> shopTypes;

   public void setTimeStop(long var1) {
      this.timeStop = var1;
   }

   public long getTimeEnd() {
      return this.timeEnd;
   }

   public List<LaborShop> getShopList(int var1) {
      if (this.shopTypes == null) {
         this.a();
      }

      return (List)this.shopTypes.get(var1);
   }

   public synchronized void a() {
      if (this.shopTypes == null) {
         this.shopTypes = new HashMap();
         Iterator var5;
         Iterator var10000 = var5 = this.shops.values().iterator();

         while(true) {
            label30:
            while(var10000.hasNext()) {
               LaborShop var1 = (LaborShop)var5.next();
               Object var3;
               if ((var3 = (List)this.shopTypes.get(var1.getType())) == null) {
                  var3 = new ArrayList();
                  this.shopTypes.put(var1.getType(), var3);
               }

               int var4 = var1.getId();
               int var2 = 3 ^ 3;
               int var6 = ((List)var3).size();

               for(int var8 = var2; var8 < var6; var8 = var2) {
                  LaborShop var7 = (LaborShop)((List)var3).get(var2);
                  if (var4 < var7.getId()) {
                     var10000 = var5;
                     ((List)var3).add(var2, var1);
                     continue label30;
                  }

                  ++var2;
               }

               var10000 = var5;
               ((List)var3).add(var1);
            }

            return;
         }
      }
   }

   public Map<Integer, LaborShop> getShops() {
      return this.shops;
   }

   public void setShops(Map<Integer, LaborShop> var1) {
      this.shops = var1;
   }

   public long getTimeOpen() {
      return this.timeOpen;
   }

   public void setTimeOpen(long var1) {
      this.timeOpen = var1;
   }

   public void setVips(LaborVip[] var1) {
      this.vips = var1;
   }

   public LaborVip[] getVips() {
      return this.vips;
   }

   public long getTimeStop() {
      return this.timeStop;
   }

   public void setTimeEnd(long var1) {
      this.timeEnd = var1;
   }
}
