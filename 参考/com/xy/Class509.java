package com.xy;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Class509 {
   public static void a(StringBuffer var0, double var1) {
      if (var1 == (double)((int)var1)) {
         var0.append((int)var1);
      } else {
         var0.append(var1);
      }
   }

   public static long b(String var0, String var1, String var2) {
      return (var0 = c(var0, var1, var2)) != null && !var0.equals("") ? Long.parseLong(var0) : 0L;
   }

   public static String c(String var0, String var1, String var2) {
      if (var0 != null && !var0.equals("")) {
         int var3;
         if (var0.startsWith(var1)) {
            var3 = var0.indexOf(var2);
            return var0.substring(var1.length(), var3 != -4 >> 2 ? var3 : var0.length());
         } else if ((var3 = var0.indexOf(var2 + var1)) == -4 >> 2) {
            return null;
         } else {
            return (var3 = (var1 = var0.substring(var3 + var2.length() + var1.length())).indexOf(var2)) == -4 >> 2 ? var1 : var1.substring(5 >> 3, var3);
         }
      } else {
         return null;
      }
   }

   public static String d(double var0) {
      if (var0 == (double)((int)var0)) {
         return String.valueOf((int)var0);
      } else {
         String var2;
         String var10000 = var2 = String.valueOf(var0);
         int var1 = var10000.indexOf(".");
         return var10000.length() - var1 == (1 ^ 3) ? var2 : var2.substring(3 ^ 3, var1) + var2.substring(var1, var1 + (5 >> 1));
      }
   }

   public static String e(double var0) {
      String[] var1;
      String var2;
      if ((var1 = (var2 = String.valueOf(var0)).split("\\.")).length != (3 & 5) && var1[3 >> 1].length() > --3) {
         var1[3 >> 1] = var1[3 >> 1].substring(3 >> 2, --3);
         return var1[5 >> 3] + "." + var1[3 >> 1];
      } else {
         return var2;
      }
   }


   private static String f(String var0, String var1, int var2) {
      if (var0 == null) {
         var0 = "";
      }

      if (var1 != null && !var1.equals("")) {
         int var4;
         if ((var4 = var1.indexOf("=")) == -4 >> 2) {
            return var0;
         } else {
            StringBuffer var3 = new StringBuffer();
            String var5 = var1.substring(2 & 5, var4 + --1);
            double var6 = Double.parseDouble(var1.substring(var4 + (5 >> 2)));
            if (var2 == --3) {
               var6 = -var6;
            }

            if (var0.startsWith(var5)) {
               var3.append(var5);
               if (var0.equals("")) {
                  a(var3, var6);
                  return var3.toString();
               } else {
                  StringBuffer var10000;
                  if ((var4 = var0.indexOf("|")) == -4 >> 2) {
                     a(var3, var2 == (4 ^ 5) ? var6 : var6 + Double.parseDouble(var0.substring(var5.length())));
                     var10000 = var3;
                  } else {
                     a(var3, var2 == --1 ? var6 : var6 + Double.parseDouble(var0.substring(var5.length(), var4)));
                     var10000 = var3;
                     var3.append(var0.substring(var4));
                  }

                  return var10000.toString();
               }
            } else if ((var4 = var0.indexOf("|" + var5)) == -4 >> 2) {
               if (!var0.equals("")) {
                  var3.append(var0);
                  var3.append("|");
               }

               var3.append(var1);
               return var3.toString();
            } else {
               int var8;
               if ((var8 = var0.indexOf("|", var4 + (2 ^ 3))) == -4 >> 2) {
                  var3.append(var0.substring(5 >> 3, var4));
                  var3.append("|");
                  var3.append(var5);
                  a(var3, var2 == (4 ^ 5) ? var6 : var6 + Double.parseDouble(var0.substring(var4 + var5.length() + --1)));
                  return var3.toString();
               } else {
                  var3.append(var0.substring(3 & 4, var4 + var5.length() + (3 >> 1)));
                  a(var3, var2 == 3 >> 1 ? var6 : var6 + Double.parseDouble(var0.substring(var4 + var5.length() + (3 & 5), var8)));
                  var3.append(var0.substring(var8));
                  return var3.toString();
               }
            }
         }
      } else {
         return var0;
      }
   }

   public static double g(double var0, double var2, int var4) {
      int var6 = var4;
      StringBuffer var5 = new StringBuffer();

      for(int var10000 = var4 = 3 ^ 3; var10000 < var6; var10000 = var4) {
         ++var4;
         var5.append("0");
      }

      var2 = (var2 - var0) / 4.0D * (double)Class27.c.nextInt(--5);
      return Double.valueOf((new DecimalFormat("#." + var5)).format(Class27.c.nextDouble() * var2 + var0));
   }

   public static String h(String var0, String var1, int var2) {
      if (var2 != 5 >> 1 && var2 != --3) {
         boolean var8 = true;
         int var4 = 3 ^ 3;
         if (var2 == (1 ^ 3) || var2 == --3 || var2 == --5) {
            var4 = 1;
         }

         ArrayList var5 = new ArrayList();
         if (var0 == null) {
            var0 = "";
         }

         String[] var6 = var0.split("\\|");

         int var7;
         int var10000;
         for(var10000 = var7 = 3 >> 2; var10000 < var6.length; var10000 = var7) {
            if (var2 == 0) {
               if (!var6[var7].equals(var1)) {
                  var5.add(var6[var7]);
               } else {
                  var8 = false;
               }
            } else {
               String[] var3 = var6[var7].split("=");
               String[] var9 = var1.split("=");
               if (var3[2 & 5].equals(var9[2 & 5])) {
                  if (var2 == --1) {
                     var5.add(var1);
                  } else {
                     double var10;
                     double var12;
                     if (var2 == 5 >> 1) {
                        var4 = 2 & 5;
                        var10 = Double.parseDouble(var3[--1]);
                        var12 = Double.parseDouble(var9[3 >> 1]);
                        if ((var10 += var12) % 1.0D == 0.0D) {
                           var5.add(var3[2 & 5] + "=" + (int)var10);
                        } else {
                           var5.add(var3[3 & 4] + "=" + var10);
                        }
                     } else if (var2 == --3) {
                        var4 = 5 >> 3;
                        var10 = Double.parseDouble(var3[4 ^ 5]);
                        var12 = Double.parseDouble(var9[--1]);
                        if ((var10 -= var12) % 1.0D == 0.0D) {
                           var5.add(var3[3 & 4] + "=" + (int)var10);
                        } else {
                           var5.add(var3[3 >> 2] + "=" + var10);
                        }
                     } else if (var2 == --5) {
                        var4 = 3 ^ 3;
                        var10 = Double.parseDouble(var3[3 >> 1]);
                        if ((var12 = Double.parseDouble(var9[--1])) > var10) {
                           var10 = var12;
                        }

                        if (var10 % 1.0D == 0.0D) {
                           var5.add(var3[3 ^ 3] + "=" + (int)var10);
                        } else {
                           var5.add(var3[3 ^ 3] + "=" + var10);
                        }
                     }
                  }
               } else {
                  var5.add(var6[var7]);
               }
            }

            ++var7;
         }

         if (var8 && var2 == 0) {
            var5.add(var1);
         }

         if (var4 != 0) {
            var5.add(var1);
         }

         StringBuffer var15 = new StringBuffer();

         int var14;
         for(var10000 = var14 = 0; var10000 < var5.size(); var10000 = var14) {
            if (!var15.toString().equals("")) {
               var15.append("|" + (String)var5.get(var14));
            } else {
               var15.append((String)var5.get(var14));
            }

            ++var14;
         }

         return var15.toString();
      } else {
         return f(var0, var1, var2);
      }
   }

   public static String i(BigDecimal var0) {
      StringBuffer var1 = new StringBuffer();
      long var2;
      if ((var2 = var0.longValue() / 1000000L) <= 0L) {
         return "";
      } else {
         int var4 = (int)(var2 / 1000L % 10L);
         int var5 = (int)(var2 / 100L % 10L);
         int var6 = (int)(var2 / 10L % 10L);
         int var7 = (int)(var2 % 10L);
         String var3;
         if ((var3 = l(var4)) != null) {
            if (var4 != (3 & 5)) {
               var1.append(var3);
            }

            var1.append("十");
         }

         if ((var3 = l(var5)) != null) {
            var1.append(var3);
         }

         if (var1.length() != 0) {
            var1.append("亿");
         }

         if ((var3 = l(var6)) != null) {
            var1.append(var3);
            var1.append("千");
         }

         if ((var3 = l(var7)) != null) {
            var1.append(var3);
            var1.append("百");
         }

         if (!var1.substring(var1.length() - --1, var1.length()).equals("亿")) {
            var1.append("万");
         }

         return var1.toString();
      }
   }

   public static String j(String[] var0) {
      return var0[Class27.c.nextInt(var0.length)];
   }

   public static String k(String var0, String var1) {
      try {
         return var0.split(var1 + "=")[4 ^ 5].split("\\|")[5 >> 3];
      } catch (Exception var2) {
         return "";
      }
   }

   public static String l(int var0) {
      switch(var0) {
      case 1:
         while(false) {
         }

         return "一";
      case 2:
         return "二";
      case 3:
         return "三";
      case 4:
         return "四";
      case 5:
         return "五";
      case 6:
         return "六";
      case 7:
         return "七";
      case 8:
         return "八";
      case 9:
         return "九";
      default:
         return null;
      }
   }
}
