package com.xy.readbean;

import com.xy.cX;
import com.xy.hd;
import java.awt.Point;

public class ActivityFCEnroll {
   private int t1;
   private static String[] KEYS;
   private Point requireNum;
   private Point requireLvl;
   private ActivityFCBase[] uses;
   private int t2;

   public void a(String var1, int var2, int var3) {
      Point var4 = new Point();
      int var5 = 3 ^ 3;

      int var6;
      for(int var10000 = var6 = 2 & 5; var10000 < var3; var10000 = var6) {
         if ((var6 = var1.indexOf("#", var2 + (5 >> 2))) == -4 >> 2 || var6 > var3) {
            var6 = var3;
         }

         if (var5 == 0) {
            var10000 = var6;
            var4.x = hd.b(var1, var2, var6);
         } else {
            if (var5 == 3 >> 1) {
               var4.y = hd.b(var1, var2, var6);
            }

            var10000 = var6;
         }

         ++var5;
         var2 = var10000 + 1;
      }

      this.requireNum = var4;
   }

   public void setRequireLvl(Point var1) {
      this.requireLvl = var1;
   }

   public void setUses(ActivityFCBase[] var1) {
      this.uses = var1;
   }

   public void setT2(int var1) {
      this.t2 = var1;
   }

   public void setT1(int var1) {
      this.t1 = var1;
   }

   public int getT2() {
      return this.t2;
   }

   public Point getRequireLvl() {
      return this.requireLvl;
   }

   public int getT1() {
      return this.t1;
   }

   static {
      String[] var10000 = new String[--4];
      boolean var10002 = true;
      var10000[5 >> 3] = "人数要求";
      var10000[5 >> 2] = "等级要求";
      var10000[1 ^ 3] = "消耗";
      var10000[--3] = "说明";
      KEYS = var10000;
   }

   public ActivityFCEnroll(String var1) {
      int var10000 = 3 ^ 3;
      super();
      int var4 = var10000;
      int var3 = 3 & 4;
      int var2 = 2 & 5;

      for(var10000 = var3; var10000 < var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("|", var4 + --1)) == -4 >> 2) {
            var3 = var1.length();
         }

         if ((var2 = var1.indexOf("=", var4 + --1)) == -4 >> 2 || var2 > var3) {
            var2 = var3;
         }

         String var5;
         if ((var5 = var1.substring(var4, var2)).equals(KEYS[3 >> 2])) {
            var10000 = var3;
            this.a(var1, var2 + (4 ^ 5), var3);
         } else if (var5.equals(KEYS[4 ^ 5])) {
            var10000 = var3;
            this.b(var1, var2 + --1, var3);
         } else if (var5.equals(KEYS[--2])) {
            var10000 = var3;
            this.uses = ActivityFC.f(var1, var2 + --1, var3);
         } else {
            if (var5.equals(KEYS[--3])) {
               this.c(var1, var2 + (5 >> 2), var3);
            }

            var10000 = var3;
         }

         var4 = var10000 + 1;
      }

   }

   public ActivityFCBase[] getUses() {
      return this.uses;
   }

   public void b(String var1, int var2, int var3) {
      Point var4 = new Point();
      int var5 = 3 & 4;

      int var6;
      for(int var10000 = var6 = 3 & 4; var10000 < var3; var10000 = var6) {
         if ((var6 = var1.indexOf("#", var2 + (3 >> 1))) == -4 >> 2 || var6 > var3) {
            var6 = var3;
         }

         if (var5 == 0) {
            var10000 = var6;
            var4.x = cX.o(var1.substring(var2, var6));
         } else {
            if (var5 == --1) {
               var4.y = cX.o(var1.substring(var2, var6));
            }

            var10000 = var6;
         }

         ++var5;
         var2 = var10000 + 1;
      }

      this.requireLvl = var4;
   }

   public Point getRequireNum() {
      return this.requireNum;
   }

   public void setRequireNum(Point var1) {
      this.requireNum = var1;
   }

   public void c(String var1, int var2, int var3) {
      int var4 = 3 >> 2;

      int var5;
      for(int var10000 = var5 = 3 >> 2; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf("#", var2 + (3 >> 1))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.t1 = hd.b(var1, var2, var5);
         } else {
            if (var4 == (2 ^ 3)) {
               this.t2 = hd.b(var1, var2, var5);
            }

            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }
}
