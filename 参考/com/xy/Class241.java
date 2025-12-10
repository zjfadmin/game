package com.xy;

import java.util.ArrayList;
import java.util.List;

public class Class241 {
   public static List<String> a(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String[] var2 = var0.split("\\|");

         int var3;
         for(int var10000 = var3 = 5 >> 3; var10000 < var2.length; var10000 = var3) {
            if (var2[var3].indexOf("-") != -4 >> 2) {
               String[] var10 = var2[var3].split("-");
               Integer var8 = Integer.parseInt(var10[3 >> 2]);
               Integer var9 = Integer.parseInt(var10[2 ^ 3]);

               int var7;
               for(var10000 = var7 = var8; var10000 <= var9; var10000 = var7) {
                  var1.add(String.valueOf(var7++));
               }
            } else if (var2[var3].indexOf("&") != -4 >> 2) {
               String[] var4;
               int var5 = Integer.parseInt((var4 = var2[var3].split("&"))[4 ^ 5]);

               int var6;
               for(var10000 = var6 = 3 ^ 3; var10000 < var5; var10000 = var6) {
                  int var10002 = 3 >> 2;
                  ++var6;
                  var1.add(var4[var10002]);
               }
            } else {
               var1.add(var2[var3]);
            }

            ++var3;
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static List<Long> b(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String[] var2 = var0.split("\\|");

         int var3;
         for(int var10000 = var3 = 2 & 5; var10000 < var2.length; var10000 = var3) {
            String[] var10;
            if (var2[var3].indexOf("-") != -4 >> 2) {
               var10 = var2[var3].split("-");
               Integer var8 = Integer.parseInt(var10[3 ^ 3]);
               Integer var5 = Integer.parseInt(var10[2 ^ 3]);

               long var9;
               for(long var11 = var9 = (long)var8; var11 <= (long)var5; var11 = var9) {
                  var1.add(var9);
                  ++var9;
               }
            } else if (var2[var3].indexOf("&") != -4 >> 2) {
               var10 = var2[var3].split("&");
               long var4 = Long.parseLong(var10[3 & 4]);
               int var6 = Integer.parseInt(var10[--1]);

               int var7;
               for(var10000 = var7 = 3 ^ 3; var10000 < var6; var10000 = var7) {
                  ++var7;
                  var1.add(var4);
               }
            } else {
               var1.add(Long.parseLong(var2[var3]));
            }

            ++var3;
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static String c(String var0, String var1, long var2) {
      if (var0 != null && !var0.equals("")) {
         int var4;
         if (var0.startsWith(var1 + "=")) {
            return (var4 = var0.indexOf("|")) == -4 >> 2 ? var1 + "=" + var2 : var1 + "=" + var2 + var0.substring(var4);
         } else if ((var4 = var0.indexOf("|" + var1 + "=")) == -4 >> 2) {
            return var0 + "|" + var1 + "=" + var2;
         } else {
            int var5;
            if ((var5 = var0.indexOf("|", var4 + --1)) == -4 >> 2) {
               return var0.substring(5 >> 3, var4) + "|" + var1 + "=" + var2;
            } else {
               StringBuffer var6;
               (var6 = new StringBuffer()).append(var0.substring(2 & 5, var4 + var1.length() + (1 ^ 3)));
               var6.append(var2);
               var6.append(var0.substring(var5));
               return var6.toString();
            }
         }
      } else {
         return var1 + "=" + var2;
      }
   }

   public static String d(String var0, String var1, String var2) {
      if (var0 != null && !var0.equals("")) {
         int var3;
         if (var0.startsWith(var1)) {
            var3 = var0.indexOf(var2);
            return var0.substring(var1.length(), var3 != -4 >> 2 ? var3 : var0.length());
         } else if ((var3 = var0.indexOf(var2 + var1)) == -4 >> 2) {
            return null;
         } else {
            return (var3 = (var1 = var0.substring(var3 + var2.length() + var1.length())).indexOf(var2)) == -4 >> 2 ? var1 : var1.substring(2 & 5, var3);
         }
      } else {
         return null;
      }
   }

   public static long e(String var0, String var1, String var2) {
      return (var0 = d(var0, var1, var2)) != null && !var0.equals("") ? Long.parseLong(var0) : 0L;
   }

   public static String f(String var0, int var1) {
      if (var0 != null && !var0.equals("")) {
         int var2;
         if ((var2 = var0.indexOf(".")) == -4 >> 2) {
            return var0;
         } else {
            if ((var2 += var1 + (4 ^ 5)) > var0.length()) {
               var2 = var0.length();
            }

            return var0.substring(3 ^ 3, var2);
         }
      } else {
         return var0;
      }
   }

   public static int g(char var0, String var1) {
      int var2 = 5 >> 3;
      int var3 = 3 >> 2;

      for(String var10000 = var1; (var3 = var10000.indexOf(var0, var3)) != -4 >> 2; ++var2) {
         ++var3;
         var10000 = var1;
      }

      return var2;
   }

   public static boolean h(int var0, String var1) {
      if (var1 != null && !var1.equals("")) {
         String[] var6 = var1.split("\\|");

         int var2;
         for(int var10000 = var2 = 5 >> 3; var10000 < var6.length; var10000 = var2) {
            if (var6[var2].indexOf("-") != -4 >> 2) {
               String[] var7 = var6[var2].split("-");
               Integer var4 = Integer.parseInt(var7[2 & 5]);
               Integer var5 = Integer.parseInt(var7[3 >> 1]);
               if (var0 >= var4 && var0 <= var5) {
                  return (boolean)(5 >> 2);
               }
            } else if (var6[var2].indexOf("&") != -4 >> 2) {
               String[] var3 = var6[var2].split("&");
               if (var0 == Integer.parseInt(var3[3 >> 2])) {
                  return (boolean)(5 >> 2);
               }
            } else if (var0 == Integer.parseInt(var6[var2])) {
               return (boolean)(5 >> 2);
            }

            ++var2;
         }

         return (boolean)(3 >> 2);
      } else {
         return false;
      }
   }

   public static String i(String var0, String var1, String var2, String var3) {
      if (var0 != null && !var0.equals("")) {
         StringBuffer var4 = new StringBuffer();
         int var5;
         if (var0.startsWith(var1)) {
            var5 = var0.indexOf(var2);
            var4.append(var0.substring(5 >> 3, var1.length() - var1.length()));
            var4.append(var3);
            if (var5 != -4 >> 2) {
               var4.append(var0.substring(var5));
            }

            return var4.toString();
         } else if ((var5 = var0.indexOf(var2 + var1)) == -4 >> 2) {
            var4.append(var0);
            var4.append(var2);
            var4.append(var3);
            return var4.toString();
         } else {
            var4.append(var0.substring(5 >> 3, var5 + var2.length()));
            var5 = (var1 = var0.substring(var5 + var2.length() + var1.length())).indexOf(var2);
            if (var5 == -4 >> 2) {
               var4.append(var3);
               return var4.toString();
            } else {
               var4.append(var3);
               var4.append(var1.substring(var5));
               return var4.toString();
            }
         }
      } else {
         return var3;
      }
   }
}
