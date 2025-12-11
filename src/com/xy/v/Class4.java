package com.xy.v;

import java.math.BigDecimal;

public class Class4 {
   public static int a(String var0) {
      String var10001 = "纤";
      if (var0.endsWith("级")) {
         var0 = var0.substring(0, var0.length() - 1);
      }

      var10001 = "颩匼";
      if (var0.indexOf("飞升") != -1) {
         return Integer.parseInt(var0.substring(2)) + 459 - 139;
      } else {
         var10001 = "软";
         if (var0.indexOf("转") != -1) {
            var10001 = "G輗";
            if (!var0.startsWith("0转")) {
               var10001 = "杏软";
               if (!var0.startsWith("未转")) {
                  var10001 = "F輗";
                  if (var0.startsWith("1转")) {
                     return Integer.parseInt(var0.substring(2)) + 102 - 14;
                  }

                  var10001 = "W软";
                  if (var0.startsWith("2转")) {
                     return Integer.parseInt(var0.substring(2)) + 210 - 14;
                  }

                  var10001 = "D輗";
                  if (var0.startsWith("3转")) {
                     return Integer.parseInt(var0.substring(2)) + 338 - 59;
                  }

                  return 0;
               }
            }

            return Integer.parseInt(var0.substring(2));
         } else {
            return Integer.parseInt(var0);
         }
      }
   }

   public static boolean b(int var0, String var1) {
      return var0 >= a(var1);
   }

   public static void main(String[] var0) {
      String var10001 = "\tF F F F F F F F F F F F F F F F F F F F F F F F o E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#F\tF#E#E#E#E F#F#E#F#E#E F#F F#F F#F E#F F#E#E#E#E o E#E#E#E E E E#E E#E E E#F#E E E E E#F#E#E#E#E#F\tF#E#E#E#F F#F#E#F#E#F F#E E#F#F#F E#E E#E#E#E#E o E#E#E#E E E F E F E E E#F#E F E E E F E#E#E#E#F\tF#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E o EL\u0007e\u0010p\u0006b\u0011j\nmEa\u001c#$o\tb\u0011l\u0017jEL\u0007e\u0010p\u0006b\u0011l\u0017#\u00134K4EG N*#F\tF#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E o E#E#E#E#E#Ek\u0011w\u00159J,\u0012t\u0012-\u0004o\tb\u0011l\u0017jK`\nnE#E#E#E#E#E#F\tF#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E#E o F F F F F F F F F F F F F F F F F F F F F F F F\t";
      System.out
         .println(
            "\n################################################\n#                                              #\n#        ## #   #    ## ### ### ##  ###        #\n#       # # #   #   # #  #  # # # #  #         #\n#       ### #   #   ###  #  # # ##   #         #\n#       # # ### ### # #  #  ### # # ###        #\n#                                              #\n# Obfuscation by Allatori Obfuscator v7.7 DEMO #\n#                                              #\n#           http://www.allatori.com            #\n#                                              #\n################################################\n"
         );
      var10001 = "颩匼FIG络";
      System.out.println(a("飞升120级"));
   }

   public static int c(int var0) {
      if (var0 <= 100) {
         return 0;
      } else if (var0 <= 221) {
         return 1;
      } else if (var0 <= 362) {
         return 2;
      } else {
         return var0 <= 543 ? 3 : 4;
      }
   }

   public static double d(String var0, String var1) {
      String var10001 = "9\u007f";
      String[] var2 = var0.split("\\|");

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
         String var5 = var2[var3];
         var10001 = "F";
         String[] var4;
         if ((var4 = var5.split("=")).length > 1 && var1.equals(var4[0])) {
            var10001 = "浞跀";
            if (!var1.equals("活跃")) {
               var10001 = "遨廝";
               if (!var1.equals("速度")) {
                  var10001 = "赺敌";
                  if (!var1.equals("负敏")) {
                     return Double.parseDouble(var4[1]) / 100.0;
                  }
               }
            }

            return Double.parseDouble(var4[1]);
         }
      }

