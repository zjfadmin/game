package com.xy.formula;

public class Formula1 implements Formula {
   private double a1;
   private Double max;
   private Double min;
   private double base;
   private double d;

   public double a(double var1, int var3, int var4) {
      var1 = this.base + var1 * this.a1 + var1 * (var1 - 1.0D) * this.d / 2.0D;
      if (this.min != null) {
         var1 = Math.max(this.min, var1);
      }

      if (this.max != null) {
         var1 = Math.min(this.max, var1);
      }

      return var1;
   }

   public Formula1(String var1, int var2, int var3) {
      int var10000 = 3 >> 2;
      super();
      int var4 = var10000;

      int var5;
      for(var10000 = var5 = 2 & 5; var10000 < var3; var10000 = var5) {
         if ((var5 = var1.indexOf(",", var2 + (3 & 5))) == -4 >> 2 || var5 > var3) {
            var5 = var3;
         }

         if (var4 == 0) {
            var10000 = var5;
            this.base = Double.parseDouble(var1.substring(var2, var5));
         } else if (var4 == (2 ^ 3)) {
            var10000 = var5;
            this.a1 = Double.parseDouble(var1.substring(var2, var5));
         } else if (var4 == --2) {
            var10000 = var5;
            this.d = Double.parseDouble(var1.substring(var2, var5));
         } else {
            String var6;
            if ((var6 = var1.substring(var2, var5)).startsWith("MIN")) {
               var10000 = var5;
               this.min = Double.parseDouble(var6.substring(--3));
            } else {
               if (var6.startsWith("MAX")) {
                  this.max = Double.parseDouble(var6.substring(--3));
               }

               var10000 = var5;
            }
         }

         ++var4;
         var2 = var10000 + 1;
      }

   }
}
