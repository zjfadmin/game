package com.xy.formula;

import java.math.BigDecimal;

public class CustomFunction {
   private static final double LOGANDPOW15000 = 1.1760912590556813D;
   private static final double LOGANDPOW25000 = 1.3979400086720375D;
   private static final double LOGANDPOW20000 = 1.3010299956639813D;
   private static final double LOGANDPOW10000 = 1.0D;
   private static final double LOGANDPOW1 = 0.0625D;

   public static double getLogAndPow(double var0) {
      if (var0 == 25000.0D) {
         return 1.3979400086720375D;
      } else if (var0 == 0.0D) {
         return 0.0D;
      } else if (var0 == 1.0D) {
         return 0.0625D;
      } else if (var0 == 10000.0D) {
         return 1.0D;
      } else if (var0 == 15000.0D) {
         return 1.1760912590556813D;
      } else if (var0 == 20000.0D) {
         return 1.3010299956639813D;
      } else {
         double var2 = Math.log10(var0);
         double var4 = Math.pow(2.0D, (double)((int)var2)) * 100.0D;
         var2 %= 1.0D;
         return (1.0D + var2) * var4 / 1600.0D;
      }
   }

   public static double a(long var0, double var2) {
      if (var0 <= 0L) {
         return 0.0D;
      } else {
         while(var0 / 16L > 0L) {
            var0 /= 16L;
            var2 *= 1.86D;
         }

         var2 *= 1.0D + 0.86D * ((double)var0 / 16.0D);
         return (new BigDecimal(var2)).setScale(5 >> 1, --4).doubleValue();
      }
   }

   public static void main(String[] var0) {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      long var1 = 20000000L;
      double var3 = 0.0D;
      double var5 = 55.0D;

      do {
         var3 += 0.01D;
      } while(!(a(var1, var3) >= var5));

      System.out.println(var3 + ":" + a(var1, var3));
      System.out.println(var3 + ":" + a(var1, 1.3D));
   }
}
