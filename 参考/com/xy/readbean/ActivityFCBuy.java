package com.xy.readbean;

import com.xy.hd;

public class ActivityFCBuy {
   private int reset;
   private ActivityFCBase[] uses;
   private ActivityFCBase[] gains;
   private int buyMax;
   private static String[] KEYS;

   static {
      String[] var10000 = new String[--4];
      boolean var10002 = true;
      var10000[5 >> 3] = "消耗";
      var10000[4 ^ 5] = "获得";
      var10000[--2] = "限购";
      var10000[--3] = "重置";
      KEYS = var10000;
   }

   public ActivityFCBase[] getUses() {
      return this.uses;
   }

   public int getReset() {
      return this.reset;
   }

   public ActivityFCBuy(String var1) {
      int var10000 = 3 ^ 3;
      super();
      int var4 = var10000;
      int var3 = 5 >> 3;
      int var2 = 3 >> 2;

      for(var10000 = var3; var10000 < var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("|", var4 + (3 & 5))) == -4 >> 2) {
            var3 = var1.length();
         }

         if ((var2 = var1.indexOf("=", var4 + (2 ^ 3))) == -4 >> 2 || var2 > var3) {
            var2 = var3;
         }

         String var5;
         if ((var5 = var1.substring(var4, var2)).equals(KEYS[2 & 5])) {
            var10000 = var3;
            this.uses = ActivityFC.f(var1, var2 + --1, var3);
         } else if (var5.equals(KEYS[--1])) {
            var10000 = var3;
            this.gains = ActivityFC.f(var1, var2 + --1, var3);
         } else if (var5.equals(KEYS[1 ^ 3])) {
            var10000 = var3;
            this.buyMax = hd.b(var1, var2 + --1, var3);
         } else {
            if (var5.equals(KEYS[--3])) {
               this.reset = hd.b(var1, var2 + (3 & 5), var3);
            }

            var10000 = var3;
         }

         var4 = var10000 + 1;
      }

   }

   public void setUses(ActivityFCBase[] var1) {
      this.uses = var1;
   }

   public ActivityFCBase[] getGains() {
      return this.gains;
   }

   public int getBuyMax() {
      return this.buyMax;
   }

   public void setBuyMax(int var1) {
      this.buyMax = var1;
   }

   public void setGains(ActivityFCBase[] var1) {
      this.gains = var1;
   }

   public void setReset(int var1) {
      this.reset = var1;
   }
}
