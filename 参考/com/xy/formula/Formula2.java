package com.xy.formula;

public class Formula2 implements Formula {
   private int[] indexs;
   private double base;
   private double add;

   public double a(double var1, int var3, int var4) {
      double var5 = this.base;

      for(int var10000 = var3 = this.indexs.length - --1; var10000 >= 0; var10000 = var3) {
         if (!(var1 < (double)this.indexs[var3])) {
            return var5 + (double)(var3 + (3 & 5)) * this.add;
         }

         --var3;
      }

      return var5;
   }

   public Formula2(String var1, int var2, int var3) {
      int var10000 = 2 & 5;
      super();
      int var4 = var10000;

      int var5;
      for(var10000 = var5 = 5 >> 3; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf(",", var2 + (4 ^ 5))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.base = Double.parseDouble(var1.substring(var2, var5));
         } else if (var4 == 3 >> 1) {
            var10000 = var5;
            this.add = Double.parseDouble(var1.substring(var2, var5));
         } else {
            if (var4 == --2) {
               String[] var6 = var1.substring(var2, var5).split("#");
               int[] var10001 = new int[var6.length];
               boolean var10003 = true;
               this.indexs = var10001;

               int var7;
               for(var10000 = var7 = 3 >> 2; var10000 < var6.length; var10000 = var7) {
                  int[] var8 = this.indexs;
                  int var9 = var7;
                  int var10002 = Integer.parseInt(var6[var7]);
                  ++var7;
                  var8[var9] = var10002;
               }
            }

            var10000 = var5;
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }
}
