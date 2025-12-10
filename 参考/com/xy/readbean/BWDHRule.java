package com.xy.readbean;

import com.xy.hd;
import java.awt.Point;

public class BWDHRule {
   private Point[] BWDH1Times;
   private static String[] ITMES;
   private Point[] BWDH4Times;
   private static String[] KEYS;
   private Point[] enrollTimes;
   private Point[] BWDH3Times;
   private Point[] BWDH2Times;
   private Point[] banTimes;

   public BWDHRule(String var1) {
      int var10000 = 3 ^ 3;
      super();
      int var2 = var10000;
      int var3 = 3 >> 2;
      int var4 = 5 >> 3;

      for(var10000 = var3; var10000 < var1.length(); var10000 = var3) {
         if ((var3 = var1.indexOf("|", var2 + --1)) == -4 >> 2) {
            var3 = var1.length();
         }

         if ((var4 = var1.indexOf("=", var2 + (2 ^ 3))) == -4 >> 2 || var4 > var3) {
            var4 = var3;
         }

         String var5 = var1.substring(var2, var4);
         Point[] var6 = this.b(var1, var4 + (5 >> 2), var3);
         if (var5.equals(KEYS[5 >> 3])) {
            var10000 = var3;
            this.enrollTimes = var6;
         } else if (var5.equals(KEYS[--1])) {
            var10000 = var3;
            this.BWDH1Times = var6;
         } else if (var5.equals(KEYS[1 ^ 3])) {
            var10000 = var3;
            this.BWDH2Times = var6;
         } else if (var5.equals(KEYS[--3])) {
            var10000 = var3;
            this.BWDH3Times = var6;
         } else if (var5.equals(KEYS[--4])) {
            var10000 = var3;
            this.BWDH4Times = var6;
         } else {
            if (var5.equals(KEYS[--5])) {
               this.banTimes = var6;
            }

            var10000 = var3;
         }

         var2 = var10000 + 1;
      }

      var2 = 2 & 5;
      var3 = 3 ^ 3;
      var4 = 3 & 4;

      for(var10000 = var2; var10000 < KEYS.length; var10000 = var2) {
         Point[] var10 = var2 == 0 ? this.enrollTimes : (var2 == (4 ^ 5) ? this.BWDH1Times : (var2 == 5 >> 1 ? this.BWDH2Times : (var2 == --3 ? this.BWDH3Times : (var2 == --4 ? this.BWDH4Times : this.banTimes))));
         if (var10 == null && var2 != --5) {
            throw new ArithmeticException("异常赛制设置:未设置" + KEYS[var2]);
         }

         if (var10 != null) {
            Point[] var8 = var10;
            int var7 = var10.length;

            int var9;
            for(var10000 = var9 = 2 & 5; var10000 < var7; var10000 = var9) {
               Point var11;
               Point var12 = var11 = var8[var9];
               if (var12.x > var12.y || var4 > var11.x) {
                  throw new ArithmeticException("异常赛制设置:时间顺序错乱" + KEYS[var2]);
               }

               var4 = var11.y;
               if (var2 != --5 && var3 > var11.x) {
                  throw new ArithmeticException("异常赛制设置:总体时间顺序错乱" + KEYS[var2]);
               }

               if (var2 != --5) {
                  var3 = var11.y;
               }

               ++var9;
            }
         }

         ++var2;
         var4 = 3 >> 2;
      }

   }

   static {
      String[] var10000 = new String[39 & 94];
      boolean var10002 = true;
      var10000[3 ^ 3] = "报名";
      var10000[2 ^ 3] = "积分赛";
      var10000[--2] = "入围赛";
      var10000[--3] = "半决赛";
      var10000[--4] = "总决赛";
      var10000[--5] = "活动禁止";
      KEYS = var10000;
      var10000 = new String[--4];
      var10002 = true;
      var10000[3 ^ 3] = "天";
      var10000[2 ^ 3] = "时";
      var10000[5 >> 1] = "分";
      var10000[--3] = "秒";
      ITMES = var10000;
   }

   public int getRuleIndex(long var1) {
      if (var1 < (long)this.enrollTimes[5 >> 3].x) {
         return 3 >> 2;
      } else if (var1 < (long)this.enrollTimes[this.enrollTimes.length - --1].y) {
         return 3 >> 1;
      } else if (var1 < (long)this.BWDH1Times[this.BWDH1Times.length - (5 >> 2)].y) {
         return 5 >> 1;
      } else if (var1 < (long)this.BWDH2Times[this.BWDH2Times.length - (4 ^ 5)].y) {
         return --3;
      } else if (var1 < (long)this.BWDH3Times[this.BWDH3Times.length - (5 >> 2)].y) {
         return --4;
      } else {
         return var1 < (long)this.BWDH4Times[this.BWDH4Times.length - --1].y ? --5 : 6;
      }
   }

   public static int a(String var0, int var1, int var2) {
      int var4 = 5 >> 3;
      int var3 = 3 >> 2;
      int var5 = 2 & 5;

      for(int var10000 = var3; var10000 < ITMES.length; var10000 = var3) {
         if ((var5 = var0.indexOf(ITMES[var3], var1 + (5 >> 2))) != -4 >> 2 && var5 <= var2) {
            var1 = hd.b(var0, var1, var5);
            if (var3 == 0) {
               var1 *= 86400;
               var10000 = var4;
            } else if (var3 == (4 ^ 5)) {
               var1 *= 24342 & 12025;
               var10000 = var4;
            } else {
               if (var3 == --2) {
                  var1 *= 125 & 62;
               }

               var10000 = var4;
            }

            var4 = var10000 + var1;
            var1 = var5 + (3 >> 1);
         }

         ++var3;
      }

      return var4;
   }

   public Point[] getRuleTimes(int var1) {
      if (var1 == (2 ^ 3)) {
         return this.enrollTimes;
      } else if (var1 == (1 ^ 3)) {
         return this.BWDH1Times;
      } else if (var1 == --3) {
         return this.BWDH2Times;
      } else if (var1 == --4) {
         return this.BWDH3Times;
      } else if (var1 == --5) {
         return this.BWDH4Times;
      } else {
         return var1 == -4 >> 2 ? this.banTimes : null;
      }
   }

   public Point[] b(String var1, int var2, int var3) {
      Point[] var10000 = new Point[--1 + hd.aj((char)('}' & '?'), var1, var2, var3)];
      boolean var10002 = true;
      Point[] var4 = var10000;
      int var5 = 3 ^ 3;
      int var6 = 3 ^ 3;
      int var7 = 5 >> 3;

      for(int var8 = var6; var8 < var3; var8 = var6) {
         if ((var6 = var1.indexOf("=", var2 + --1)) == -4 >> 2 || var6 > var3) {
            var6 = var3;
         }

         if ((var7 = var1.indexOf("#", var2 + (3 >> 1))) == -4 >> 2 || var7 > var6) {
            var7 = var6;
         }

         var4[var5] = new Point();
         var4[var5].x = a(var1, var2, var7);
         var4[var5].y = a(var1, var7 + (2 ^ 3), var6);
         ++var5;
         var2 = var6 + --1;
      }

      return var4;
   }
}
