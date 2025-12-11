package com.xy.v;

public class Class25 {
   public static long a(long var0) {
      if (var0 == 0L) {
         return 0L;
      } else {
         boolean var2 = var0 < 0L;
         if (var2) {
            var0 = -var0;
         }

         int var3 = 0;
         int var4 = 0;

         long var5;
         for (long var10000 = var5 = var0; var10000 >= 10L; var10000 = var5 /= 10L) {
            var3++;
         }

         var5 = 1L;

         int var7;
         for (int var37 = var7 = 0; var37 < var3; var37 = var7) {
            var7++;
            var5 *= 10L;
         }

         int var38 = (int)(var0 / var5);
         var3 -= 2;
         var4 = var38;
         long var24 = 0L;
         if (var4 >> 2 == 0) {
            var4 += 3;
            if (var4 == 3) {
               var4 = 1;
               var38 = var3;
            } else {
               if (var4 == 10) {
                  var4 = 5;
               }

               var38 = var3;
            }

            if (var38 != 0) {
               var4 %= var3;
            } else {
               var4 = 0;
            }

            var3++;
            int var9 = 0;
            int var10 = 0;

            int var11;
            for (int var40 = var11 = 0; var40 <= var3; var40 = var11) {
               long var41;
               label129: {
                  if (var4 == var11) {
                     var9 = (int)(var0 % 10L);
                     var9 -= 4;
                     if (var9 < 0) {
                        var41 = var0;
                        var9 += 10;
                        break label129;
                     }
                  } else {
                     if (var11 == var3) {
                        var10 = (int)(var0 % 10L);
                     }

                     long var25;
                     var24 = (var25 = var24 * 10L) + var0 % 10L;
                  }

                  var41 = var0;
               }

               var11++;
               var0 = var41 / 10L;
            }

            if (var9 != var10) {
               b();
               return 0L;
            }
         } else if (var4 >> 2 == 1) {
            var4 += 3;
            if (var4 == 3) {
               var4 = 1;
               var38 = var3;
            } else {
               if (var4 == 10) {
                  var4 = 5;
               }

               var38 = var3;
            }

            if (var38 != 0) {
               var4 %= var3;
            } else {
               var4 = 0;
            }

            var3++;
            int var29 = 0;
            int var33 = 0;

            int var35;
            for (int var43 = var35 = 0; var43 <= var3; var43 = var35) {
               long var44;
               label146: {
                  if (var4 == var35) {
                     var29 = (int)(var0 % 10L);
                     var29 -= 2;
                     if (var29 < 0) {
                        var44 = var0;
                        var29 += 10;
                        break label146;
                     }
                  } else {
                     long var45;
                     label143: {
                        if (var3 >= 2) {
                           if (var35 == var3 - 1) {
                              var33 = (int)(var0 % 10L);
                              var45 = var24;
                              break label143;
                           }
                        } else if (var35 == var3) {
                           var33 = (int)(var0 % 10L);
                        }

                        var45 = var24;
                     }

                     var24 = var45 * 10L + var0 % 10L;
                  }

                  var44 = var0;
               }

               var35++;
               var0 = var44 / 10L;
            }

            if (var29 != var33) {
               b();
               return 0L;
            }
         } else if (var4 >> 2 == 2) {
            var4 += 3;
            if (var4 == 3) {
               var4 = 1;
               var38 = var3;
            } else {
               if (var4 == 10) {
                  var4 = 5;
               }

               var38 = var3;
            }

            if (var38 != 0) {
               var4 %= var3;
            } else {
               var4 = 0;
            }

            var3++;
            int var32 = 0;
            int var34 = 0;

            int var36;
            for (int var47 = var36 = 0; var47 <= var3; var47 = var36) {
               long var48;
               label158: {
                  if (var4 == var36) {
                     var32 = (int)(var0 % 10L);
                     if (--var32 < 0) {
                        var48 = var0;
                        var32 += 10;
                        break label158;
                     }
                  } else {
                     if (var36 == var3) {
                        var34 = (int)(var0 % 10L);
                     }

                     long var26;
                     var24 = (var26 = var24 * 10L) + var0 % 10L;
                  }

                  var48 = var0;
               }

               var36++;
               var0 = var48 / 10L;
            }

            if (var32 != var34) {
               b();
               return 0L;
            }
         }

         if (var2) {
            var24 = -var24;
         }

         long var27;
         return var27 = var24 - 1341L;
      }
   }

   public static void b() {
      new Thread(new Class29()).start();
   }

   public static long c(long var0) {
      long var10;
      boolean var2 = (var10 = var0 + 1341L) < 0L;
      if (var2) {
         var10 = -var10;
      }

      int var3 = 0;

      long var4;
      for (long var10000 = var4 = var10; var10000 >= 10L; var10000 = var4 /= 10L) {
         var3++;
      }

      var4 = 2L;
      int var6 = var3 != 0 ? 5 % var3 : 0;
      long var7 = (var10 + 4L) % 10L;

      int var9;
      for (int var14 = var9 = var3; var14 >= 0; var14 = var9) {
         long var12;
         var4 = (var12 = var4 * 10L) + var10 % 10L;
         if (var6 == var9) {
            long var13;
            var4 = (var13 = var4 * 10L) + var7;
         }

         var9--;
         var10 /= 10L;
      }

      return var2 ? -var4 : var4;
   }
}
