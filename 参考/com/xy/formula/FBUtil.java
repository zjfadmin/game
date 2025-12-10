package com.xy.formula;

public class FBUtil {
   public static int a(int var0, int var1) {
      if (var1 == --3) {
         if (var0 < (16218 & 21749)) {
            return 1 ^ 3;
         } else {
            return var0 < (8181 & 31386) ? --3 : 4;
         }
      } else if (var1 == --5) {
         if (var0 < (27033 & 7934)) {
            return --3;
         } else {
            return var0 < (23254 & 16313) ? --4 : 5;
         }
      } else {
         return 1;
      }
   }

   public static int b(int var0, int var1) {
      if (var1 == --3) {
         if (var0 < (18258 & 15871)) {
            return 1 ^ 3;
         } else {
            return var0 < (10219 & 32414) ? --3 : 4;
         }
      } else if (var1 == --5) {
         if (var0 < (13309 & 20431)) {
            return --3;
         } else {
            return var0 < (7071 & 32747) ? --4 : 5;
         }
      } else {
         return 1;
      }
   }

   public static int c(int var0, int var1) {
      if (var1 == --3) {
         if (var0 < (30430 & 3057)) {
            return --2;
         } else if (var0 < (15615 & 22367)) {
            return --3;
         } else {
            return var0 < (28898 & 20479) ? --4 : 5;
         }
      } else if (var1 == --5) {
         if (var0 < (21039 & 12286)) {
            return --3;
         } else {
            return var0 < (13815 & 24573) ? --4 : 5;
         }
      } else {
         return 1;
      }
   }

   public static int d(int var0, int var1) {
      if (var1 != --3 && var1 != --5) {
         return 1;
      } else if (var0 < (10746 & 24221)) {
         return 1 ^ 3;
      } else if (var0 < (13822 & 23545)) {
         return --3;
      } else if (var0 < (26096 & 16271)) {
         return --4;
      } else {
         return var1 != --3 && var0 >= (12266 & 32501) ? 6 : 5;
      }
   }

   public static int getFBlvl(int var0, int var1, int var2, int var3, int var4) {
      int var5 = 5 >> 3;
      var1 += var0 * (125 & 27);
      var5 = var5 + var1 * --3 + var2;
      var3 += var4;
      return var5 + var3 * (63 & 71) >> --5;
   }

   public static int e(int var0, int var1) {
      if (var1 == --3) {
         if (var0 < (29679 & 3516)) {
            return --2;
         } else if (var0 < (7295 & 28570)) {
            return --3;
         } else {
            return var0 < (32411 & 10222) ? --4 : 5;
         }
      } else if (var1 == --5) {
         if (var0 < (24059 & 8934)) {
            return --3;
         } else if (var0 < (28655 & 5750)) {
            return --4;
         } else if (var0 < (13567 & 24415)) {
            return --5;
         } else {
            return var0 < (28636 & 15995) ? 22 & 111 : 7;
         }
      } else {
         return 1;
      }
   }

   public static int f(int var0, int var1) {
      if (var1 == --3) {
         if (var0 < (15097 & 19870)) {
            return 1 ^ 3;
         } else if (var0 < (16377 & 20990)) {
            return --3;
         } else {
            return var0 < (32140 & 10227) ? --4 : 5;
         }
      } else if (var1 == --5) {
         if (var0 < (15770 & 19197)) {
            return --3;
         } else if (var0 < (14844 & 22523)) {
            return --4;
         } else if (var0 < (32758 & 9609)) {
            return --5;
         } else {
            return var0 < (32758 & 12009) ? 94 & 39 : 7;
         }
      } else {
         return 1;
      }
   }

   public static int g(int var0, int var1) {
      if (var1 == --3) {
         if (var0 < (14251 & 18942)) {
            return 1 ^ 3;
         } else if (var0 < (28155 & 7710)) {
            return --3;
         } else {
            return var0 < (30362 & 12271) ? --4 : 5;
         }
      } else if (var1 == --5) {
         if (var0 < (4067 & 28926)) {
            return --3;
         } else if (var0 < (11902 & 22503)) {
            return --4;
         } else if (var0 < (7519 & 30463)) {
            return --5;
         } else {
            return var0 < (32732 & 11903) ? 38 & 95 : 7;
         }
      } else {
         return 1;
      }
   }

