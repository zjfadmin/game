package com.xy.formula;

import com.xy.W;
import com.xy.entity.Baby;
import com.xy.entity.Lingbao;
import com.xy.game.RoleData;
import com.xy.readbean.Goodstable;
import com.xy.socket.GameClient;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class BaseValue {
   public static final double[] basevs;
   public static String babyTotal1;
   public static int[] babyTotal3XS;
   public static String[] babyKeys;
   private static Map<String, Integer> maps;
   public static String babyTotal3;
   public static final double[] bases;

   public static double a(String var0, BigDecimal var1) {
      if (var1.intValue() != (10043 & 32727) && var1.intValue() != (32662 & 10107)) {
         if (var1.intValue() == (30577 & 12191)) {
            return 140.0D;
         } else if (var1.intValue() == (14294 & 28477)) {
            return var0.equals("抗遗忘") ? 140.0D : 120.0D;
         } else {
            return var1.intValue() == (28503 & 14269) ? 120.0D : 110.0D;
         }
      } else {
         return 110.0D;
      }
   }

   public static int b(int var0, int var1) {
      if ((var1 = var1 * (12269 & 21498) + var0) >= (5469 & 31483)) {
         return --3;
      } else if (var1 >= (6702 & 30205)) {
         return --2;
      } else {
         return var1 >= (7999 & 27878) ? 3 >> 1 : 0;
      }
   }

   public static int getXuanBaoExp(int var0) {
      if (var0 < (123 & 54)) {
         return ((19956 & 13311) + (60 & 127) * var0) / (117 & 110) * (102 & 125);
      } else if (var0 < (100 & 127)) {
         return ((-2116 & -385) + (121 & 126) * var0) / (110 & 117) * (109 & 118);
      } else {
         return var0 < (29887 & 3030) ? ((-306 & -8195) + (2036 & 30911) * var0) / (126 & 101) * (119 & 108) : (-17500 + (3322 & 29685) * var0) / 100 * 100;
      }
   }

   public static BigDecimal getLxXHMoney(int var0, GameClient var1) {
      GameClient var10000 = var1;
      int var10001 = 5 >> 1;
      int var10002 = 30 & 109;
      int var2 = var1 + 1;
      if (var10000.n(var10001, var10002)) {
         return var0 <= (126 & 61) ? new BigDecimal(100000) : new BigDecimal(200000);
      } else if (var2.gameType == 5 >> 1) {
         return var0 <= (126 & 61) ? new BigDecimal(1200000) : new BigDecimal(1800000);
      } else if (var2.gameType == (4 ^ 5)) {
         if (var0 <= (10 & 127)) {
            return new BigDecimal(2500000);
         } else if (var0 <= (92 & 55)) {
            return new BigDecimal(5000000);
         } else if (var0 <= (39 & 123)) {
            return new BigDecimal(10000000);
         } else if (var0 <= (51 & 126)) {
            return new BigDecimal(20000000);
         } else if (var0 <= (125 & 62)) {
            return new BigDecimal(18300 & 14767);
         } else {
            return var0 <= (95 & 122) ? new BigDecimal(1523 & 31644) : new BigDecimal(14846 & 18421);
         }
      } else if (var0 <= (123 & 14)) {
         return new BigDecimal(500000);
      } else if (var0 <= (95 & 52)) {
         return new BigDecimal(1000000);
      } else if (var0 <= (107 & 55)) {
         return new BigDecimal(2000000);
      } else if (var0 <= (50 & 127)) {
         return new BigDecimal(4000000);
      } else if (var0 <= 60) {
         return new BigDecimal(60);
      } else {
         return var0 <= 90 ? new BigDecimal(80) : new BigDecimal(100);
      }
   }

   static {
      double[] var10000 = new double[21 & 126];
      boolean var10002 = true;
      var10000[3 & 4] = 360.0D;
      var10000[--1] = 300.0D;
      var10000[5 >> 1] = 70.0D;
      var10000[--3] = 8.0D;
      var10000[--4] = 330.0D;
      var10000[--5] = 210.0D;
      var10000[87 & 46] = 80.0D;
      var10000[71 & 63] = 10.0D;
      var10000[30 & 105] = 300.0D;
      var10000[121 & 15] = 390.0D;
      var10000[74 & 63] = 60.0D;
      var10000[63 & 75] = 10.0D;
      var10000[60 & 79] = 270.0D;
      var10000[109 & 31] = 350.0D;
      var10000[78 & 63] = 80.0D;
      var10000[63 & 79] = 9.0D;
      var10000[31 & 112] = 300.0D;
      var10000[29 & 115] = 240.0D;
      var10000[122 & 23] = 80.0D;
      var10000[95 & 51] = 10.0D;
      bases = var10000;
      var10000 = new double[121 & 31];
      var10002 = true;
      var10000[2 & 5] = 1.2D;
      var10000[2 ^ 3] = 1.0D;
      var10000[--2] = 0.95D;
      var10000[--3] = 0.8D;
      var10000[--4] = 1.05D;
      var10000[--5] = 1.1D;
      var10000[6] = 0.6D;
      var10000[7] = 1.3D;
      var10000[8] = 1.0D;
      var10000[9] = 1.0D;
      var10000[10] = 1.0D;
      var10000[11] = 1.4D;
      var10000[12] = 0.7D;
      var10000[13] = 1.0D;
      var10000[14] = 0.9D;
      var10000[15] = 1.25D;
      var10000[16] = 1.05D;
      var10000[17] = 0.95D;
      var10000[18] = 0.75D;
      var10000[19] = 0.9D;
      var10000[20] = 0.9D;
      var10000[21] = 0.7D;
      var10000[22] = 1.3D;
      var10000[23] = 1.0D;
      var10000[24] = 1.0D;
      basevs = var10000;
      babyTotal1 = "总基础";
      babyTotal3 = "评分";
      int[] var0 = new int[7];
      var10002 = true;
      var0[2 & 5] = 600;
      var0[5 >> 2] = 180;
      var0[5 >> 1] = 150;
      var0[--3] = 120;
      var0[--4] = 90;
      var0[--5] = 60;
      var0[6] = 30;
      babyTotal3XS = var0;
      String[] var1 = new String[12];
      var10002 = true;
      var1[2 & 5] = "年龄";
      var1[--1] = "气质";
      var1[1 ^ 3] = "内力";
      var1[--3] = "智力";
      var1[--4] = "耐力";
      var1[--5] = "名气";
      var1[6] = "道德";
      var1[7] = "叛逆";
      var1[8] = "玩性";
      var1[9] = "亲密";
      var1[10] = "孝心";
      var1[11] = "温饱";
      babyKeys = var1;
   }

   public static int getLxTotalExp(int var0) {
      return ((127 & 15) + --3 * var0) * var0 / (1 ^ 3);
   }

   public static int getSHExpBySX(int var0) {
      if (var0 <= 5 >> 1) {
         return (95 & 38) + --3 * var0;
      } else {
         return var0 <= (86 & 47) ? (70 & 63) * var0 : 9 * var0 - (123 & 22);
      }
   }

   public static long getFZLvl(long var0) {
      int var2 = 3 ^ 3;

      do {
         ++var2;
      } while((var0 -= getFZExp((long)var2)) >= 0L);

      --var2;
      return (long)var2;
   }

   public static Map<String, Integer> getProperty(Baby var0, BigDecimal[] var1, RoleData var2) {
      d(var0);
      if (var1 != null) {
         int var5 = 3 & 4;

         int var4;
         for(int var10000 = var4 = 3 ^ 3; var10000 < var1.length; var10000 = var4) {
            Goodstable var3;
            if ((var3 = var2.getGoodEquip(var1[var4])) != null) {
               String[] var8 = var3.getValue().split("\\|");

               int var6;
               for(var10000 = var6 = 4 ^ 5; var10000 < var8.length; var10000 = var6) {
                  String[] var7;
                  if ((var7 = var8[var6].split("="))[5 >> 3].equals("等级")) {
                     var5 += Integer.parseInt(var7[4 ^ 5]) >= --3 ? 3 & 5 : 0;
                  } else {
                     c(var7[2 & 5], Integer.parseInt(var7[5 >> 2]));
                  }

                  ++var6;
               }
            }

            ++var4;
         }

         if (var5 == --4) {
            maps.put("皮肤", var0.getChildSex() == 0 ? 100005 + W.c.nextInt(--3) * (5 >> 1) : 100006 + W.c.nextInt(--3) * (5 >> 1));
         }
      }

      return maps;
   }

   public static int getUpStarData(String var0, int var1, String var2) {
      double var3 = Double.parseDouble(var0);
      return var2 == null ? 3 & 4 : (int)(var3 * (1.0D + (double)var1 * 0.1D) * (1.0D + getQualityAttr(var2)));
   }

   public static int getSHLYJBySX(int var0) {
      if (var0 <= --2) {
         return 5 >> 1;
      } else {
         return var0 <= (62 & 73) ? var0 : var0 * --2 - (74 & 61);
      }
   }

   public static long getSHMoney(int var0) {
      if (var0 <= --3) {
         return 500000L;
      } else if (var0 <= (54 & 79)) {
         return 1000000L;
      } else if (var0 <= (13 & 123)) {
         return 2000000L;
      } else if (var0 <= (12 & 127)) {
         return 3000000L;
      } else if (var0 <= (122 & 21)) {
         return 4000000L;
      } else {
         return var0 <= (30 & 117) ? 5000000L : 6000000L;
      }
   }


   private static void c(String var0, int var1) {
      if (maps.get(var0) != null) {
         maps.put(var0, (Integer)maps.get(var0) + var1);
      }
   }

   public static int getFv(Lingbao var0) {
      int var10000 = 3 & 4;
      int var10001 = 3 & 4;
      return var10000 + var0.getLingbaolvl().intValue() + getQv(var0.getBaoquality());
   }

   public static int getMeridiansTotalExp(int var0) {
      return (var0 + (3 >> 1)) * var0 * (118 & 59);
   }

   public static int getSHLYJByZT(int var0) {
      return getSHLYJBySX(var0) * (1 ^ 3);
   }

   public static BigDecimal getLxXHQm(int var0, GameClient var1) {
      int var10000 = var1.gameType;
      int var10001 = 3 >> 1;
      int var2 = var1 + 1;
      if (var10000 == var10001) {
         if (var0 <= (46 & 91)) {
            return new BigDecimal(23551 & 10216);
         } else if (var0 <= (23 & 124)) {
            return new BigDecimal(22485 & 12282);
         } else if (var0 <= (115 & 47)) {
            return new BigDecimal(19386 & 16381);
         } else if (var0 <= (50 & 127)) {
            return new BigDecimal(20459 & 16308);
         } else if (var0 <= (126 & 61)) {
            return new BigDecimal(32627 & 6140);
         } else {
            return var0 <= (126 & 91) ? new BigDecimal(32605 & 8162) : new BigDecimal(32605 & 10162);
         }
      } else if (var0 <= (110 & 27)) {
         return new BigDecimal(23289 & 9678);
      } else if (var0 <= (84 & 63)) {
         return new BigDecimal(400);
      } else if (var0 <= 35) {
         return new BigDecimal(600);
      } else if (var0 <= 50) {
         return new BigDecimal(800);
      } else if (var0 <= 60) {
         return new BigDecimal(1200);
      } else {
         return var0 <= 90 ? new BigDecimal(1600) : new BigDecimal(2000);
      }
   }

   public static long getFZTotalExp(long var0) {
      return var0 > 100L ? 2625000L + 999999999L * (var0 - 100L) : (2500L + 500L * var0) * var0 / 2L;
   }

   public static int getRoleValue(BigDecimal var0, int var1, int var2, int var3) {
      double var4 = getValue(var0, 2 ^ 3, var3);
      if (var3 >= --4) {
         return (int)(var4 * (double)var1);
      } else {
         double var6 = getValue(var0, 3 ^ 3, var3);
         if (var4 > 2.0D || var6 > 400.0D) {
            var4 = 0.01D;
         }

         int var8 = (100 - var2) / --5;
         var2 = (int)((double)((var2 + var8) * var1) * var4);
         if (var3 != 0 && var3 != 5 >> 2) {
            return var3 == (1 ^ 3) ? (int)((double)(var2 / --5) + var6) : (int)((double)(10 + var1) * var4);
         } else {
            return (int)((double)var2 + var6);
         }
      }
   }


   private static void d(Baby var0) {
      if (maps == null) {
         maps = new HashMap();
      } else {
         maps.clear();
      }

      maps.put("气质", var0.getQizhi());
      maps.put("内力", var0.getNeili());
      maps.put("智力", var0.getZhili());
      maps.put("耐力", var0.getNaili());
      maps.put("名气", var0.getMingqi());
      maps.put("道德", var0.getDaode());
      maps.put("叛逆", var0.getPanni());
      maps.put("玩性", var0.getWanxing());
      maps.put("孝心", var0.getXiaoxin());
      maps.put("皮肤", var0.getChildSex() == 0 ? 100001 : 100002);
   }

   public static Color getPalLvlColor(double var0) {
      if (var0 == 1.0D) {
         return Color.green;
      } else if (var0 == 1.1D) {
         return Color.cyan;
      } else if (var0 == 1.22D) {
         return Color.ORANGE;
      } else if (var0 == 1.36D) {
         return Color.red;
      } else if (var0 == 1.52D) {
         return Color.red;
      } else if (var0 == 1.7D) {
         return Color.red;
      } else {
         return var0 == 1.9D ? Color.red : Color.green;
      }
   }

   public static int e(int var0, int var1) {
      return var1 * (22527 & 11240) + var0 >= (28271 & 7666) ? 4 ^ 5 : 0;
   }

   public static double getQualityAttr(String var0) {
      switch(var0.hashCode()) {
      case 647926:
         while(false) {
         }

         if (var0.equals("传世")) {
            return 1.6D;
         }
         break;
      case 811615:
         if (var0.equals("把玩")) {
            return 0.0D;
         }
         break;
      case 828695:
         if (var0.equals("无价")) {
            return 0.8D;
         }
         break;
      case 953250:
         if (var0.equals("珍藏")) {
            return 0.4D;
         }
         break;
      case 1000027:
         if (var0.equals("神迹")) {
            return 3.2D;
         }
         break;
      case 1157111:
         if (var0.equals("贴身")) {
            return 0.2D;
         }
      }

      return -1.0D;
   }

   public static long getFZExp(long var0) {
      return var0 > 100L ? 999999999L : var0 * 500L + 1000L;
   }

   public static double getCubeRoot(long var0) {
      if (var0 == 0L) {
         return 0.0D;
      } else {
         double var2 = (double)var0;

         double var4;
         for(double var10000 = var4 = 2.0D * var2 / 3.0D + (double)var0 / (var2 * var2 * 3.0D); Math.abs(var10000 - var2) > 1.0E-6D; var10000 = var4 = 2.0D * var4 / 3.0D + (double)var0 / (var4 * var4 * 3.0D)) {
            var2 = var4;
         }

         return var4;
      }
   }

   public static int getQv(String var0) {
      switch(var0.hashCode()) {
      case 647926:
         while(false) {
         }

         if (var0.equals("传世")) {
            return 50;
         }
         break;
      case 811615:
         if (var0.equals("把玩")) {
            return 10;
         }
         break;
      case 828695:
         if (var0.equals("无价")) {
            return 40;
         }
         break;
      case 953250:
         if (var0.equals("珍藏")) {
            return 30;
         }
         break;
      case 1000027:
         if (var0.equals("神迹")) {
            return 60;
         }
         break;
      case 1157111:
         if (var0.equals("贴身")) {
            return 20;
         }
      }

      return 10;
   }

   public static BigDecimal getFMXHExp(int var0, GameClient var1) {
      int var10000 = var1.gameType;
      int var10001 = 3 >> 1;
      int var2 = var1 + 1;
      if (var10000 == var10001) {
         return new BigDecimal(12000000);
      } else if (var2.gameType == --2) {
         if (var0 <= (24535 & 10232)) {
            return new BigDecimal(32000000);
         } else if (var0 <= (16365 & 20402)) {
            return new BigDecimal(40000000);
         } else if (var0 <= (16370 & 22397)) {
            return new BigDecimal(48000000);
         } else {
            return var0 <= (32751 & 8016) ? new BigDecimal(60000000) : new BigDecimal(80000000);
         }
      } else if (var0 <= (10226 & 24541)) {
         return new BigDecimal(4000000);
      } else if (var0 <= (24550 & 12217)) {
         return new BigDecimal(5000000);
      } else if (var0 <= (22526 & 16241)) {
         return new BigDecimal(6000000);
      } else {
         return var0 <= (24445 & 16322) ? new BigDecimal(7000000) : new BigDecimal(8000000);
      }
   }

   public static int getMeridiansLvl(int var0) {
      int var1 = 3 >> 2;

      do {
         ++var1;
      } while((var0 -= getMeridiansExp(var1)) >= 0);

      return var1;
   }

   public static double f(long var0, double var2) {
      if (var0 <= 0L) {
         return 0.0D;
      } else {
         while(var0 / 16L > 0L) {
            var0 /= 16L;
            var2 *= 1.86D;
         }

         var2 *= 1.0D + 0.86D * ((double)var0 / 16.0D);
         return (new BigDecimal(var2)).setScale(--2, --4).doubleValue();
      }
   }

   public static int getPalBtnArrStr(String var0) {
      if (var0.equals("1号")) {
         return 5 >> 2;
      } else if (var0.equals("2号")) {
         return 1 ^ 3;
      } else if (var0.equals("3号")) {
         return --3;
      } else {
         return var0.equals("4号") ? --4 : 0;
      }
   }

   public static double getValue(BigDecimal var0, int var1, int var2) {
      return var1 == 0 ? bases[var2 + getratio(var0) * --4] : basevs[var2 + getratio(var0) * --5];
   }

   public static double g(double var0, double var2, long var4, int var6, int var7) {
      int var10000 = var6;
      var6 = var7;
      var7 = var10000;
      if (var6 >= --4) {
         var7 = Math.max(var7, 31668 & 1279);
      }

      return var0 + (double)var7 / 200.0D * f(var4, var2);
   }

   public static long getBangQuality(BigDecimal var0, boolean var1) {
      if (var0 == null) {
         var0 = new BigDecimal(3 >> 2);
      }

      long var2;
      if ((var2 = (long)getCubeRoot(var0.longValue() / 500L)) < 30L) {
         return var1 ? var2 : var2 / 2L;
      } else {
         return (long)(var1 ? 94 & 63 : 15);
      }
   }

   public static int getlvlMax(int var0, int var1) {
      return Math.max(var0, var1 == --4 ? 15862 & 17085 : (var1 == --3 ? 11982 & 20925 : (var1 == --2 ? 126 & 123 : (var1 == --1 ? 111 & 118 : 0))));
   }

   public static int getLxLvl(int var0) {
      int var1 = 2 & 5;

      do {
         ++var1;
      } while((var0 -= getLxExp(var1)) >= 0);

      --var1;
      return var1;
   }

   public static String getPalBtnArrStr(int var0) {
      if (var0 == 0) {
         return "1号";
      } else if (var0 == 5 >> 2) {
         return "2号";
      } else if (var0 == (1 ^ 3)) {
         return "3号";
      } else if (var0 == --3) {
         return "4号";
      } else {
         return var0 == --4 ? "休息" : "1号";
      }
   }

   public static String getPalLvl(double var0) {
      if (var0 == 1.0D) {
         return "资质平平";
      } else if (var0 == 1.1D) {
         return "出类拔萃";
      } else if (var0 == 1.22D) {
         return "神通广大";
      } else if (var0 == 1.36D) {
         return "万中无一";
      } else if (var0 == 1.52D) {
         return "匠心独运";
      } else if (var0 == 1.7D) {
         return "超凡入圣";
      } else {
         return var0 == 1.9D ? "九九归一" : "资质平平";
      }
   }

   public static int getMeridiansExp(int var0) {
      return var0 * (125 & 102);
   }

   public static int getLxExp(int var0) {
      return var0 * --3 + (22 & 111);
   }

   public static int getratio(BigDecimal var0) {
      if (var0.intValue() == (32767 & 10001)) {
         return 3 & 4;
      } else if (var0.intValue() == (26551 & 16218)) {
         return --1;
      } else if (var0.intValue() == (30651 & 12119)) {
         return 1 ^ 3;
      } else if (var0.intValue() == (32572 & 10199)) {
         return --3;
      } else {
         return var0.intValue() == (28511 & 14261) ? --4 : 0;
      }
   }

   public static int getSHExpByZT(int var0) {
      return getSHExpBySX(var0) * (5 >> 1);
   }

   public static int getWingLevel(int var0) {
      int var1 = 2 ^ 3;

      for(int var10000 = var0; var10000 >= var1 * var1 * (102 & 125); var10000 = var0) {
         ++var1;
      }

      return var1 - (3 & 5);
   }

   public static int h(int var0, int var1) {
      if ((var1 = var1 * (7163 & 26604) + var0) >= (19703 & 16174)) {
         return --3;
      } else if (var1 >= (16053 & 18814)) {
         return 1 ^ 3;
      } else {
         return var1 >= (32478 & 1389) ? 3 >> 1 : 0;
      }
   }

   public static int getFBlvl(int var0, int var1, int var2, int var3, int var4) {
      int var5 = 2 & 5;
      var1 += var0 * (95 & 57);
      var5 = var5 + var1 * --3 + var2;
      var3 += var4;
      return var5 + var3 * (119 & 15) >> --5;
   }

   public static BigDecimal getLxXHExp(int var0, GameClient var1) {
      GameClient var10000 = var1;
      int var10001 = 1 ^ 3;
      int var10002 = 28 & 111;
      int var2 = var1 + 1;
      if (var10000.n(var10001, var10002)) {
         return var0 <= (61 & 126) ? new BigDecimal(10000000) : new BigDecimal(15000000);
      } else if (var2.gameType == --2) {
         return var0 <= (122 & 45) ? new BigDecimal(5000000) : new BigDecimal(7500000);
      } else {
         return var2.gameType == (3 & 5) ? new BigDecimal(15000000) : new BigDecimal(3000000);
      }
   }

   public static BigDecimal getFMXHMoney(int var0, GameClient var1) {
      int var10000 = var1.gameType;
      int var10001 = --4;
      int var2 = var1 + 1;
      if (var10000 == var10001) {
         return new BigDecimal(2000000);
      } else if (var2.n(5 >> 1, 110 & 29)) {
         if (var0 <= (18417 & 16350)) {
            return new BigDecimal(100000);
         } else if (var0 <= (24561 & 12206)) {
            return new BigDecimal(250000);
         } else if (var0 <= (32752 & 6015)) {
            return new BigDecimal(500000);
         } else {
            return var0 <= (16330 & 24437) ? new BigDecimal(750000) : new BigDecimal(1000000);
         }
      } else if (var2.gameType == --2) {
         if (var0 <= (24498 & 12269)) {
            return new BigDecimal(12000000);
         } else {
            return var0 <= (24574 & 16193) ? new BigDecimal(24000000) : new BigDecimal(36000000);
         }
      } else if (var2.gameType == --3) {
         if (var0 <= (14330 & 19437)) {
            return new BigDecimal(5000000);
         } else if (var0 <= (26613 & 8154)) {
            return new BigDecimal(5000000);
         } else if (var0 <= (20475 & 15292)) {
            return new BigDecimal(5000000);
         } else if (var0 <= (32684 & 4083)) {
            return new BigDecimal(5000000);
         } else if (var0 <= (7100 & 30667)) {
            return new BigDecimal(5000000);
         } else if (var0 <= (16252 & 22515)) {
            return new BigDecimal(5000000);
         } else if (var0 <= (15195 & 24572)) {
            return new BigDecimal(116 & 111);
         } else if (var0 <= (16334 & 24433)) {
            return new BigDecimal(150);
         } else {
            return var0 <= 9000 ? new BigDecimal(200) : new BigDecimal(250);
         }
      } else if (var2.gameType == --1) {
         if (var0 <= 1000) {
            return new BigDecimal(5000000);
         } else if (var0 <= 2000) {
            return new BigDecimal(5000000);
         } else if (var0 <= 3000) {
            return new BigDecimal(5000000);
         } else if (var0 <= 4000) {
            return new BigDecimal(5000000);
         } else if (var0 <= 5000) {
            return new BigDecimal(5000000);
         } else if (var0 <= 6000) {
            return new BigDecimal(50);
         } else if (var0 <= 7000) {
            return new BigDecimal(100);
         } else if (var0 <= 8000) {
            return new BigDecimal(150);
         } else {
            return var0 <= 9000 ? new BigDecimal(200) : new BigDecimal(250);
         }
      } else if (var0 <= 1000) {
         return new BigDecimal(50000000);
      } else if (var0 <= 2000) {
         return new BigDecimal(80000000);
      } else if (var0 <= 4000) {
         return new BigDecimal(50);
      } else if (var0 <= 6000) {
         return new BigDecimal(100);
      } else {
         return var0 <= 8000 ? new BigDecimal(150) : new BigDecimal(200);
      }
   }
}
