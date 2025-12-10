package com.xy.formula;

import com.xy.socket.GameClient;
import java.math.BigDecimal;

public class ExpUtil {
   public static long YEAR = 4380L;
   public static long DAY = 12L;

   public static int a(int var0, GameClient var1) {
      switch(var0) {
      case 1:
         while(false) {
         }

         return 15;
      case 2:
         return 25;
      case 3:
         return 40;
      case 4:
         if (var1.gameNewTyc) {
            return 121 & 126;
         }

         return 60;
      default:
         return 0;
      }
   }

   public static int getTSX(int var0) {
      int var1 = 25 & 111;
      int var2 = 5 >> 3;
      int var3;
      int var10000 = var3 = 2 & 5;

      while(true) {
         if (var10000 % 2 == 0) {
            ++var2;
         }

         if (var3 % (119 & 46) == --4) {
            ++var2;
         }

         var1 += var2;
         if (var0 < var1) {
            return var0;
         }

         ++var3;
         var0 -= var1;
         var10000 = var3;
      }
   }

   public static long b(int var0) {
      return (long)(var0 * var0 * (15 & 127));
   }

   public static long c(int var0) {
      return (long)(var0 * var0 * (79 & 63) - (var0 - (3 >> 1)) * (var0 - (3 & 5)) * (127 & 15));
   }

   public static long d(long var0) {
      int var2;
      for(int var10000 = var2 = 5 >> 2; var10000 <= 20; var10000 = var2) {
         if ((long)((var2 * (11515 & 21502) + (51 & 126) + (8124 & 24943)) * var2 / (1 ^ 3)) > var0) {
            return (long)var2;
         }

         ++var2;
      }

      return 20L;
   }

   public static String e(long var0) {
      StringBuffer var2;
      (var2 = new StringBuffer()).append(var0 / YEAR);
      var2.append("年");
      var0 %= YEAR;
      var2.append(var0 / DAY);
      var2.append("天");
      var2.append(var0 % DAY);
      var2.append("时辰");
      return var2.toString();
   }

   public static int getTSExp(int var0) {
      int var1 = 125 & 11;
      int var2 = 5 >> 3;

      int var3;
      for(int var10000 = var3 = 3 & 4; var10000 < var0; var10000 = var3) {
         if (var3 % (1 ^ 3) == 0) {
            ++var2;
         }

         if (var3 % (39 & 126) == --4) {
            ++var2;
         }

         ++var3;
         var1 += var2;
      }

      return var1;
   }

   public static long getPetSkillMaxExp(long var0) {
      return var0 * 250L + 50L;
   }

   public static int f(int var0) {
      if (var0 >= (25591 & 7613)) {
         return --4;
      } else if (var0 >= (19385 & 13799)) {
         return --3;
      } else if (var0 >= (10703 & 22399)) {
         return 5 >> 1;
      } else {
         return var0 >= (19967 & 13115) ? 3 & 5 : 0;
      }
   }

   public static long getPetSkillNowExp(long var0) {
      long var2 = (((var2 = d(var0)) - 1L) * 250L + 50L + 300L) * (var2 - 1L) / 2L;
      return var0 - var2;
   }

   public static String g(String var0, int var1) {
      return var1 <= 0 ? null : var0.split("\\|")[var1 - --1];
   }

   public static int getMountExp(int var0) {
      if (var0 > (126 & 101)) {
         var0 -= 90;
      }

      return (var0 + --1) * (var0 + --1) * (95 & 47);
   }

   public static String h(BigDecimal var0, int var1) {
      String var2;
      switch((var2 = var0.toString()).hashCode()) {
      case 46730162:
         while(false) {
         }

         if (var2.equals("10001")) {
            return g("旋照期|开光期|融合期|灵寂期", var1);
         }
         break;
      case 46730163:
         if (var2.equals("10002")) {
            return g("魔光期|凝元期|结丹期|离婴期", var1);
         }
         break;
      case 46730164:
         if (var2.equals("10003")) {
            return g("地仙期|天仙期|玄仙期|金仙期", var1);
         }
         break;
      case 46730165:
         if (var2.equals("10004")) {
            return g("炼魂期|混沌期|空冥期|神游期", var1);
         }
      }

      return null;
   }

   public static int getTSP(int var0) {
      int var1 = 109 & 27;
      int var2 = 5 >> 3;
      int var3;
      int var10000 = var3 = 3 >> 2;

      while(true) {
         if (var10000 % 2 == 0) {
            ++var2;
         }

         if (var3 % (47 & 118) == --4) {
            ++var2;
         }

         var1 += var2;
         if (var0 < var1) {
            return var3;
         }

         ++var3;
         var0 -= var1;
         var10000 = var3;
      }
   }
}
