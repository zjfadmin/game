package com.xy.readbean;

import com.xy.hd;

public class ActivityFCTarget {
   private int t2;
   private ActivityFCBase[] gains;
   private int t1;
   private static String[] RECORDKEYS;
   private int reset;
   private static String[] KEYS;
   private ActivityFCBase target;
   private String skin;
   private static String[] TARGETKEYS;

   public void setTarget(ActivityFCBase var1) {
      this.target = var1;
   }

   static {
      String[] var10000 = new String[94 & 39];
      boolean var10002 = true;
      var10000[3 >> 2] = "要求";
      var10000[4 ^ 5] = "获得";
      var10000[5 >> 1] = "重置";
      var10000[--3] = "标题";
      var10000[--4] = "简介";
      var10000[--5] = "图标";
      KEYS = var10000;
      var10000 = new String[--2];
      var10002 = true;
      var10000[3 >> 2] = "活动数值";
      var10000[3 & 5] = "完成任务";
      TARGETKEYS = var10000;
      var10000 = new String[--5];
      var10002 = true;
      var10000[5 >> 3] = "获得货币";
      var10000[2 ^ 3] = "消耗货币";
      var10000[1 ^ 3] = "完成任务";
      var10000[--3] = "指定robot";
      var10000[--4] = "祈福";
      RECORDKEYS = var10000;
   }

   public int getReset() {
      return this.reset;
   }

   public void setT1(int var1) {
      this.t1 = var1;
   }

   public ActivityFCTarget(String var1) {
      int var10000 = 3 ^ 3;
      super();
      int var4 = var10000;
      int var3 = 3 & 4;
      int var2 = 5 >> 3;

      for(var10000 = var3; var10000 < var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("|", var4 + (3 & 5))) == -4 >> 2) {
            var3 = var1.length();
         }

         if ((var2 = var1.indexOf("=", var4 + (3 >> 1))) == -4 >> 2 || var2 > var3) {
            var2 = var3;
         }

         String var5;
         if ((var5 = var1.substring(var4, var2)).equals(KEYS[3 >> 2])) {
            var10000 = var3;
            this.a(var1, var2 + --1, var3);
         } else if (var5.equals(KEYS[--1])) {
            var10000 = var3;
            this.gains = ActivityFC.f(var1, var2 + (4 ^ 5), var3);
         } else if (var5.equals(KEYS[1 ^ 3])) {
            var10000 = var3;
            this.reset = hd.b(var1, var2 + --1, var3);
         } else if (var5.equals(KEYS[--3])) {
            var10000 = var3;
            this.t1 = hd.b(var1, var2 + (5 >> 2), var3);
         } else if (var5.equals(KEYS[--4])) {
            var10000 = var3;
            this.t2 = hd.b(var1, var2 + (3 >> 1), var3);
         } else {
            if (var5.equals(KEYS[--5])) {
               this.skin = var1.substring(var2 + (4 ^ 5), var3);
            }

            var10000 = var3;
         }

         var4 = var10000 + 1;
      }

   }

   public int getT2() {
      return this.t2;
   }

   public void setReset(int var1) {
      this.reset = var1;
   }

   public ActivityFCBase getTarget() {
      return this.target;
   }

   public void setSkin(String var1) {
      this.skin = var1;
   }

   public ActivityFCBase[] getGains() {
      return this.gains;
   }

   public String getSkin() {
      return this.skin;
   }

   public void a(String var1, int var2, int var3) {
      ActivityFCBase var4 = new ActivityFCBase();
      int var5 = 2 & 5;

      int var6;
      for(int var10000 = var6 = 2 & 5; var10000 < var3; var10000 = var6) {
         if ((var6 = var1.indexOf(",", var2 + --1)) == -4 >> 2 || var6 > var3) {
            var6 = var3;
         }

         label31: {
            if (var5 == 0) {
               var4.setType(getActivityTargetKey(var1.substring(var2, var6)));
               if (var4.getType() == 0) {
                  throw new ArithmeticException("异常要求类型:" + var1.substring(var2, var6));
               }
            } else {
               if (var5 == 5 >> 2) {
                  var10000 = var6;
                  var4.setId(hd.b(var1, var2, var6));
                  break label31;
               }

               if (var5 == --2) {
                  var4.setNum((long)hd.b(var1, var2, var6));
               }
            }

            var10000 = var6;
         }

         ++var5;
         var2 = var10000 + 1;
      }

      this.target = var4;
   }

   public static int getActivityTargetKey(String var0) {
      int var1;
      for(int var10000 = var1 = 2 & 5; var10000 < TARGETKEYS.length; var10000 = var1) {
         if (TARGETKEYS[var1].equals(var0)) {
            return var1 + --1;
         }

         ++var1;
      }

      return 3 & 4;
   }

   public int getT1() {
      return this.t1;
   }

   public static int getActivityRecordKey(String var0) {
      int var1;
      for(int var10000 = var1 = 3 ^ 3; var10000 < RECORDKEYS.length; var10000 = var1) {
         if (RECORDKEYS[var1].equals(var0)) {
            return var1 + --1;
         }

         ++var1;
      }

      return 3 & 4;
   }

   public void setT2(int var1) {
      this.t2 = var1;
   }

   public void setGains(ActivityFCBase[] var1) {
      this.gains = var1;
   }
}
