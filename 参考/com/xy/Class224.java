package com.xy;

import java.math.BigDecimal;

public class Class224 {
   public static long[] a(String var0) {
      long[] var10000 = new long[--5];
      boolean var10002 = true;
      long[] var1 = var10000;
      String[] var2 = var0.split("\\|");

      int var3;
      for(int var4 = var3 = 5 >> 3; var4 < var2.length; var4 = var3) {
         if (var2[var3].split("=").length >= 5 >> 1) {
            if (var2[var3].split("=")[3 & 4].equals("钱")) {
               var1[3 >> 2] = Long.parseLong(var2[var3].split("=")[3 & 5]);
            } else if (var2[var3].split("=")[3 >> 2].equals("点")) {
               var1[2 ^ 3] = Long.parseLong(var2[var3].split("=")[2 ^ 3]);
            } else if (var2[var3].split("=")[5 >> 3].equals("经验")) {
               var1[5 >> 1] = Long.parseLong(var2[var3].split("=")[5 >> 2]);
            } else if (var2[var3].split("=")[3 >> 2].equals("亲密")) {
               var1[--3] = Long.parseLong(var2[var3].split("=")[--1]);
            } else if (var2[var3].split("=")[3 ^ 3].equals("技能")) {
               var1[--4] = Long.parseLong(var2[var3].split("=")[--1]);
            }
         }

         ++var3;
      }

      return var1;
   }

   public static int b(int var0, int var1) {
      if (var1 == (1 ^ 3)) {
         var1 = var0 < (14078 & 18839) ? 94 & 39 : var0 - (22006 & 10905);
         return var1 += var1 / --3;
      } else {
         return var0 < (14519 & 18398) ? 111 & 22 : var0 - (1182 & 31729);
      }
   }

   public static BigDecimal c(double var0, double var2) {
      BigDecimal var1 = new BigDecimal(Double.toString(var0));
      BigDecimal var4 = new BigDecimal(Double.toString(var2));
      return var1.subtract(var4);
   }

   public static void main(String[] var0) {
      System.out.println("\n###########################################\n#                                         #\n#      ## #   #    ## ### ### ##  ###     #\n#     # # #   #   # #  #  # # # #  #      #\n#     ### #   #   ###  #  # # ##   #      #\n#     # # ### ### # #  #  ### # # ###     #\n#                                         #\n# Protecting Java applications since 2006 #\n#                                         #\n#      Allatori Obfuscator v9.4 DEMO      #\n#                                         #\n#              DEMO VERSION!              #\n#                                         #\n#         NOT FOR COMMERCIAL USE!         #\n#                                         #\n#          https://allatori.com           #\n#                                         #\n###########################################\n");
      System.out.println(o("飞升120级"));
   }

   public static int d(int var0) {
      if (var0 <= (118 & 111)) {
         return var0;
      } else if (var0 <= (30718 & 2259)) {
         return var0 - (127 & 102) + (62 & 79);
      } else if (var0 <= (31606 & 1499)) {
         return var0 - (17907 & 15070) + (15 & 126);
      } else {
         return var0 <= (6607 & 26619) ? var0 - (14686 & 18419) + (127 & 59) : var0 - (4559 & 28667) + (24043 & 8863);
      }
   }

   public static boolean e(long var0) {
      return var0 == 1L || var0 == 3L || var0 == 5L;
   }

   public static double f(String var0, String var1) {
      String[] var4 = var0.split("\\|");

      int var3;
      for(int var10000 = var3 = 3 ^ 3; var10000 < var4.length; var10000 = var3) {
         String[] var2;
         if ((var2 = var4[var3].split("=")).length > 5 >> 2 && var1.equals(var2[3 ^ 3])) {
            if (!var1.equals("活跃") && !var1.equals("速度") && !var1.equals("负敏")) {
               return Double.parseDouble(var2[3 & 5]) / 100.0D;
            }

            return Double.parseDouble(var2[2 ^ 3]);
         }

         ++var3;
      }

      return 0.0D;
   }

   public static int g(int var0) {
      if (var0 <= (102 & 127)) {
         return 3 ^ 3;
      } else if (var0 <= (763 & 32214)) {
         return 4 ^ 5;
      } else if (var0 <= (20338 & 12767)) {
         return 1 ^ 3;
      } else {
         return var0 <= (9675 & 23551) ? --3 : 4;
      }
   }

   public static boolean h(int var0, String var1) {
      return (boolean)(var0 <= o(var1) ? 4 ^ 5 : 0);
   }

   public static int i(int var0) {
      int var1 = 22456 & 15311;
      if (var0 <= (118 & 111)) {
         var1 += 5000;
         return var1;
      } else if (var0 <= (29175 & 3802)) {
         var1 += 10000;
         return var1;
      } else if (var0 <= (24022 & 9083)) {
         var1 += 15000;
         return var1;
      } else {
         var1 += 20000;
         return var1;
      }
   }

   public static boolean j(int var0, String var1) {
      return (boolean)(var0 >= o(var1) ? --1 : 0);
   }