      return 0.0;
   }

   public static BigDecimal e(double var0, double var2) {
      BigDecimal var4 = new BigDecimal(Double.toString(var0));
      BigDecimal var5 = new BigDecimal(Double.toString(var2));
      return var4.multiply(var5);
   }

   public static int f(int var0) {
      if (var0 <= 100) {
         return var0;
      } else if (var0 <= 221) {
         return var0 - 101;
      } else if (var0 <= 362) {
         return var0 - 222;
      } else {
         return var0 <= 543 ? var0 - 363 : var0 - 544;
      }
   }

   public static int g(int var0) {
      short var1 = 5000;
      if (var0 <= 102) {
         return var1 + 5000;
      } else if (var0 <= 210) {
         return var1 + 10000;
      } else {
         return var0 <= 338 ? var1 + 15000 : var1 + 20000;
      }
   }

   public static String h(int var0) {
      if (var0 <= 102) {
         String var4 = "U软";
         return "0转" + var0;
      } else if (var0 <= 210) {
         String var3 = "F輗";
         return "1转" + (var0 - 102 + 14);
      } else if (var0 <= 338) {
         String var2 = "W软";
         return "2转" + (var0 - 210 + 14);
      } else if (var0 <= 459) {
         String var1 = "D輗";
         return "3转" + (var0 - 338 + 59);
      } else {
         String var10002 = "颻卄";
         return "飞升" + (var0 - 459 + 139);
      }
   }

   public static BigDecimal i(double var0, double var2) {
      BigDecimal var4 = new BigDecimal(Double.toString(var0));
      BigDecimal var5 = new BigDecimal(Double.toString(var2));
      return var4.subtract(var5);
   }

   public static int[] j(String var0) {
      int[] var1 = new int[4];
      String var10001 = "+\u0007";
      String[] var2 = var0.split("\\|");

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
         String var4 = var2[var3];
         var10001 = ">";
         if (var4.split("=").length >= 2) {
            String var5 = var2[var3];
            var10001 = "F";
            String var6 = var5.split("=")[0];
            var10001 = "-S";
            if (var6.equals("HP")) {
               String var10002 = var2[var3];
               String var10003 = "F";
               var1[0] = Integer.parseInt(var10002.split("=")[1]);
            } else {
               String var7 = var2[var3];
               var10001 = ">";
               String var8 = var7.split("=")[0];
               var10001 = ":+";
               if (var8.equals("MP")) {
                  var10001 = var2[var3];
                  String var23 = ">";
                  var1[1] = Integer.parseInt(var10001.split("=")[1]);
               } else {
                  String var9 = var2[var3];
                  var10001 = "F";
                  String var10 = var9.split("=")[0];
                  var10001 = "K5&";
                  if (var10.equals("HP%")) {
                     String var24 = var2[var3];
                     String var26 = "F";
                     var1[2] = Integer.parseInt(var24.split("=")[1]);
                  } else {
                     String var11 = var2[var3];
                     var10001 = ">";
                     String var12 = var11.split("=")[0];
                     var10001 = "6'^";
                     if (var12.equals("MP%")) {
                        String var25 = var2[var3];
                        String var27 = ">";
                        var1[3] = Integer.parseInt(var25.split("=")[1]);
                     }
                  }
               }
            }
         }
      }

      return var1;
   }

   public static String k(int var0) {
      if (var0 <= 100) {
         String var4 = "G輗";
         return "0转" + var0;
      } else if (var0 <= 221) {
         String var3 = "T软";
         return "1转" + (var0 - 101);
      } else if (var0 <= 362) {
         String var2 = "E輗";
         return "2转" + (var0 - 222);
      } else if (var0 <= 543) {
         String var1 = "V软";
         return "3转" + (var0 - 363);
      } else {
         String var10002 = "烎卭";
         return "点化" + (var0 - 544);
      }
   }

   public static int l(int var0) {
      return var0 < 150 ? 6 : var0 - 144;
   }

   public static int m(int var0) {
      return l(var0) * 5;
   }

   public static BigDecimal n(double var0, double var2) {
      BigDecimal var4 = new BigDecimal(Double.toString(var0));
      BigDecimal var5 = new BigDecimal(Double.toString(var2));
      return var4.add(var5);
   }

   public static long[] o(String var0) {
      long[] var1 = new long[5];
      String var10001 = "+\u0007";
      String[] var2 = var0.split("\\|");

      int var3;
      for (int var10000 = var3 = 0; var10000 < var2.length; var10000 = ++var3) {
         String var4 = var2[var3];
         var10001 = ">";
         if (var4.split("=").length >= 2) {
            String var5 = var2[var3];
            var10001 = "F";
            String var6 = var5.split("=")[0];
            var10001 = "钲";
            if (var6.equals("钱")) {
               String var10002 = var2[var3];
               String var10003 = "F";
               var1[0] = Long.parseLong(var10002.split("=")[1]);
            } else {
               String var7 = var2[var3];
               var10001 = ">";
               String var8 = var7.split("=")[0];
               var10001 = "烂";
               if (var8.equals("点")) {
                  var10001 = var2[var3];
                  String var27 = ">";
                  var1[1] = Long.parseLong(var10001.split("=")[1]);
               } else {
                  String var9 = var2[var3];
                  var10001 = "F";
                  String var10 = var9.split("=")[0];
                  var10001 = "纪骏";
                  if (var10.equals("经验")) {
                     String var28 = var2[var3];
                     String var31 = "F";
                     var1[2] = Long.parseLong(var28.split("=")[1]);
                  } else {
                     String var11 = var2[var3];
                     var10001 = ">";
                     String var12 = var11.split("=")[0];
                     var10001 = "仅宽";
                     if (var12.equals("亲密")) {
                        String var29 = var2[var3];
                        String var32 = ">";
                        var1[3] = Long.parseLong(var29.split("=")[1]);
                     } else {
                        String var13 = var2[var3];
                        var10001 = "F";
                        String var14 = var13.split("=")[0];
                        var10001 = "拥胾";
                        if (var14.equals("技能")) {
                           String var30 = var2[var3];
                           String var33 = "F";
                           var1[4] = Long.parseLong(var30.split("=")[1]);
                        }
                     }
                  }
               }
            }
         }
      }

      return var1;
   }

   public static boolean p(long var0) {
      return var0 == 1L || var0 == 3L || var0 == 5L;
   }

   public static int q(int var0) {
      if (var0 <= 102) {
         return 0;
      } else if (var0 <= 210) {
         return 1;
      } else if (var0 <= 338) {
         return 2;
      } else {
         return var0 <= 459 ? 3 : 4;
      }
   }

   public static boolean r(int var0, String var1) {
      return var0 <= a(var1);
   }

   public static int s(int var0) {
      if (var0 <= 102) {
         return var0;
      } else if (var0 <= 210) {
         return var0 - 102 + 14;
      } else if (var0 <= 338) {
         return var0 - 210 + 14;
      } else {
         return var0 <= 459 ? var0 - 338 + 59 : var0 - 459 + 139;
      }
   }

   public static String t(BigDecimal var0) {
      int var1;
      if ((var1 = var0.intValue()) < 100) {
         String var22 = "儒間";
         StringBuilder var8 = new StringBuilder("入门").append(var1);
         String var15 = "為";
         return var8.append("点").toString();
      } else if (var1 < 200) {
         String var21 = "辬降";
         StringBuilder var7 = new StringBuilder("进阶").append(var1 - 100);
         String var14 = "為";
         return var7.append("点").toString();
      } else if (var1 < 300) {
         String var20 = "糉镫";
         StringBuilder var6 = new StringBuilder("精锐").append(var1 - 200);
         String var13 = "為";
         return var6.append("点").toString();
      } else if (var1 < 400) {
         String var19 = "芆朋";
         StringBuilder var5 = new StringBuilder("英杰").append(var1 - 300);
         String var12 = "為";
         return var5.append("点").toString();
      } else if (var1 < 500) {
         String var18 = "谝俛";
         StringBuilder var4 = new StringBuilder("豪侠").append(var1 - 400);
         String var11 = "為";
         return var4.append("点").toString();
      } else if (var1 < 600) {
         String var17 = "寠平";
         StringBuilder var3 = new StringBuilder("宗师").append(var1 - 500);
         String var10 = "為";
         return var3.append("点").toString();
      } else if (var1 < 700) {
         String var16 = "欑坘";
         StringBuilder var2 = new StringBuilder("武圣").append(var1 - 600);
         String var9 = "為";
         return var2.append("点").toString();
      } else {
         String var10002 = "珼聾";
         StringBuilder var10000 = new StringBuilder("王者").append(var1 - 700);
         String var10001 = "為";
         return var10000.append("点").toString();
      }
   }
}
