package com.xy.formula;

public class Formula0 implements Formula {
   private double base;
   private int type;
   private double value;
   private boolean lvl;
   private double sv;

   public double getSv() {
      return this.sv;
   }

   public Formula0(String var1, int var2, int var3) {
      int var10000 = 3 ^ 3;
      super();
      int var4 = var10000;

      int var5;
      for(var10000 = var5 = 3 >> 2; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf(",", var2 + (2 ^ 3))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.value = Double.parseDouble(var1.substring(var2, var5));
         } else if (var4 == --1) {
            var10000 = var5;
            this.sv = Double.parseDouble(var1.substring(var2, var5));
         } else {
            char var6;
            if ((var6 = var1.charAt(var2)) == (99 & 94)) {
               var10000 = var5;
               this.base = Double.parseDouble(var1.substring(var2 + (5 >> 2), var5));
            } else if (var6 == (127 & 76)) {
               var10000 = var5;
               this.lvl = (boolean)(3 & 5);
            } else {
               if (var6 == (87 & 124)) {
                  this.type = Integer.parseInt(var1.substring(var2 + --1, var5));
               }

               var10000 = var5;
            }
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }

   public double getValue() {
      return this.value;
   }

   public double a(double var1, int var3, int var4) {
      double var5;
      if (this.type == (2 ^ 3)) {
         var5 = this.value + var1 * this.sv;
         if (this.lvl) {
            var5 *= (double)(var4 >= --4 ? 12477 & 20470 : var3);
         }

         return var5 + this.base;
      } else {
         var5 = this.value + CustomFunction.getLogAndPow(var1) * this.sv;
         if (this.lvl) {
            var5 *= (double)(var4 >= --4 ? 26622 & 6325 : var3);
         }

         return var5 + this.base;
      }
   }
}
