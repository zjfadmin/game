package com.xy;

import com.xy.readbean.Goodstable;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.scene.BWDHTeam;
import java.util.Comparator;

public class Class153 implements Comparator<Goodstable> {
   public static Class153 c = new Class153();

   public int c(Goodstable var1, Goodstable var2) {
      int var3;
      if ((var3 = var1.getType().compareTo(var2.getType())) > 0) {
         return --1;
      } else if (var3 < 0) {
         return -4 >> 2;
      } else if ((var3 = var1.getGoodsid().compareTo(var2.getGoodsid())) > 0) {
         return 4 ^ 5;
      } else {
         return var3 < 0 ? -4 >> 2 : 0;
      }
   }

   public static void d(BWDHTeam[] var0) {
      int var4;
      for(int var10000 = var4 = 3 >> 2; var10000 < var0.length; var10000 = var4) {
         BWDHTeam var2 = var0[var4];

         int var3;
         for(var10000 = var3 = var0.length - (3 & 5); var10000 > var4; var10000 = var3) {
            BWDHTeam var1 = var0[var3];
            if (var2.getData2()[2 & 5] <= var1.getData2()[3 >> 2]) {
               label42: {
                  if (var2.getData2()[3 & 4] == var1.getData2()[3 ^ 3]) {
                     double var5 = (double)(var2.getData2()[--4] + var2.getData2()[--5]);
                     double var7 = (double)(var1.getData2()[--4] + var1.getData2()[--5]);
                     var5 /= (double)Math.max(5 >> 2, var2.getData2()[5 >> 2] + var2.getData2()[--2]);
                     var7 /= (double)Math.max(2 ^ 3, var1.getData2()[2 ^ 3] + var1.getData2()[--2]);
                     if (var5 > var7 || var5 == var7 && var2.getId() < var1.getId()) {
                        break label42;
                     }
                  }

                  var0[var3] = var2;
                  var0[var4] = var1;
                  var2 = var1;
               }
            }

            --var3;
         }

         ++var4;
      }

   }

   public static void e(BWDHRuleBattleRecord[] var0) {
      int var1;
      for(int var10000 = var1 = 5 >> 3; var10000 < var0.length; var10000 = var1) {
         BWDHRuleBattleRecord var2 = var0[var1];

         int var3;
         for(var10000 = var3 = var0.length - (3 & 5); var10000 > var1; var10000 = var3) {
            BWDHRuleBattleRecord var4 = var0[var3];
            if (var2.getId() <= var4.getId()) {
               var0[var3] = var2;
               var0[var1] = var4;
               var2 = var4;
            }

            --var3;
         }

         ++var1;
      }

   }
}
