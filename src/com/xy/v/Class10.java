package com.xy.v;

import java.util.ArrayList;
import java.util.List;

public class Class10 {
   public static String a(String var0, String var1, String var2) {
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

   public static boolean b(int var0, String var1) {
      if (var1 != null && !var1.equals("")) {
         String var10001 = "5U";
         String[] var2 = var1.split("\\|");

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
            String var7 = var2[var3];
            var10001 = "\b";
            if (var7.indexOf("-") != -1) {
               String var8 = var2[var3];
               var10001 = "\u0004";
               String[] var9 = var8.split("-");
               Integer var5 = Integer.parseInt(var9[0]);
               Integer var6 = Integer.parseInt(var9[1]);
               if (var0 >= var5 && var0 <= var6) {
                  return true;
               }
            } else {
               String var10 = var2[var3];
               var10001 = "\u0003";
               if (var10.indexOf("&") != -1) {
                  String var11 = var2[var3];
                  var10001 = "\u000f";
                  String[] var4 = var11.split("&");
                  if (var0 == Integer.parseInt(var4[0])) {
                     return true;
                  }
               } else if (var0 == Integer.parseInt(var2[var3])) {
                  return true;
               }
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static List<String> c(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String var10001 = "BY";
         String[] var2 = var0.split("\\|");

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
            String var10 = var2[var3];
            var10001 = "\u0004";
            if (var10.indexOf("-") != -1) {
               String var14 = var2[var3];
               var10001 = "\b";
               String[] var15 = var14.split("-");
               Integer var8 = Integer.parseInt(var15[0]);
               Integer var9 = Integer.parseInt(var15[1]);

               int var7;
               for (int var16 = var7 = var8; var16 <= var9; var16 = var7) {
                  var1.add(String.valueOf(var7++));
               }
            } else {
               String var11 = var2[var3];
               var10001 = "\u000f";
               if (var11.indexOf("&") != -1) {
                  String var12 = var2[var3];
                  var10001 = "\u0003";
                  String[] var4;
                  int var5 = Integer.parseInt((var4 = var12.split("&"))[1]);

                  int var6;
                  for (int var13 = var6 = 0; var13 < var5; var13 = var6) {
                     var6++;
                     var1.add(var4[0]);
                  }
               } else {
                  var1.add(var2[var3]);
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static String d(String var0, String var1, long var2) {
      if (var0 != null && !var0.equals("")) {
         StringBuilder var14 = new StringBuilder(String.valueOf(var1));
         String var10002 = "\u0014";
         if (var0.startsWith(var14.append("=").toString())) {
            String var21 = "Y";
            int var7;
            if ((var7 = var0.indexOf("|")) == -1) {
               StringBuilder var13 = new StringBuilder(String.valueOf(var1));
               String var23 = "\u0014";
               return var13.append("=").append(var2).toString();
            } else {
               StringBuilder var12 = new StringBuilder(String.valueOf(var1));
               String var22 = "\u0018";
               return var12.append("=").append(var2).append(var0.substring(var7)).toString();
            }
         } else {
            String var10003 = "U";
            var14 = new StringBuilder("|").append(var1);
            var10002 = "\u0018";
            int var4;
            if ((var4 = var0.indexOf(var14.append("=").toString())) == -1) {
               StringBuilder var10 = new StringBuilder(String.valueOf(var0));
               String var19 = "U";
               var10 = var10.append("|").append(var1);
               String var20 = "\u0018";
               return var10.append("=").append(var2).toString();
            } else {
               String var16 = "U";
               int var5;
               if ((var5 = var0.indexOf("|", var4 + 1)) == -1) {
                  StringBuilder var8 = new StringBuilder(String.valueOf(var0.substring(0, var4)));
                  String var17 = "Y";
                  var8 = var8.append("|").append(var1);
                  String var18 = "\u0014";
                  return var8.append("=").append(var2).toString();
               } else {
                  StringBuffer var6;
                  (var6 = new StringBuffer()).append(var0.substring(0, var4 + var1.length() + 2));
                  var6.append(var2);
                  var6.append(var0.substring(var5));
                  return var6.toString();
               }
            }
         }
      } else {
         StringBuilder var10000 = new StringBuilder(String.valueOf(var1));
         String var10001 = "\u0018";
         return var10000.append("=").append(var2).toString();
      }
   }

   public static String e(String var0, String var1, String var2, String var3) {
      if (var0 != null && !var0.equals("")) {
         StringBuffer var4 = new StringBuffer();
         if (var0.startsWith(var1)) {
            int var8 = var0.indexOf(var2);
            var4.append(var0.substring(0, var1.length() - var1.length()));
            var4.append(var3);
            if (var8 != -1) {
               var4.append(var0.substring(var8));
            }

            return var4.toString();
         } else {
            int var5;
            if ((var5 = var0.indexOf(var2 + var1)) == -1) {
               var4.append(var0);
               var4.append(var2);
               var4.append(var3);
               return var4.toString();
            } else {
               var4.append(var0.substring(0, var5 + var2.length()));
               String var6;
               var5 = (var6 = var0.substring(var5 + var2.length() + var1.length())).indexOf(var2);
               if (var5 == -1) {
                  var4.append(var3);
                  return var4.toString();
               } else {
                  var4.append(var3);
                  var4.append(var6.substring(var5));
                  return var4.toString();
               }
            }
         }
      } else {
         return var3;
      }
   }

   public static String f(String var0, int var1) {
      if (var0 != null && !var0.equals("")) {
         String var10001 = "\u0007";
         int var2;
         if ((var2 = var0.indexOf(".")) == -1) {
            return var0;
         } else {
            if ((var2 = var2 + var1 + 1) > var0.length()) {
               var2 = var0.length();
            }

            return var0.substring(0, var2);
         }
      } else {
         return var0;
      }
   }

   public static String g(String var0) {
      int var10000 = 1 << 3 ^ 4;
      int var10001 = 3 << 3 ^ 5;
      int var10002 = 2 ^ 5;
      String var5;
      int var10003 = (var5 = var0).length();
      char[] var10005 = new char[var10003];
      int var3;
      int var9 = var3 = var10003 - 1;
      char[] var1 = var10005;
      int var4 = var10002;
      var10000 = var9;

      for (int var2 = var10001; var10000 >= 0; var10000 = var3) {
         var10001 = var3;
         int var10 = var5.charAt(var3);
         var3--;
         var1[var10001] = (char)(var10 ^ var2);
         if (var3 < 0) {
            break;
         }

         var10 = var3--;
         var1[var10] = (char)(var5.charAt(var10) ^ var4);
      }

      return new String(var1);
   }

   public static long h(String var0, String var1, String var2) {
      String var3;
      return (var3 = a(var0, var1, var2)) != null && !var3.equals("") ? Long.parseLong(var3) : 0L;
   }

   public static List<Long> i(String var0) {
      ArrayList var1 = new ArrayList();
      if (var0 != null && !var0.equals("")) {
         String var10001 = "BY";
         String[] var2 = var0.split("\\|");

         int var3;
         for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
            String var11 = var2[var3];
            var10001 = "\u0004";
            if (var11.indexOf("-") != -1) {
               String var16 = var2[var3];
               var10001 = "\b";
               String[] var17 = var16.split("-");
               Integer var9 = Integer.parseInt(var17[0]);
               Integer var6 = Integer.parseInt(var17[1]);

               long var10;
               for (long var18 = var10 = var9.intValue(); var18 <= var6.intValue(); var18 = ++var10) {
                  var1.add(var10);
               }
            } else {
               String var12 = var2[var3];
               var10001 = "\u000f";
               if (var12.indexOf("&") != -1) {
                  String var13 = var2[var3];
                  var10001 = "\u0003";
                  String[] var14 = var13.split("&");
                  long var5 = Long.parseLong(var14[0]);
                  int var7 = Integer.parseInt(var14[1]);

                  int var8;
                  for (int var15 = var8 = 0; var15 < var7; var15 = var8) {
                     var8++;
                     var1.add(var5);
                  }
               } else {
                  var1.add(Long.parseLong(var2[var3]));
               }
            }
         }

         return var1;
      } else {
         return var1;
      }
   }

   public static int j(char var0, String var1) {
      int var2 = 0;
      int var4 = 0;

      for (String var10000 = var1; (var4 = var10000.indexOf(var0, var4)) != -1; var2++) {
         var4++;
         var10000 = var1;
      }

      return var2;
   }
}