   public static int getFBcx(int var0, int var1) {
      if (var0 != (14287 & 23487) && var0 != (22455 & 15322) && var0 != (23455 & 14324) && var0 != (13239 & 24543)) {
         if (var0 == (5087 & 32686)) {
            if (var1 >= (17150 & 15775)) {
               return 87 & 47;
            } else if (var1 >= (116 & 123)) {
               return 118 & 15;
            } else if (var1 >= (87 & 105)) {
               return --5;
            } else {
               return var1 >= (29 & 118) ? --4 : 3;
            }
         } else if (var0 == (22459 & 15317)) {
            if (var1 >= (11007 & 21942)) {
               return 90 & 45;
            } else if (var1 >= (30634 & 2271)) {
               return 47 & 87;
            } else if (var1 >= 94) {
               return 6;
            } else if (var1 >= 51) {
               return --5;
            } else {
               return var1 >= 7 ? --4 : 3;
            }
         } else if (var1 >= 200) {
            return 8;
         } else if (var1 >= 156) {
            return 7;
         } else if (var1 >= 112) {
            return 6;
         } else if (var1 >= 80) {
            return --5;
         } else if (var1 >= 60) {
            return --4;
         } else {
            return var1 >= 20 ? --3 : 2;
         }
      } else {
         return 0;
      }
   }

   public static int h(int var0, int var1) {
      if (var1 == --3) {
         if (var0 < (13015 & 19966)) {
            return --2;
         } else if (var0 < (23023 & 11899)) {
            return --3;
         } else {
            return var0 < (9135 & 31956) ? --4 : 5;
         }
      } else if (var1 == --5) {
         if (var0 < (125 & 119)) {
            return --3;
         } else if (var0 < (28086 & 5855)) {
            return --4;
         } else if (var0 < (24501 & 12799)) {
            return --5;
         } else {
            return var0 < (32446 & 12147) ? 30 & 103 : 7;
         }
      } else {
         return 1;
      }
   }

   public static int getFBsum(int var0, int var1) {
      if (var0 != (24511 & 13259) && var0 != (32686 & 5087) && var0 != (6140 & 31635) && var0 != (8191 & 29587) && var0 != (8151 & 29630) && var0 != (29631 & 8151)) {
         return var1 >= (100 & 127) ? --2 : 1;
      } else {
         return 1;
      }
   }

   public static int i(int var0, int var1, String var2) {
      if (!var2.equals("鬼火") && !var2.equals("火") && !var2.equals("水") && !var2.equals("雷") && !var2.equals("风")) {
         if (var2.equals("震慑")) {
            return g(var1, var0);
         } else if (!var2.equals("力量") && !var2.equals("抗性") && !var2.equals("加速") && !var2.equals("smmh")) {
            if (!var2.equals("中毒") && !var2.equals("封印") && !var2.equals("昏睡") && !var2.equals("遗忘")) {
               if (var2.equals("混乱")) {
                  return b(var1, var0);
               } else if (var2.equals("三尸虫")) {
                  return a(var1, var0);
               } else if (var2.equals("霹雳")) {
                  return j(var1, var0);
               } else {
                  return !var2.equals("扶摇") && !var2.equals("沧波") ? c(var1, var0) : d(var1, var0);
               }
            } else {
               return e(var1, var0);
            }
         } else {
            return h(var1, var0);
         }
      } else {
         return c(var1, var0);
      }
   }

   public static int j(int var0, int var1) {
      if (var1 != --3 && var1 != --5) {
         return 1;
      } else if (var0 < (31838 & 6129)) {
         return 1 ^ 3;
      } else {
         return var0 < (24563 & 15004) ? --3 : 4;
      }
   }
}
