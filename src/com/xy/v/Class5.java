package com.xy.v;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Class5 {
   public static String a(String var0, String var1, int var2) {
      if (var2 != 2 && var2 != 3) {
         boolean var3 = true;
         boolean var4 = false;
         if (var2 == 2 || var2 == 3 || var2 == 5) {
            var4 = true;
         }

         ArrayList var5 = new ArrayList();
         if (var0 == null) {
            var0 = "";
         }

         String var10001 = "\u0013k";
         String[] var6 = var0.split("\\|");

         int var7;
         for (int var10000 = var7 = 0; var10000 < var6.length; var10000 = ++var7) {
            if (var2 == 0) {
               if (!var6[var7].equals(var1)) {
                  var5.add(var6[var7]);
               } else {
                  var3 = false;
               }
            } else {
               String var22 = var6[var7];
               var10001 = "+";
               String[] var8 = var22.split("=");
               var10001 = "*";
               String[] var9 = var1.split("=");
               if (var8[0].equals(var9[0])) {
                  if (var2 == 1) {
                     var5.add(var1);
                  } else if (var2 == 2) {
                     var4 = false;
                     double var10 = Double.parseDouble(var8[1]);
                     double var12 = Double.parseDouble(var9[1]);
                     if ((var10 = var10 + var12) % 1.0 == 0.0) {
                        StringBuilder var26 = new StringBuilder(String.valueOf(var8[0]));
                        String var10002 = "+";
                        var5.add(var26.append("=").append((int)var10).toString());
                     } else {
                        StringBuilder var27 = new StringBuilder(String.valueOf(var8[0]));
                        String var32 = "*";
                        var5.add(var27.append("=").append(var10).toString());
                     }
                  } else if (var2 == 3) {
                     var4 = false;
                     double var17 = Double.parseDouble(var8[1]);
                     double var20 = Double.parseDouble(var9[1]);
                     if ((var17 = var17 - var20) % 1.0 == 0.0) {
                        StringBuilder var28 = new StringBuilder(String.valueOf(var8[0]));
                        String var33 = "+";
                        var5.add(var28.append("=").append((int)var17).toString());
                     } else {
                        StringBuilder var29 = new StringBuilder(String.valueOf(var8[0]));
                        String var34 = "*";
                        var5.add(var29.append("=").append(var17).toString());
                     }
                  } else if (var2 == 5) {
                     var4 = false;
                     double var19 = Double.parseDouble(var8[1]);
                     double var21;
                     if ((var21 = Double.parseDouble(var9[1])) > var19) {
                        var19 = var21;
                     }

                     if (var19 % 1.0 == 0.0) {
                        StringBuilder var30 = new StringBuilder(String.valueOf(var8[0]));
                        String var35 = "+";
                        var5.add(var30.append("=").append((int)var19).toString());
                     } else {
                        StringBuilder var31 = new StringBuilder(String.valueOf(var8[0]));
                        String var36 = "*";
                        var5.add(var31.append("=").append(var19).toString());
                     }
                  }
               } else {
                  var5.add(var6[var7]);
               }
            }
         }

         if (var3 && var2 == 0) {
            var5.add(var1);
         }

         if (var4) {
            var5.add(var1);
         }

         StringBuffer var14 = new StringBuffer();

         int var15;
         for (int var23 = var15 = 0; var23 < var5.size(); var23 = ++var15) {
            if (!var14.toString().equals("")) {
               String var10003 = "j";
               var14.append("|" + var5.get(var15));
            } else {
               var14.append((String)var5.get(var15));
            }
         }

         return var14.toString();
      } else {
         return e(var0, var1, var2);
      }
   }

   public static String b(int var0) {
      switch (var0) {
         case 1:
            String var8 = "世";


            return "一";
         case 2:
            String var7 = "些";
            return "二";
         case 3:
            String var6 = "丟";
            return "三";
         case 4:
            String var5 = "囌";
            return "四";
         case 5:
            String var4 = "亂";
            return "五";
         case 6:
            String var3 = "兺";
            return "六";
         case 7:
            String var2 = "丕";
            return "七";
         case 8:
            String var1 = "兼";
            return "八";
         case 9:
            String var10000 = "之";
            return "九";
         default:
            return null;
      }
   }

   public static String c(BigDecimal var0) {
      StringBuffer var1 = new StringBuffer();
      long var2;
      if ((var2 = var0.longValue() / 1000000L) <= 0L) {
         return "";
      } else {
         int var4 = (int)(var2 / 1000L % 10L);
         int var5 = (int)(var2 / 100L % 10L);
         int var6 = (int)(var2 / 10L % 10L);
         int var7 = (int)(var2 % 10L);
         String var8;
         if ((var8 = b(var4)) != null) {
            if (var4 != 1) {
               var1.append(var8);
            }

            String var10001 = "南";
            var1.append("十");
         }

         if ((var8 = b(var5)) != null) {
            var1.append(var8);
         }

         if (var1.length() != 0) {
            String var12 = "亨";
            var1.append("亿");
         }

         if ((var8 = b(var6)) != null) {
            var1.append(var8);
            String var10002 = "单";
            var1.append("千");
         }

         if ((var8 = b(var7)) != null) {
            var1.append(var8);
            String var15 = "癩";
            var1.append("百");
         }

         String var10000 = var1.substring(var1.length() - 1, var1.length());
         String var13 = "亩";
         if (!var10000.equals("亿")) {
            var13 = "丐";
            var1.append("万");
         }

         return var1.toString();
      }
   }

   public static String d(double var0) {
      if (var0 == (int)var0) {
         return String.valueOf((int)var0);
      } else {
         String var2;
         String var10000 = var2 = String.valueOf(var0);
         String var10002 = "8";
         int var3 = var10000.indexOf(".");
         return var10000.length() - var3 == 2 ? var2 : var2.substring(0, var3) + var2.substring(var3, var3 + 2);
      }
   }

   // $VF: synthetic method
   private static String e(String var0, String var1, int var2) {
      if (var0 == null) {
         var0 = "";
      }

      if (var1 != null && !var1.equals("")) {
         String var10001 = "*";
         int var3;
         if ((var3 = var1.indexOf("=")) == -1) {
            return var0;
         } else {
            StringBuffer var4 = new StringBuffer();
            String var5 = var1.substring(0, var3 + 1);
            double var6 = Double.parseDouble(var1.substring(var3 + 1));
            if (var2 == 3) {
               var6 = -var6;
            }

            if (var0.startsWith(var5)) {
               var4.append(var5);
               if (var0.equals("")) {
                  k(var4, var6);
                  return var4.toString();
               } else {
                  var10001 = "j";
                  StringBuffer var10000;
                  if ((var3 = var0.indexOf("|")) == -1) {
                     k(var4, var2 == 1 ? var6 : var6 + Double.parseDouble(var0.substring(var5.length())));
                     var10000 = var4;
                  } else {
                     k(var4, var2 == 1 ? var6 : var6 + Double.parseDouble(var0.substring(var5.length(), var3)));
                     var10000 = var4;
                     var4.append(var0.substring(var3));
                  }

                  return var10000.toString();
               }
            } else {
               String var10003 = "k";
               if ((var3 = var0.indexOf("|" + var5)) == -1) {
                  if (!var0.equals("")) {
                     var4.append(var0);
                     String var10002 = "j";
                     var4.append("|");
                  }

                  var4.append(var1);
                  return var4.toString();
               } else {
                  var10001 = "k";
                  int var8;
                  if ((var8 = var0.indexOf("|", var3 + 1)) == -1) {
                     var4.append(var0.substring(0, var3));
                     String var10004 = "j";
                     var4.append("|");
                     var4.append(var5);
                     k(var4, var2 == 1 ? var6 : var6 + Double.parseDouble(var0.substring(var3 + var5.length() + 1)));
                     return var4.toString();
                  } else {
                     var4.append(var0.substring(0, var3 + var5.length() + 1));
                     k(var4, var2 == 1 ? var6 : var6 + Double.parseDouble(var0.substring(var3 + var5.length() + 1, var8)));
                     var4.append(var0.substring(var8));
                     return var4.toString();
                  }
               }
            }
         }
      } else {
         return var0;
      }
   }

   public static String f(String[] var0) {
      return var0[Class0.a.nextInt(var0.length)];
   }

   public static String g(double var0) {
      String var2;
      String var10000 = var2 = String.valueOf(var0);
      String var10001 = "\u00139";
      String[] var3;
      if ((var3 = var10000.split("\\.")).length != 1 && var3[1].length() > 3) {
         var3[1] = var3[1].substring(0, 3);
         StringBuilder var4 = new StringBuilder(String.valueOf(var3[0]));
         var10001 = "8";
         return var4.append(".").append(var3[1]).toString();
      } else {
         return var2;
      }
   }

   public static double h(double var0, double var2, int var4) {
      StringBuffer var5 = new StringBuffer();

      int var6;
      for (int var10000 = var6 = 0; var10000 < var4; var10000 = var6) {
         var6++;
         var5.append("0");
      }

      double var7;
      var2 = (var7 = var2 - var0) / 4.0 * Class0.a.nextInt(5);
      String var10004 = "l9";
      return Double.valueOf(new DecimalFormat("#." + var5).format(Class0.a.nextDouble() * var2 + var0));
   }

   public static String i(String var0, String var1, String var2) {
      if (var0 == null || var0.equals("")) {
         return null;
      } else if (var0.startsWith(var1)) {
         int var6 = var0.indexOf(var2);
         return var0.substring(var1.length(), var6 != -1 ? var6 : var0.length());
      } else {
         int var3;
         if ((var3 = var0.indexOf(var2 + var1)) == -1) {
            return null;
         } else {
            String var4;
            int var5;
            return (var5 = (var4 = var0.substring(var3 + var2.length() + var1.length())).indexOf(var2)) == -1 ? var4 : var4.substring(0, var5);
         }
      }
   }

   public static long j(String var0, String var1, String var2) {
      String var3;
      return (var3 = i(var0, var1, var2)) != null && !var3.equals("") ? Long.parseLong(var3) : 0L;
   }

   public static void k(StringBuffer var0, double var1) {
      if (var1 == (int)var1) {
         var0.append((int)var1);
      } else {
         var0.append(var1);
      }
   }

   public static String l(String var0, String var1) {
      try {
         StringBuilder var10001 = new StringBuilder(String.valueOf(var1));
         String var10002 = "*";
         String var10000 = var0.split(var10001.append("=").toString())[1];
         String var4 = "pj";
         return var10000.split("\\|")[0];
      } catch (Exception var3) {
         return "";
      }
   }
}
