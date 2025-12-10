package com.xy.readbean;

public class ActivityFCLucky {
   private ActivityFCBase[] gains;
   private static String[] KEYS;
   private ActivityFCBase[] uses;
   private ActivityFCBase[] luckys;

   static {
      String[] var10000 = new String[--3];
      boolean var10002 = true;
      var10000[3 & 4] = "消耗";
      var10000[4 ^ 5] = "获得";
      var10000[5 >> 1] = "大奖设置";
      KEYS = var10000;
   }

   public void setLuckys(ActivityFCBase[] var1) {
      this.luckys = var1;
   }

   public ActivityFCBase[] getUses() {
      return this.uses;
   }

   public ActivityFCBase[] getGains() {
      return this.gains;
   }

   public void setUses(ActivityFCBase[] var1) {
      this.uses = var1;
   }

   public ActivityFCLucky(String var1) {
      int var10000 = 3 & 4;
      super();
      int var4 = var10000;
      int var3 = 3 >> 2;
      int var2 = 2 & 5;

      for(var10000 = var3; var10000 < var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("|", var4 + (3 >> 1))) == -4 >> 2) {
            var3 = var1.length();
         }

         if ((var2 = var1.indexOf("=", var4 + (2 ^ 3))) == -4 >> 2 || var2 > var3) {
            var2 = var3;
         }

         String var5;
         if ((var5 = var1.substring(var4, var2)).equals(KEYS[3 & 4])) {
            var10000 = var3;
            this.uses = ActivityFC.f(var1, var2 + (5 >> 2), var3);
         } else if (var5.equals(KEYS[3 >> 1])) {
            var10000 = var3;
            this.gains = ActivityFC.f(var1, var2 + --1, var3);
         } else {
            if (var5.equals(KEYS[1 ^ 3])) {
               this.luckys = ActivityFC.e(var1, var2 + --1, var3);
            }

            var10000 = var3;
         }

         var4 = var10000 + 1;
      }

   }

   public void setGains(ActivityFCBase[] var1) {
      this.gains = var1;
   }

   public ActivityFCBase[] getLuckys() {
      return this.luckys;
   }
}
