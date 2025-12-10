package com.xy.formula;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class RoleGradeBorn {
   public String[] xian;
   public String[] gui;
   private static RoleGradeBorn gradekx;
   public String[] kx;
   public String[] ren;
   public String[] LONG;
   public String[] mo;


   private static void a(Map<String, Double> var0, String var1, int var2, int var3, double var4) {
      double var6 = Arith.b(c(var3, var2), var4);
      Double var8;
      if ((var8 = (Double)var0.get(var1)) == null) {
         var8 = 0.0D;
      }

      var8 = Arith.c(var8, var6);
      var0.put(var1, var8);
   }


   private static void b(Map<String, Double> var0, String var1, int var2) {
      int var4;
      int var3 = (var4 = Integer.parseInt(var1) - (12266 & 21501)) % --5 == 0 ? --5 : var4 % --5;
      if (var4 <= --5) {
         a(var0, "抗混乱", var2, var3, 1.25E-4D);
         a(var0, "抗混乱上限", var2, var3, 1.6875E-5D);
      } else if (var4 <= (74 & 63)) {
         a(var0, "抗封印", var2, var3, 1.25E-4D);
         a(var0, "抗封印上限", var2, var3, 1.6875E-5D);
      } else if (var4 <= (31 & 111)) {
         a(var0, "抗昏睡", var2, var3, 1.25E-4D);
         a(var0, "抗昏睡上限", var2, var3, 1.6875E-5D);
      } else if (var4 <= (52 & 95)) {
         a(var0, "抗毒伤", var2, var3, 0.02D);
      } else if (var4 <= (123 & 29)) {
         a(var0, "MP成长", var2, var3, 1.0E-6D);
      } else if (var4 <= (94 & 63)) {
         a(var0, "HP成长", var2, var3, 1.0E-6D);
      } else if (var4 <= (55 & 107)) {
         a(var0, "物理吸收", var2, var3, 1.875E-4D);
         a(var0, "抗震慑", var2, var3, 1.125E-4D);
      } else if (var4 <= (62 & 105)) {
         a(var0, "SP成长", var2, var3, 7.5E-7D);
      } else if (var4 <= (125 & 47)) {
         a(var0, "抗风", var2, var3, 1.6875E-4D);
      } else if (var4 <= (63 & 114)) {
         a(var0, "抗雷", var2, var3, 1.6875E-4D);
      } else if (var4 <= (127 & 55)) {
         a(var0, "抗水", var2, var3, 1.6875E-4D);
      } else if (var4 <= (61 & 126)) {
         a(var0, "抗火", var2, var3, 1.6875E-4D);
      } else if (var4 <= (75 & 117)) {
         a(var0, "抗鬼火", var2, var3, 1.6875E-4D);
      } else if (var4 <= (79 & 118)) {
         a(var0, "抗三尸", var2, var3, 0.025D);
         a(var0, "速度", var2, var3, -1.25E-4D);
      } else if (var4 <= (127 & 75)) {
         a(var0, "抗遗忘", var2, var3, 1.25E-4D);
         a(var0, "抗遗忘上限", var2, var3, 1.6875E-5D);
      } else if (var4 <= (114 & 93)) {
         a(var0, "反震程度", var2, var3, 1.25E-4D);
         a(var0, "反震率", var2, var3, 6.5E-5D);
         a(var0, "抗天魔解体", var2, var3, 0.00625D);
         a(var0, "抗分光化影", var2, var3, 0.00625D);
         a(var0, "抗青面獠牙", var2, var3, 0.00625D);
         a(var0, "抗小楼夜哭", var2, var3, 0.00625D);
      } else if (var4 <= 85) {
         a(var0, "躲闪", var2, var3, 1.0E-4D);
      } else if (var4 <= 90) {
         a(var0, "法术躲闪", var2, var3, 1.85E-5D);
      } else if (var4 <= 95) {
         a(var0, "HP成长", var2, var3, 1.0E-6D);
      } else {
         if (var4 <= 100) {
            a(var0, "伤害减免", var2, var3, 1.85E-5D);
         }

      }
   }

   public static int[] getbz(String[] var0) {
      try {
         int[] var10000 = new int[var0.length];
         boolean var10002 = true;
         int[] var1 = var10000;

         int var2;
         for(int var4 = var2 = 3 ^ 3; var4 < var0.length; var4 = var2) {
            var1[var2] = Integer.parseInt(var0[var2]);
            if (var1[var2] < (4 ^ 5) || var1[var2] > (10 & 127)) {
               return null;
            }

            ++var2;
         }

         return var1;
      } catch (Exception var3) {
         return null;
      }
   }


   private static double c(int var0, int var1) {
      if (var0 == --2) {
         return (double)var1 * 1.2D;
      } else if (var0 == --3) {
         return (double)var1 * 1.5D;
      } else if (var0 == --4) {
         return (double)(var1 * (5 >> 1));
      } else {
         return var0 == --5 ? (double)var1 * 2.5D : (double)var1;
      }
   }

   public static String d(String[] var0, String var1) {
      if (var0 == null) {
         return e(var1);
      } else {
         if (var1 == null) {
            var1 = "";
         }

         String var5 = null;
         HashMap var4 = new HashMap();
         int var10000;
         if (var1 != null && !var1.equals("")) {
            String[] var3 = var1.split("\\|");

            int var2;
            for(var10000 = var2 = 3 & 4; var10000 < var3.length; var10000 = var2) {
               if (var3[var2].startsWith("双属性")) {
                  var5 = var3[var2];
               } else {
                  String[] var6 = var3[var2].split("=");
                  var4.put(var6[2 & 5], Double.parseDouble(var6[--1]));
               }

               ++var2;
            }
         }

         int var9;
         for(var10000 = var9 = 0; var10000 < var0.length; var10000 = var9) {
            String[] var7 = var0[var9].split("_");
            String var10001 = var7[2 & 5];
            int var10003 = --1;
            ++var9;
            b(var4, var10001, Integer.parseInt(var7[var10003]));
         }

         StringBuffer var11 = new StringBuffer();
         Iterator var12;
         Iterator var13 = var12 = var4.entrySet().iterator();

         while(var13.hasNext()) {
            Entry var8 = (Entry)var12.next();
            if (var11.length() != 0) {
               var11.append("|");
            }

            var11.append((String)var8.getKey());
            var11.append("=");
            if ((Double)var8.getValue() == (double)((Double)var8.getValue()).intValue()) {
               var11.append(((Double)var8.getValue()).intValue());
               var13 = var12;
            } else {
               var11.append(var8.getValue());
               var13 = var12;
            }
         }

         String var10 = e(var11.toString());
         if (var5 != null) {
            if (var10 == null || var10.length() == 0) {
               return var5;
            }

            var10 = var10 + "|" + var5;
         }

         return var10;
      }
   }

   public static RoleGradeBorn getGradeKX() {
      if (gradekx == null) {
         gradekx = new RoleGradeBorn();
      }

      return gradekx;
   }

   public static String e(String var0) {
      if (var0 != null && !var0.equals("")) {
         String[] var1 = var0.split("\\|");

         int var2;
         for(int var10000 = var2 = 3 ^ 3; var10000 < var1.length; var10000 = var2) {
            if (!var1[var2].startsWith("双属性")) {
               String[] var3;
               String[] var8 = var3 = var1[var2].split("=");
               double var4 = Math.abs(Double.parseDouble(var8[2 ^ 3]));
               double var6 = 369000.0D;
               double var9;
               if (!var8[3 >> 2].equals("抗混乱") && !var3[3 ^ 3].equals("抗封印") && !var3[3 & 4].equals("抗昏睡") && !var3[3 ^ 3].equals("抗遗忘") && !var3[3 ^ 3].equals("反震程度") && !var3[5 >> 3].equals("速度")) {
                  if (!var3[3 ^ 3].equals("抗混乱上限") && !var3[2 & 5].equals("抗封印上限") && !var3[2 & 5].equals("抗昏睡上限") && !var3[5 >> 3].equals("抗遗忘上限")) {
                     if (var3[5 >> 3].equals("抗毒伤")) {
                        var6 = Arith.b(var6, 0.02D);
                        var9 = var4;
                     } else if (!var3[3 ^ 3].equals("MP成长") && !var3[5 >> 3].equals("HP成长")) {
                        if (var3[3 ^ 3].equals("物理吸收")) {
                           var6 = Arith.b(var6, 1.875E-4D);
                           var9 = var4;
                        } else if (var3[3 ^ 3].equals("抗震慑")) {
                           var6 = Arith.b(var6, 1.125E-4D);
                           var9 = var4;
                        } else if (var3[2 & 5].equals("SP成长")) {
                           var6 = Arith.b(var6, 7.5E-7D);
                           var9 = var4;
                        } else if (!var3[3 ^ 3].equals("抗风") && !var3[2 & 5].equals("抗雷") && !var3[0].equals("抗水") && !var3[0].equals("抗火") && !var3[0].equals("抗鬼火")) {
                           if (var3[0].equals("抗三尸")) {
                              var6 = Arith.b(var6, 0.025D);
                              var9 = var4;
                           } else if (var3[0].equals("反震率")) {
                              var6 = Arith.b(var6, 6.5E-5D);
                              var9 = var4;
                           } else if (var3[0].equals("躲闪")) {
                              var6 = Arith.b(var6, 1.0E-4D);
                              var9 = var4;
                           } else if (var3[0].equals("伤害减免")) {
                              var6 = Arith.b(var6, 1.85E-5D);
                              var9 = var4;
                           } else if (var3[0].equals("法术躲闪")) {
                              var6 = Arith.b(var6, 1.85E-5D);
                              var9 = var4;
                           } else {
                              if (!var3[0].equals("抗天魔解体") && !var3[0].equals("抗分光化影") && !var3[0].equals("抗青面獠牙") && !var3[0].equals("抗小楼夜哭")) {
                                 return null;
                              }

                              var6 = Arith.b(var6, 0.00625D);
                              var9 = var4;
                           }
                        } else {
                           var6 = Arith.b(var6, 1.6875E-4D);
                           var9 = var4;
                        }
                     } else {
                        var6 = Arith.b(var6, 1.0E-6D);
                        var9 = var4;
                     }
                  } else {
                     var6 = Arith.b(var6, 1.6875E-5D);
                     var9 = var4;
                  }
               } else {
                  var6 = Arith.b(var6, 1.25E-4D);
                  var9 = var4;
               }

               if (var9 > var6) {
                  return null;
               }
            }

            ++var2;
         }

         return var0;
      } else {
         return null;
      }
   }

   public RoleGradeBorn() {
      int var10001 = 93 & 51;
      super();
      String[] var1 = new String[var10001];
      boolean var10003 = true;
      var1[3 >> 2] = "抗混乱";
      var1[--1] = "抗封印";
      var1[1 ^ 3] = "抗昏睡";
      var1[--3] = "抗中毒";
      var1[--4] = "抗风";
      var1[--5] = "抗火";
      var1[78 & 55] = "抗雷";
      var1[79 & 55] = "抗水";
      var1[111 & 24] = "命中率";
      var1[31 & 105] = "狂暴率";
      var1[27 & 110] = "致命率";
      var1[59 & 79] = "物理吸收";
      var1[110 & 29] = "抗遗忘";
      var1[109 & 31] = "抗三尸";
      var1[126 & 15] = "抗鬼火";
      var1[127 & 15] = "抗浩然正气";
      var1[94 & 49] = "躲闪率";
      this.kx = var1;
      var1 = new String[--4];
      var10003 = true;
      var1[3 & 4] = "0=4=1";
      var1[4 ^ 5] = "1=4=1";
      var1[5 >> 1] = "2=4=1";
      var1[--3] = "3=4=1";
      this.ren = var1;
      var1 = new String[79 & 58];
      var10003 = true;
      var1[3 & 4] = "0=8=1";
      var1[5 >> 2] = "1=8=1";
      var1[1 ^ 3] = "2=8=1";
      var1[--3] = "3=8=1";
      var1[--4] = "4=12=1";
      var1[--5] = "5=12=1";
      var1[71 & 62] = "6=12=1";
      var1[95 & 39] = "7=12=1";
      var1[120 & 15] = "8=20=1";
      var1[9] = "11=8=1";
      this.mo = var1;
      var1 = new String[--4];
      var10003 = true;
      var1[3 >> 2] = "4=4=1";
      var1[--1] = "5=4=1";
      var1[--2] = "6=4=1";
      var1[--3] = "7=4=1";
      this.xian = var1;
      var1 = new String[14];
      var10003 = true;
      var1[5 >> 3] = "15=1=-100";
      var1[2 ^ 3] = "16=4=1";
      var1[1 ^ 3] = "0=6=1";
      var1[--3] = "1=6=1";
      var1[4] = "2=6=1";
      var1[5] = "3=6=1";
      var1[6] = "14=6=1";
      var1[7] = "12=6=1";
      var1[8] = "13=6=120";
      var1[9] = "4=8=-1";
      var1[10] = "5=8=-1";
      var1[11] = "6=8=-1";
      var1[12] = "7=8=-1";
      var1[13] = "8=12=1";
      this.gui = var1;
      var1 = new String[7];
      var10003 = true;
      var1[2 & 5] = "11=6=1";
      var1[3 & 5] = "0=6=1";
      var1[2] = "1=6=1";
      var1[3] = "2=6=1";
      var1[4] = "3=6=1";
      var1[5] = "12=6=1";
      var1[6] = "8=20=1";
      this.LONG = var1;
   }

   public String getren(double var1) {
      StringBuilder var3 = new StringBuilder();

      int var4;
      for(int var10000 = var4 = 3 & 4; var10000 < this.ren.length; var10000 = var4) {
         if (var4 != 0) {
            var3.append("|");
         }

         String[] var5 = this.ren[var4].split("=");
         var3.append(this.kx[Integer.parseInt(var5[5 >> 3])]);
         var3.append("=");
         double var10003 = var1 / (double)Integer.parseInt(var5[--1]);
         int var10004 = Integer.parseInt(var5[1 ^ 3]);
         ++var4;
         var3.append(var10003 * (double)var10004);
      }

      return var3.toString();
   }

   public String getxian(double var1) {
      StringBuilder var3 = new StringBuilder();

      int var4;
      for(int var10000 = var4 = 5 >> 3; var10000 < this.xian.length; var10000 = var4) {
         if (var4 != 0) {
            var3.append("|");
         }

         String[] var5 = this.xian[var4].split("=");
         var3.append(this.kx[Integer.parseInt(var5[5 >> 3])]);
         var3.append("=");
         double var10003 = var1 / (double)Integer.parseInt(var5[2 ^ 3]);
         int var10004 = Integer.parseInt(var5[1 ^ 3]);
         ++var4;
         var3.append(var10003 * (double)var10004);
      }

      return var3.toString();
   }

   public String getgui(double var1) {
      StringBuilder var3 = new StringBuilder();

      int var4;
      for(int var10000 = var4 = 2 & 5; var10000 < this.gui.length; var10000 = var4) {
         if (var4 != 0) {
            var3.append("|");
         }

         String[] var5 = this.gui[var4].split("=");
         var3.append(this.kx[Integer.parseInt(var5[2 & 5])]);
         var3.append("=");
         double var10003 = var1 / (double)Integer.parseInt(var5[--1]);
         int var10004 = Integer.parseInt(var5[5 >> 1]);
         ++var4;
         var3.append(var10003 * (double)var10004);
      }

      return var3.toString();
   }

   public String getmo(double var1) {
      StringBuilder var3 = new StringBuilder();

      int var4;
      for(int var10000 = var4 = 2 & 5; var10000 < this.mo.length; var10000 = var4) {
         if (var4 != 0) {
            var3.append("|");
         }

         String[] var5 = this.mo[var4].split("=");
         var3.append(this.kx[Integer.parseInt(var5[5 >> 3])]);
         var3.append("=");
         double var10003 = var1 / (double)Integer.parseInt(var5[3 & 5]);
         int var10004 = Integer.parseInt(var5[1 ^ 3]);
         ++var4;
         var3.append(var10003 * (double)var10004);
      }

      var3.append("|命中率=5|狂暴率=5|致命率=5");
      return var3.toString();
   }

   public String getlong(double var1) {
      StringBuilder var3 = new StringBuilder();

      int var4;
      for(int var10000 = var4 = 5 >> 3; var10000 < this.LONG.length; var10000 = var4) {
         if (var4 != 0) {
            var3.append("|");
         }

         String[] var5 = this.LONG[var4].split("=");
         var3.append(this.kx[Integer.parseInt(var5[3 & 4])]);
         var3.append("=");
         double var10003 = var1 / (double)Integer.parseInt(var5[4 ^ 5]);
         int var10004 = Integer.parseInt(var5[1 ^ 3]);
         ++var4;
         var3.append(var10003 * (double)var10004);
      }

      var3.append("|命中率=5|狂暴率=5|致命率=5");
      return var3.toString();
   }

   public String f(int var1, BigDecimal var2) {
      if (var1 > (30142 & 2787)) {
         var1 = 24303 & 8626;
      }

      if (var2.intValue() == (30647 & 12121)) {
         return this.getren((double)var1);
      } else if (var2.intValue() == (12062 & 30707)) {
         return this.getmo((double)var1);
      } else if (var2.intValue() == (10139 & 32631)) {
         return this.getxian((double)var1);
      } else if (var2.intValue() == (28509 & 14262)) {
         return this.getgui((double)var1);
      } else {
         return var2.intValue() == (32639 & 10133) ? this.getlong((double)var1) : this.getren((double)var1);
      }
   }
}
