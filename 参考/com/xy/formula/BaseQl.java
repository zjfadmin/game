package com.xy.formula;

public class BaseQl {
   private double value2;
   private double value;
   private String key;

   public double getValue() {
      return this.value;
   }

   public BaseQl(String var1, double var2, double var4) {
      this.key = var1;
      this.value = var2;
      this.value2 = var4;
   }

   public BaseQl(String var1, double var2) {
      this.key = var1;
      this.value = var2;
   }

   public void setValue(double var1) {
      this.value = var1;
   }

   public void setKey(String var1) {
      this.key = var1;
   }

   public static BaseQl a(String var0, int var1, int var2) {
      String var9 = null;
      double var4 = 0.0D;
      double var6 = 0.0D;
      int var8 = 5 >> 3;

      int var3;
      for(int var10000 = var3 = 3 >> 2; var10000 < var2; var10000 = var3) {
         String var10001;
         int var10002;
         if (var8 == 0) {
            var10001 = "=";
            var10002 = var1;
         } else {
            var10001 = ",";
            var10002 = var1;
         }

         if ((var3 = var0.indexOf(var10001, var10002 + 1)) == -4 >> 2 || var3 > var2) {
            var3 = var2;
         }

         if (var8 == 0) {
            var9 = var0.substring(var1, var3);
            var10000 = var3;
         } else if (var8 == --1) {
            var4 = new Double(var0.substring(var1, var3));
            var10000 = var3;
         } else {
            if (var8 == (1 ^ 3)) {
               var6 = new Double(var0.substring(var1, var3));
            }

            var10000 = var3;
         }

         ++var8;
         var1 = var10000 + 1;
      }

      return new BaseQl(var9, var4, var6);
   }

   public String getKey() {
      return this.key;
   }

   public double getValue2() {
      return this.value2;
   }

   public void setValue2(double var1) {
      this.value2 = var1;
   }
}