   public static String k(BigDecimal var0) {
      int var1;
      if ((var1 = var0.intValue()) < (125 & 102)) {
         return "入门" + var1 + "点";
      } else if (var1 < (16107 & 16860)) {
         return "进阶" + (var1 - (100 & 127)) + "点";
      } else if (var1 < (9596 & 23471)) {
         return "精锐" + (var1 - (27625 & 5342)) + "点";
      } else if (var1 < (12757 & 20410)) {
         return "英杰" + (var1 - (27645 & 5422)) + "点";
      } else if (var1 < (23542 & 9725)) {
         return "豪侠" + (var1 - (9694 & 23473)) + "点";
      } else if (var1 < (20219 & 13148)) {
         return "宗师" + (var1 - (17405 & 15862)) + "点";
      } else {
         return var1 < (27390 & 6077) ? "武圣" + (var1 - (19166 & 14201)) + "点" : "王者" + (var1 - (1980 & 31487)) + "点";
      }
   }

   public static BigDecimal l(double var0, double var2) {
      BigDecimal var1 = new BigDecimal(Double.toString(var0));
      BigDecimal var4 = new BigDecimal(Double.toString(var2));
      return var1.multiply(var4);
   }

   public static int m(int var0, int var1) {
      return b(var0, var1) * --5;
   }

   public static int n(int var0) {
      if (var0 <= (102 & 125)) {
         return 5 >> 3;
      } else if (var0 <= (22237 & 10751)) {
         return --1;
      } else if (var0 <= (18943 & 14186)) {
         return 5 >> 1;
      } else {
         return var0 <= (24479 & 8831) ? --3 : 4;
      }
   }

   public static int o(String var0) {
      if (var0.endsWith("级")) {
         var0 = var0.substring(2 & 5, var0.length() - (5 >> 2));
      }

      if (var0.indexOf("飞升") != -4 >> 2) {
         return Integer.parseInt(var0.substring(5 >> 1)) + (19407 & 13819) - (13499 & 19407);
      } else if (var0.indexOf("转") != -4 >> 2) {
         if (!var0.startsWith("0转") && !var0.startsWith("未转")) {
            if (var0.startsWith("1转")) {
               return Integer.parseInt(var0.substring(--2)) + (110 & 119) - (30 & 111);
            } else if (var0.startsWith("2转")) {
               return Integer.parseInt(var0.substring(1 ^ 3)) + (10998 & 21979) - (14 & 127);
            } else {
               return var0.startsWith("3转") ? Integer.parseInt(var0.substring(--2)) + (3026 & 30079) - (59 & 127) : 0;
            }
         } else {
            return Integer.parseInt(var0.substring(--2));
         }
      } else {
         return Integer.parseInt(var0);
      }
   }

   public static int p(int var0) {
      if (var0 <= (111 & 116)) {
         return var0;
      } else if (var0 <= (14303 & 18685)) {
         return var0 - (119 & 109);
      } else if (var0 <= (24954 & 8175)) {
         return var0 - (26623 & 6366);
      } else {
         return var0 <= (13183 & 20127) ? var0 - (23403 & 9727) : var0 - (8998 & 24313);
      }
   }

   public static BigDecimal q(double var0, double var2) {
      BigDecimal var1 = new BigDecimal(Double.toString(var0));
      BigDecimal var4 = new BigDecimal(Double.toString(var2));
      return var1.add(var4);
   }

   public static String r(int var0) {
      if (var0 <= (127 & 102)) {
         return "0转" + var0;
      } else if (var0 <= (15326 & 17651)) {
         return "1转" + (var0 - (119 & 110) + (30 & 111));
      } else if (var0 <= (22395 & 10710)) {
         return "2转" + (var0 - (24019 & 8958) + (62 & 79));
      } else {
         return var0 <= (1503 & 31723) ? "3转" + (var0 - (18803 & 14302) + (59 & 127)) : "飞升" + (var0 - (479 & 32747) + (28907 & 3999));
      }
   }

   public static int[] s(String var0) {
      int[] var10000 = new int[--4];
      boolean var10002 = true;
      int[] var1 = var10000;
      String[] var2 = var0.split("\\|");

      int var3;
      for(int var4 = var3 = 3 ^ 3; var4 < var2.length; var4 = var3) {
         if (var2[var3].split("=").length >= --2) {
            if (var2[var3].split("=")[3 & 4].equals("HP")) {
               var1[2 & 5] = Integer.parseInt(var2[var3].split("=")[2 ^ 3]);
            } else if (var2[var3].split("=")[3 & 4].equals("MP")) {
               var1[3 >> 1] = Integer.parseInt(var2[var3].split("=")[3 >> 1]);
            } else if (var2[var3].split("=")[3 ^ 3].equals("HP%")) {
               var1[1 ^ 3] = Integer.parseInt(var2[var3].split("=")[3 >> 1]);
            } else if (var2[var3].split("=")[3 & 4].equals("MP%")) {
               var1[--3] = Integer.parseInt(var2[var3].split("=")[3 >> 1]);
            }
         }

         ++var3;
      }

      return var1;
   }

   public static String t(int var0) {
      if (var0 <= (119 & 108)) {
         return "0转" + var0;
      } else if (var0 <= (20191 & 12797)) {
         return "1转" + (var0 - (103 & 125));
      } else if (var0 <= (17770 & 15359)) {
         return "2转" + (var0 - (16894 & 16095));
      } else {
         return var0 <= (29599 & 3711) ? "3转" + (var0 - (18815 & 14315)) : "点化" + (var0 - (24248 & 9063));
      }
   }
}
