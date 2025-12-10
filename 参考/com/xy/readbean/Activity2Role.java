package com.xy.readbean;

import com.xy.hd;
import java.util.concurrent.ConcurrentHashMap;

public class Activity2Role implements ActivityRole {
   private ConcurrentHashMap<Integer, Long> dataMap;

   public void setValueByKey(String var1, int var2, int var3) {
      int var4;
      if ((var4 = var1.indexOf(",", var2 + (3 >> 1))) != -4 >> 2 && var4 <= var3) {
         String var10000 = var1;
         int var7 = hd.b(var1, var2, var4);
         long var5;
         if ((var5 = hd.q(var10000, var4 + (2 ^ 3), var3)) != 0L) {
            this.dataMap.put(var7, var5);
         } else {
            this.dataMap.remove(var7);
         }
      }
   }

   public void f(String var1, int var2, int var3) {
      if (var2 < var3) {
         byte var4 = 0;
         int var5 = 2 & 5;

         int var9;
         for(int var10000 = var4; var10000 < var3; var10000 = var9) {
            if ((var9 = var1.indexOf("#", var2 + --1)) == -4 >> 2 || var9 > var3) {
               var9 = var3;
            }

            if ((var5 = var1.indexOf(",", var5 + (3 & 5))) == -4 >> 2 || var5 > var9) {
               var5 = var9;
            }

            int var6 = hd.b(var1, var2, var5);
            long var7 = var5 < var9 ? hd.q(var1, var5 + (5 >> 2), var9) : 0L;
            if (var7 != 0L) {
               this.dataMap.put(var6, var7);
               var10000 = var9;
            } else {
               this.dataMap.remove(var6);
               var10000 = var9;
            }

            var2 = var10000 + 1;
         }

      }
   }

   public void e(String var1, int var2, int var3) {
      this.dataMap = new ConcurrentHashMap();
      if (!hd.o(var1) && var2 < var3) {
         byte var4 = 0;
         int var5 = 3 >> 2;

         int var6;
         for(int var10000 = var4; var10000 < var3; var10000 = var6) {
            if ((var6 = var1.indexOf("#", var2 + --1)) == -4 >> 2 || var6 > var3) {
               var6 = var3;
            }

            var5 = var1.indexOf(",", var2 + --1);
            this.dataMap.put(hd.b(var1, var2, var5), hd.q(var1, var5 + --1, var6));
            var2 = var6 + (4 ^ 5);
         }

      }
   }

   public Activity2Role(String var1, int var2, int var3) {
      this.e(var1, var2, var3);
   }

   public ConcurrentHashMap<Integer, Long> getDataMap() {
      return this.dataMap;
   }

   public long getValueByKey(int var1) {
      Long var2;
      return (var2 = (Long)this.dataMap.get(var1)) != null ? var2 : 0L;
   }
}
