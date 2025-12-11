package com.xy.v;

import com.xy.readbean.Goodstable;
import com.xy.scene.BWDHRuleBattleRecord;
import com.xy.scene.BWDHTeam;
import java.util.Comparator;

public class Class6 implements Comparator<Goodstable> {
   public static Class6 a = new Class6();

   public int a(Goodstable var1, Goodstable var2) {
      int var3;
      if ((var3 = var1.getType().compareTo(var2.getType())) > 0) {
         return 1;
      } else if (var3 < 0) {
         return -1;
      } else if ((var3 = var1.getGoodsid().compareTo(var2.getGoodsid())) > 0) {
         return 1;
      } else {
         return var3 < 0 ? -1 : 0;
      }
   }

   // $VF: synthetic method
   // $VF: bridge method
   @Override
   public int compare(Goodstable var1, Goodstable var2) {
      return this.a((Goodstable)var1, (Goodstable)var2);
   }

   public static void b(BWDHRuleBattleRecord[] var0) {
      int var1;
      for (int var10000 = var1 = 0; var10000 < var0.length; var10000 = ++var1) {
         BWDHRuleBattleRecord var2 = var0[var1];

         int var3;
         for (int var5 = var3 = var0.length - 1; var5 > var1; var5 = --var3) {
            BWDHRuleBattleRecord var4 = var0[var3];
            if (var2.getId() <= var4.getId()) {
               var0[var3] = var2;
               var0[var1] = var4;
               var2 = var4;
            }
         }
      }
   }

   public static void c(BWDHTeam[] var0) {
      int var1;
      for (int var10000 = var1 = 0; var10000 < var0.length; var10000 = ++var1) {
         BWDHTeam var2 = var0[var1];

         int var3;
         for (int var11 = var3 = var0.length - 1; var11 > var1; var11 = --var3) {
            BWDHTeam var4 = var0[var3];
            if (var2.getData2()[0] <= var4.getData2()[0]) {
               if (var2.getData2()[0] == var4.getData2()[0]) {
                  double var5 = var2.getData2()[4] + var2.getData2()[5];
                  double var7 = var4.getData2()[4] + var4.getData2()[5];
                  var5 /= Math.max(1, var2.getData2()[1] + var2.getData2()[2]);
                  var7 /= Math.max(1, var4.getData2()[1] + var4.getData2()[2]);
                  if (var5 > var7 || var5 == var7 && var2.getId() < var4.getId()) {
                     continue;
                  }
               }

               var0[var3] = var2;
               var0[var1] = var4;
               var2 = var4;
            }
         }
      }
   }
}
