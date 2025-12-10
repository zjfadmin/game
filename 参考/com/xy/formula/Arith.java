package com.xy.formula;

import java.math.BigDecimal;

public class Arith {
   private static final int DEF_DIV_SCALE = 10;


   private Arith() {
   }

   public static double a(double var0, double var2) {
      return f(var0, var2, 90 & 47);
   }

   public static double b(double var0, double var2) {
      BigDecimal var1 = new BigDecimal(Double.toString(var0));
      BigDecimal var4 = new BigDecimal(Double.toString(var2));
      return var1.multiply(var4).doubleValue();
   }

   public static double c(double var0, double var2) {
      BigDecimal var1 = new BigDecimal(Double.toString(var0));
      BigDecimal var4 = new BigDecimal(Double.toString(var2));
      return var1.add(var4).doubleValue();
   }

   public static double d(double var0, double var2) {
      BigDecimal var1 = new BigDecimal(Double.toString(var0));
      BigDecimal var4 = new BigDecimal(Double.toString(var2));
      return var1.subtract(var4).doubleValue();
   }

   public static double e(double var0, int var2) {
      int var3 = var2;
      if (var2 < 0) {
         throw new IllegalArgumentException("The scale must be a positive integer or zero");
      } else {
         BigDecimal var1 = new BigDecimal(Double.toString(var0));
         BigDecimal var4 = new BigDecimal("1");
         return var1.divide(var4, var3, --4).doubleValue();
      }
   }

   public static double f(double var0, double var2, int var4) {
      if (var4 < 0) {
         throw new IllegalArgumentException("The scale must be a positive integer or zero");
      } else {
         BigDecimal var1 = new BigDecimal(Double.toString(var0));
         BigDecimal var5 = new BigDecimal(Double.toString(var2));
         return var1.divide(var5, var4, --4).doubleValue();
      }
   }

   public static void main(String[] var0) {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      double var1 = 0.14D;
      double var3 = 100.0D;
      System.out.println(c(var1, var3));
      System.out.println(d(var1, var3));
      System.out.println(b(var1, var3));
      System.out.println(a(var1, var3));
      System.out.println(f(var1, var3, 2 ^ 3));
      System.out.println(e(var1, 2 ^ 3));
   }
}
