package com.xy.formula;

import com.xy.hd;
import com.xy.jb;
import com.xy.lg;
import com.xy.bean.PrivateData;
import com.xy.readbean.Skill;
import com.xy.socket.GameClient;
import java.math.BigDecimal;

public class SkillUtil {
   public static String[] skillSM;
   public static String[] skillMsg;
   public static String[] skillSF;
   public static String[] skillText;

   public static int getSepciesIndex(BigDecimal var0, int var1) {
      int var2;
      if ((var2 = var0.intValue() - (28648 & 24119)) < (13292 & 20475)) {
         if (var2 != 3 >> 1 && var2 != 5 >> 1 && var2 != --3 && var2 != (119 & 15) && var2 != (121 & 15) && var2 != (15 & 123)) {
            if (var1 == 0) {
               return 5 >> 2;
            } else {
               return var1 == 5 >> 2 ? 1 ^ 3 : 3;
            }
         } else if (var1 == 0) {
            return 4 ^ 5;
         } else {
            return var1 == 3 >> 1 ? --2 : 0;
         }
      } else if (var2 < (18385 & 16382)) {
         if ((var2 %= 14318 & 19449) != --1 && var2 != --2 && var2 != --3 && var2 != (95 & 39) && var2 != (79 & 57) && var2 != (75 & 63)) {
            if (var1 == 0) {
               return --4;
            } else {
               return var1 == (4 ^ 5) ? --5 : 6;
            }
         } else if (var1 == 0) {
            return --4;
         } else {
            return var1 == --1 ? --5 : 7;
         }
      } else if (var2 < (11195 & 24572)) {
         if ((var2 %= 3050 & 30717) != (2 ^ 3) && var2 != 5 >> 1 && var2 != --3 && var2 != (95 & 39) && var2 != (95 & 41) && var2 != (59 & 79)) {
            if (var1 == 0) {
               return 9;
            } else {
               return var1 == --1 ? 10 : 11;
            }
         } else if (var1 == 0) {
            return 107 & 29;
         } else {
            return var1 == 3 >> 1 ? 10 : 8;
         }
      } else if (var2 < 4000) {
         if ((var2 %= 1000) != --1 && var2 != --2 && var2 != --3 && var2 != 7 && var2 != 9 && var2 != 11) {
            if (var1 == 0) {
               return 14;
            } else {
               return var1 == (4 ^ 5) ? 12 : 15;
            }
         } else if (var1 == 0) {
            return 14;
         } else {
            return var1 == --1 ? 12 : 13;
         }
      } else if (var2 < 5000) {
         if ((var2 %= 1000) != (2 ^ 3) && var2 != (1 ^ 3) && var2 != --3 && var2 != 7 && var2 != 9 && var2 != 11) {
            if (var1 == 0) {
               return 16;
            } else {
               return var1 == (3 & 5) ? 18 : 17;
            }
         } else if (var1 == 0) {
            return 16;
         } else {
            return var1 == 5 >> 2 ? 18 : 19;
         }
      } else {
         return -1;
      }
   }

   public static String a(String var0, Skill var1, double var2) {
      return var0.replace("{公式一}", String.valueOf(Arith.b(Double.parseDouble(var1.getGrow()), var2)));
   }

   public static void b(PrivateData var0, BigDecimal var1) {
      String[] var2 = var0.getSkill("S");
      String[] var6 = getSepciesS(getSepciesN(var1));
      if (var2 != null) {
         StringBuffer var3 = new StringBuffer();

         int var4;
         for(int var10000 = var4 = 3 ^ 3; var10000 < var2.length; var10000 = var4) {
            String[] var5 = var2[var4].split("_");
            if (var3.length() != 0) {
               var3.append("#");
            }

            var3.append(d(Integer.parseInt(var5[2 & 5]), var6));
            var3.append("_");
            int var10004 = 2 ^ 3;
            ++var4;
            var3.append(var5[var10004]);
         }

         var0.setSkills("S", var3.toString());
      }

   }

   public static String getSkillBySMText(int var0) {
      return var0 < skillText.length ? skillText[var0] : null;
   }

   public static int getSmIndex(String var0) {
      if (var0.equals("混")) {
         return 3 >> 1;
      } else if (var0.equals("冰")) {
         return --2;
      } else if (var0.equals("睡")) {
         return --3;
      } else if (var0.equals("毒")) {
         return --4;
      } else if (var0.equals("震")) {
         return --5;
      } else if (var0.equals("攻")) {
         return 62 & 71;
      } else if (var0.equals("盘")) {
         return 39 & 95;
      } else if (var0.equals("速")) {
         return 46 & 89;
      } else if (var0.equals("风")) {
         return 93 & 43;
      } else if (var0.equals("雷")) {
         return 107 & 30;
      } else if (var0.equals("水")) {
         return 63 & 75;
      } else if (var0.equals("火")) {
         return 79 & 60;
      } else if (var0.equals("冥")) {
         return 125 & 15;
      } else if (var0.equals("蛊")) {
         return 63 & 78;
      } else if (var0.equals("忘")) {
         return 111 & 31;
      } else if (var0.equals("惑")) {
         return 60 & 83;
      } else if (var0.equals("劈")) {
         return 51 & 93;
      } else if (var0.equals("涌")) {
         return 26 & 119;
      } else if (var0.equals("雨")) {
         return 23 & 123;
      } else {
         return var0.equals("摇") ? 126 & 21 : 0;
      }
   }

   public static int getFMIndex(int var0, int var1) {
      if (var0 == 5 >> 2) {
         if (var1 == 0) {
            return 5 >> 2;
         } else {
            return var1 == (2 ^ 3) ? 1 ^ 3 : 3;
         }
      } else if (var0 == --2) {
         if (var1 == 0) {
            return 2 ^ 3;
         } else {
            return var1 == (3 & 5) ? --3 : 4;
         }
      } else if (var0 == --3) {
         if (var1 == 0) {
            return --5;
         } else {
            return var1 == (3 & 5) ? 7 & 126 : 7;
         }
      } else if (var0 == --4) {
         if (var1 == 0) {
            return 45 & 90;
         } else {
            return var1 == (2 ^ 3) ? 105 & 31 : 7;
         }
      } else if (var0 != --5 && var0 != (39 & 94)) {
         if (var0 == (111 & 23)) {
            if (var1 == 0) {
               return 59 & 79;
            } else {
               return var1 == 3 >> 1 ? 31 & 109 : 14;
            }
         } else if (var0 == (45 & 90)) {
            if (var1 == 0) {
               return 121 & 14;
            } else {
               return var1 == (3 & 5) ? 15 & 123 : 15;
            }
         } else if (var0 != (41 & 95) && var0 != (95 & 42)) {
            return 0;
         } else if (var1 == 0) {
            return 81 & 62;
         } else {
            return var1 == 5 >> 2 ? 115 & 29 : 18;
         }
      } else if (var1 == 0) {
         return 74 & 63;
      } else {
         return var1 == 5 >> 2 ? 127 & 11 : 12;
      }
   }

   public static String getSkillMsg(int var0) {
      return var0 < skillMsg.length ? skillMsg[var0] : null;
   }

   public static String getSkillSM(String var0, lg var1) {
      Skill var2;
      if ((var2 = var1.bg(var0)) == null) {
         return null;
      } else {
         int var3;
         if ((var3 = Integer.parseInt(var2.getSkillid())) > (6137 & 27630) && var3 <= (15710 & 18157)) {
            return skillMsg[(var3 - (4073 & 29695)) / --5];
         } else if (var3 > (30511 & 11256) && var3 <= (16306 & 26461)) {
            return "套装";
         } else {
            return var3 > (16377 & 28390) && var3 <= (16092 & 29675) ? "法门" : null;
         }
      }
   }

   public static String getSepciesNameByIndex(int var0) {
      if (var0 == (2 ^ 3)) {
         return "男人";
      } else if (var0 == 5 >> 1) {
         return "女人";
      } else if (var0 == --3) {
         return "男魔";
      } else if (var0 == --4) {
         return "女魔";
      } else if (var0 == --5) {
         return "男仙";
      } else if (var0 == (15 & 118)) {
         return "女仙";
      } else if (var0 == (55 & 79)) {
         return "男鬼";
      } else if (var0 == (29 & 106)) {
         return "女鬼";
      } else if (var0 == (31 & 105)) {
         return "男龙";
      } else {
         return var0 == (42 & 95) ? "女龙" : "未知";
      }
   }

   public static String c(String var0, String var1, int var2, int var3) {
      String var4 = null;
      if (var0.startsWith("数值")) {
         int var5 = var0.length() > --2 ? hd.b(var0, 5 >> 1, var0.length()) - (3 >> 1) : 0;
         double var6 = 0.0D;
         if (var2 == (28599 & 6269)) {
            var6 = (double)((2 ^ 3) * var3);
         } else if (var2 == (15990 & 18879)) {
            var6 = (double)((1 ^ 3) * var3);
         } else if (var2 == (15735 & 19135)) {
            var6 = 0.5D * (double)var3;
         } else if (var2 == (31613 & 3258)) {
            var6 = (double)((3 & 5) * var3);
         } else if (var2 == (6845 & 28027)) {
            var6 = var5 == 0 ? 0.2D * (double)var3 : (double)(500 * var3);
         } else if (var2 == (19003 & 15870)) {
            var6 = var5 == 0 ? 0.4D * (double)var3 : (double)(1000 * var3);
         } else if (var2 == (23423 & 11451)) {
            var6 = var5 == 0 ? 0.2D * (double)var3 : (var5 == --1 ? (double)((100 & 127) * var3) : (var5 == (1 ^ 3) ? 1.2D * (double)var3 : (double)(600 * var3)));
         } else if (var2 == (23292 & 11583)) {
            var6 = var5 == 0 ? 0.3D * (double)var3 : (var5 == 3 >> 1 ? (double)((29434 & 3533) * var3) : (var5 == --2 ? 1.8D * (double)var3 : (double)(1200 * var3)));
         } else if (var2 == (2877 & 31999)) {
            var6 = var5 == 0 ? (double)((109 & 63) + var3) : (var5 == (3 & 5) ? (double)((5 >> 1) * var3) : 1.5D * (double)var3);
         } else if (var2 == (20159 & 14718)) {
            var6 = (double)(var5 == 0 ? (109 & 63) + var3 : (var5 == --1 ? --4 * var3 : 3 * var3));
         } else if (var2 == (19455 & 15423)) {
            var6 = var5 == 0 ? 22.5D + 0.5D * (double)var3 : (double)(var5 == (4 ^ 5) ? (1 ^ 3) * var3 : 1 * var3);
         } else if (var2 == (8137 & 26742)) {
            var6 = var5 == 0 ? 22.5D + 0.5D * (double)var3 : (var5 == 5 >> 2 ? (double)(--3 * var3) : 1.5D * (double)var3);
         } else if (var2 == 2113) {
            var6 = var5 == 0 ? (double)(--3 * var3) : 1.5D * (double)var3;
         } else if (var2 == 2114) {
            var6 = (double)(var5 == 0 ? --5 * var3 : 3 * var3);
         } else if (var2 == 2115) {
            var6 = (double)(var5 == 0 ? (5 >> 1) * var3 : (var5 == --1 ? 45 + var3 : 90 + var3));
         } else if (var2 == 2116) {
            var6 = (double)(var5 == 0 ? --3 * var3 : (var5 == (4 ^ 5) ? 60 + var3 : 105 + var3));
         } else if (var2 == 2117) {
            var6 = 0.6D * (double)var3;
         } else if (var2 == 2118) {
            var6 = (double)((3 & 5) * var3);
         } else if (var2 == 2119) {
            var6 = 0.8D * (double)var3;
         } else if (var2 == 2120) {
            var6 = 1.6D * (double)var3;
         } else if (var2 == 2121) {
            var6 = var5 == 0 ? (double)(30 + var3) : (var5 == 3 >> 1 ? 0.6D * (double)var3 : (double)(3000 * var3));
         } else if (var2 == 2122) {
            var6 = (double)(var5 == 0 ? 30 + var3 : (var5 == (3 & 5) ? (3 & 5) * var3 : 5000 * var3));
         } else if (var2 == 2123) {
            var6 = var5 == 0 ? (double)(30 + var3) : 0.2D * (double)var3;
         } else if (var2 == 2124) {
            var6 = var5 == 0 ? (double)(30 + var3) : 0.4D * (double)var3;
         } else if (var2 == 2125) {
            var6 = var5 == 0 ? (double)(60 + var3) : 0.6D * (double)var3;
         } else if (var2 == 2126) {
            var6 = (double)(var5 == 0 ? 60 + var3 : 1 * var3);
         } else if (var2 == 2127) {
            var6 = 0.1D * (double)var3;
         } else if (var2 == 2128) {
            var6 = 0.2D * (double)var3;
         } else if (var2 == 2129) {
            var6 = var5 == 0 ? (double)(--3 * var3) : 0.6D * (double)var3;
         } else if (var2 == 2130) {
            var6 = (double)(var5 == 0 ? --4 * var3 : 1 * var3);
         } else if (var2 == 2131) {
            var6 = var5 == 0 ? (double)(--3 * var3) : 0.6D * (double)var3;
         } else if (var2 == 2132) {
            var6 = (double)(var5 == 0 ? 4 * var3 : 1 * var3);
         } else if (var2 == 2133) {
            var6 = (double)((4 ^ 5) * var3);
         } else if (var2 == 2134) {
            var6 = 1.5D * (double)var3;
         } else if (var2 == 2135) {
            var6 = var5 == 0 ? (double)(3 * var3) : 0.6D * (double)var3;
         } else if (var2 == 2136) {
            var6 = (double)(var5 == 0 ? 5 * var3 : 1 * var3);
         } else if (var2 == 2137) {
            var6 = (double)(3 * var3);
         } else if (var2 == 2138) {
            var6 = (double)(5 * var3);
         } else if (var2 == 2139) {
            var6 = (double)(var5 == 0 ? 2 * var3 : 1 * var3);
         } else if (var2 == 2140) {
            var6 = (double)(var5 == 0 ? 3 * var3 : 2 * var3);
         } else if (var2 == 2141) {
            var6 = (double)(var5 == 0 ? 2 * var3 : 1 * var3);
         } else if (var2 == 2142) {
            var6 = (double)(var5 == 0 ? 3 * var3 : 2 * var3);
         } else if (var2 == 2143) {
            var6 = var5 == 0 ? (double)(30 + var3) : (var5 == (2 ^ 3) ? 9.0D + 0.6D * (double)var3 : (double)('負' + 2400 * var3));
         } else if (var2 == 2144) {
            var6 = (double)(var5 == 0 ? 45 + var3 : (var5 == 3 >> 1 ? 15 + (3 >> 1) * var3 : '\uea60' + 4000 * var3));
         } else if (var2 == 2145) {
            var6 = var5 == 0 ? 0.6D * (double)var3 : 0.4D * (double)var3;
         } else if (var2 == 2146) {
            var6 = var5 == 0 ? 0.6D * (double)var3 : 0.6D * (double)var3;
         }

         var4 = hd.ak(var6, 4 ^ 5) + "%";
      }

      return var4 == null ? var1 : var1.replace("{" + var0 + "}", var4);
   }

   public static String getSkillBySM(int var0) {
      return var0 < skillSM.length ? skillSM[var0] : null;
   }

   public static String getSmKey(int var0) {
      if (var0 == (2 ^ 3)) {
         return "混";
      } else if (var0 == (1 ^ 3)) {
         return "冰";
      } else if (var0 == --3) {
         return "睡";
      } else if (var0 == --4) {
         return "毒";
      } else if (var0 == --5) {
         return "震";
      } else if (var0 == (78 & 55)) {
         return "攻";
      } else if (var0 == (87 & 47)) {
         return "盘";
      } else if (var0 == (30 & 105)) {
         return "速";
      } else if (var0 == (127 & 9)) {
         return "风";
      } else if (var0 == (74 & 63)) {
         return "雷";
      } else if (var0 == (43 & 95)) {
         return "水";
      } else if (var0 == (46 & 93)) {
         return "火";
      } else if (var0 == (95 & 45)) {
         return "冥";
      } else if (var0 == (78 & 63)) {
         return "蛊";
      } else if (var0 == (47 & 95)) {
         return "忘";
      } else if (var0 == (22 & 121)) {
         return "惑";
      } else if (var0 == (63 & 81)) {
         return "劈";
      } else if (var0 == (122 & 23)) {
         return "涌";
      } else if (var0 == (31 & 115)) {
         return "雨";
      } else {
         return var0 == (28 & 119) ? "摇" : "?";
      }
   }

   public static String[] getSepciesS(String var0) {
      String[] var10000;
      boolean var10002;
      if (var0.equals("男鬼")) {
         var10000 = new String[--3];
         var10002 = true;
         var10000[3 >> 2] = "遗忘";
         var10000[4 ^ 5] = "鬼火";
         var10000[--2] = "三尸虫";
         return var10000;
      } else if (var0.equals("女鬼")) {
         var10000 = new String[--3];
         var10002 = true;
         var10000[3 >> 2] = "遗忘";
         var10000[3 >> 1] = "鬼火";
         var10000[1 ^ 3] = "魅惑";
         return var10000;
      } else if (var0.equals("男仙")) {
         var10000 = new String[--3];
         var10002 = true;
         var10000[3 ^ 3] = "雷";
         var10000[--1] = "水";
         var10000[1 ^ 3] = "风";
         return var10000;
      } else if (var0.equals("女仙")) {
         var10000 = new String[--3];
         var10002 = true;
         var10000[3 ^ 3] = "雷";
         var10000[3 >> 1] = "水";
         var10000[5 >> 1] = "火";
         return var10000;
      } else if (var0.equals("男魔")) {
         var10000 = new String[--3];
         var10002 = true;
         var10000[3 ^ 3] = "震慑";
         var10000[2 ^ 3] = "加攻";
         var10000[--2] = "加速";
         return var10000;
      } else if (var0.equals("女魔")) {
         var10000 = new String[--3];
         var10002 = true;
         var10000[5 >> 3] = "震慑";
         var10000[2 ^ 3] = "加攻";
         var10000[1 ^ 3] = "盘丝";
         return var10000;
      } else if (var0.equals("男人")) {
         var10000 = new String[--3];
         var10002 = true;
         var10000[3 ^ 3] = "封印";
         var10000[4 ^ 5] = "昏睡";
         var10000[--2] = "混乱";
         return var10000;
      } else if (var0.equals("女人")) {
         var10000 = new String[--3];
         var10002 = true;
         var10000[5 >> 3] = "封印";
         var10000[--1] = "昏睡";
         var10000[--2] = "毒";
         return var10000;
      } else if (var0.equals("男龙")) {
         var10000 = new String[3];
         var10002 = true;
         var10000[3 ^ 3] = "霹雳";
         var10000[5 >> 2] = "甘霖";
         var10000[2] = "扶摇";
         return var10000;
      } else if (var0.equals("女龙")) {
         var10000 = new String[3];
         var10002 = true;
         var10000[3 & 4] = "霹雳";
         var10000[3 & 5] = "甘霖";
         var10000[2] = "沧波";
         return var10000;
      } else {
         return null;
      }
   }

   public static int d(int var0, String[] var1) {
      int var2 = 3 & 4;
      String[] var10000;
      byte var4;
      if (var0 >= (8174 & 25599) && var0 <= (31739 & 2038) || var0 >= (25918 & 7895) && var0 <= (25662 & 8155) || var0 >= (29693 & 4095) && var0 <= (31935 & 1857) || var0 >= (22143 & 11695) && var0 <= (22271 & 11571) || var0 >= (17723 & 16125) && var0 <= (32125 & 1727)) {
         var4 = 0;
         var10000 = var1;
      } else if ((var0 < (17407 & 16371) || var0 > (24567 & 9215)) && (var0 < (20027 & 13791) || var0 > (26079 & 7743)) && (var0 < (5262 & 28531) || var0 > (3222 & 30575)) && (var0 < 1061 || var0 > 1065) && (var0 < 1071 || var0 > 1075) && (var0 < 1091 || var0 > 1095)) {
         var4 = 2;
         var10000 = var1;
      } else {
         var4 = 1;
         var10000 = var1;
      }

      String var3 = var10000[var4];
      if ((var2 = var0 % --5) == 0) {
         var2 = --5;
      }

      if (var3.equals("封印")) {
         return var0 = 1005 + var2;
      } else if (var3.equals("昏睡")) {
         return var0 = 1010 + var2;
      } else if (var3.equals("混乱")) {
         return var0 = 1000 + var2;
      } else if (var3.equals("毒")) {
         return var0 = 1015 + var2;
      } else if (var3.equals("雷")) {
         return var0 = 1045 + var2;
      } else if (var3.equals("水")) {
         return var0 = 1050 + var2;
      } else if (var3.equals("风")) {
         return var0 = 1040 + var2;
      } else if (var3.equals("火")) {
         return var0 = 1055 + var2;
      } else if (var3.equals("震慑")) {
         return var0 = 1020 + var2;
      } else if (var3.equals("加攻")) {
         return var0 = 1025 + var2;
      } else if (var3.equals("加速")) {
         return var0 = 1035 + var2;
      } else if (var3.equals("盘丝")) {
         return var0 = 1030 + var2;
      } else if (var3.equals("遗忘")) {
         return var0 = 1070 + var2;
      } else if (var3.equals("鬼火")) {
         return var0 = 1060 + var2;
      } else if (var3.equals("三尸虫")) {
         return var0 = 1065 + var2;
      } else if (var3.equals("魅惑")) {
         return var0 = 1075 + var2;
      } else if (var3.equals("霹雳")) {
         return var0 = 1080 + var2;
      } else if (var3.equals("沧波")) {
         return var0 = 1085 + var2;
      } else if (var3.equals("甘霖")) {
         return var0 = 1090 + var2;
      } else {
         if (var3.equals("扶摇")) {
            var0 = 1095 + var2;
         }

         return var0;
      }
   }

   public static String getSepciesN(BigDecimal var0) {
      int var1;
      if ((var1 = var0.intValue()) != (23003 & 32765) && var1 != (23546 & 32223) && var1 != (32735 & 23035) && var1 != (24031 & 31743)) {
         if (var1 != (31197 & 24574) && var1 != (24543 & 31229) && var1 != (23038 & 32735) && var1 != (32763 & 23012)) {
            if (var1 != (24571 & 32197) && var1 != (24527 & 32242) && var1 != (32247 & 24523) && var1 != (24535 & 32239)) {
               if (var1 != (24004 & 32767) && var1 != (24055 & 32717) && var1 != (24551 & 32222) && var1 != (32717 & 24058)) {
                  if (var1 != 22001 && var1 != 22002 && var1 != 22003 && var1 != 22007 && var1 != 22009 && var1 != 22011) {
                     if (var1 != 22004 && var1 != 22005 && var1 != 22006 && var1 != 22008 && var1 != 22010 && var1 != 22012) {
                        if (var1 != 21001 && var1 != 21002 && var1 != 21003 && var1 != 21007 && var1 != 21009 && var1 != 21011) {
                           if (var1 != 21004 && var1 != 21005 && var1 != 21006 && var1 != 21008 && var1 != 21010 && var1 != 21012) {
                              if (var1 != 20001 && var1 != 20002 && var1 != 20003 && var1 != 20007 && var1 != 20009 && var1 != 20011) {
                                 return var1 != 20004 && var1 != 20005 && var1 != 20006 && var1 != 20008 && var1 != 20010 && var1 != 20012 ? null : "女人";
                              } else {
                                 return "男人";
                              }
                           } else {
                              return "女魔";
                           }
                        } else {
                           return "男魔";
                        }
                     } else {
                        return "女仙";
                     }
                  } else {
                     return "男仙";
                  }
               } else {
                  return "女龙";
               }
            } else {
               return "男龙";
            }
         } else {
            return "女鬼";
         }
      } else {
         return "男鬼";
      }
   }

   public static double getFMSld(double var0) {
      if (var0 <= 2000.0D) {
         return -3000.0D + var0 * 2.0D;
      } else if (var0 <= 4000.0D) {
         return 1000.0D + (var0 - 2000.0D) * 1.9D;
      } else if (var0 <= 6000.0D) {
         return 4800.0D + (var0 - 4000.0D) * 1.8D;
      } else {
         return var0 <= 8000.0D ? 8400.0D + (var0 - 6000.0D) * 1.7D : 11800.0D + (var0 - 8000.0D) * 1.6D;
      }
   }

   static {
      String[] var10000 = new String[124 & 23];
      boolean var10002 = true;
      var10000[3 >> 2] = "混";
      var10000[--1] = "冰";
      var10000[--2] = "睡";
      var10000[--3] = "毒";
      var10000[--4] = "慑";
      var10000[--5] = "牛";
      var10000[127 & 6] = "盘";
      var10000[63 & 71] = "速";
      var10000[107 & 28] = "风";
      var10000[31 & 105] = "雷";
      var10000[123 & 14] = "水";
      var10000[11 & 127] = "火";
      var10000[29 & 110] = "冥";
      var10000[77 & 63] = "蛊";
      var10000[111 & 30] = "忘";
      var10000[15 & 127] = "魅";
      var10000[53 & 90] = "霹";
      var10000[53 & 91] = "沧";
      var10000[30 & 115] = "霖";
      var10000[63 & 83] = "摇";
      skillMsg = var10000;
      var10000 = new String[20 & 127];
      var10002 = true;
      var10000[3 ^ 3] = "化生寺";
      var10000[--1] = "将军府";
      var10000[1 ^ 3] = "方寸山";
      var10000[--3] = "女儿村";
      var10000[--4] = "黑水河";
      var10000[--5] = "魔王寨";
      var10000[6] = "盘丝洞";
      var10000[7] = "狮驼岭";
      var10000[8] = "五庄观";
      var10000[9] = "天宫";
      var10000[10] = "龙宫";
      var10000[11] = "普陀山";
      var10000[12] = "白骨洞";
      var10000[13] = "大雁塔";
      var10000[14] = "阴都殿";
      var10000[15] = "兰若寺";
      var10000[16] = "流州";
      var10000[17] = "瀛洲";
      var10000[18] = "蓬莱";
      var10000[19] = "方壶";
      skillSM = var10000;
      var10000 = new String[20];
      var10002 = true;
      var10000[3 ^ 3] = "空度禅师";
      var10000[--1] = "程咬金";
      var10000[--2] = "菩提祖师";
      var10000[--3] = "孙婆婆";
      var10000[--4] = "黑水蛟王";
      var10000[--5] = "牛魔王";
      var10000[6] = "盘丝娘娘";
      var10000[7] = "大大王";
      var10000[8] = "镇元大仙";
      var10000[9] = "太上老君";
      var10000[10] = "东海龙王";
      var10000[11] = "观音姐姐";
      var10000[12] = "白骨之灵";
      var10000[13] = "三尸神";
      var10000[14] = "王万平";
      var10000[15] = "聂小倩";
      var10000[16] = "天柱";
      var10000[17] = "沧澜之眼";
      var10000[18] = "龙首木";
      var10000[19] = "摆尾瞧";
      skillSF = var10000;
      var10000 = new String[20];
      var10002 = true;
      var10000[2 & 5] = "混乱";
      var10000[--1] = "冰冻";
      var10000[5 >> 1] = "昏睡";
      var10000[--3] = "毒系";
      var10000[--4] = "震慑";
      var10000[--5] = "强力";
      var10000[6] = "加防";
      var10000[7] = "急速";
      var10000[8] = "风";
      var10000[9] = "雷";
      var10000[10] = "水";
      var10000[11] = "火";
      var10000[12] = "鬼火";
      var10000[13] = "三尸虫";
      var10000[14] = "遗忘";
      var10000[15] = "魅惑";
      var10000[16] = "流周";
      var10000[17] = "瀛洲";
      var10000[18] = "蓬莱";
      var10000[19] = "方壶";
      skillText = var10000;
   }

   public static String getFMMsg(int var0) {
      if (var0 == (4 ^ 5)) {
         return "适合血抗型人族#r使用技能提高自身的受到的伤害减免和仙法鬼火物理抗性，提升自身的生存能力。";
      } else if (var0 == 5 >> 1) {
         return "适合辅助型人族#r使敌方目标在受到伤害时受到额外伤害，提高队伍输出能力。";
      } else if (var0 == --3) {
         return "适合控制型人族#r降低目标师门法术的命中几率，提高自己的控制能力。";
      } else if (var0 == --4) {
         return "适合物理型人族#r提高自身攻击力/忽视防御和命中，攻击时有几率额外分裂攻击和忽视敌方躲闪/反震/反击。";
      } else if (var0 == --5) {
         return "适合综合型魔族#r增加自身和队友的法术命中几率和法术躲闪几率，提升队伍整体战斗能力。";
      } else if (var0 == (78 & 55)) {
         return "适合物理型魔族#r提高自身攻击力和仙法人法抗性，攻击时有几率额外分裂攻击，造成额外的物理伤害。";
      } else if (var0 == (95 & 39)) {
         return "适合辅助型魔族#r增加己方召唤兽的属性和进场的机会，提升自己的辅助能力。";
      } else if (var0 == (13 & 122)) {
         return "适合防御型魔族#r增加自身及队友的法术躲闪几率和伤害减免，提升队伍的防御能力。";
      } else if (var0 == (31 & 105)) {
         return "适合物理型魔族#r提高自身攻击力和速度，攻击时有几率额外分裂攻击和回复己方单位气血。";
      } else if (var0 == (30 & 107)) {
         return "适合压制型仙族#r增加自身及队友的法术命中和法术暴击几率，提升队伍的持续战斗能力。";
      } else if (var0 == (59 & 79)) {
         return "适合爆发型仙族及鬼族#r加深敌方受到自己和队友的伤害，提升队伍的整体输出能力。";
      } else if (var0 == (47 & 92)) {
         return "适合稳定型仙族#r使自己及队友造成的伤害按一定百分比转化为圣神伤害，提升队伍的整体输出能力。";
      } else if (var0 == (77 & 63)) {
         return "适合回复型鬼族#r为己方单位回复气血时额外增加护盾，提升队伍的生存能力。";
      } else if (var0 == (95 & 46)) {
         return "适合血抗型鬼族#r增加自身人法抗性/法术躲闪几率和反震，提高自身的生存能力。";
      } else if (var0 == (15 & 127)) {
         return "适合控制型鬼族#r降低敌方目标造成的伤害，提升队伍的整体防御能力。";
      } else if (var0 == (117 & 26)) {
         return "适合辅助型龙族#r使己方单位击杀敌方单位时恢复己方气血，提高己方生存能力。";
      } else if (var0 == (31 & 113)) {
         return "适合输出型龙族#r使自己造成的伤害转化为神圣伤害，提升自己的输出能力。";
      } else {
         return var0 == (82 & 63) ? "适合输出型龙族#r提高自己连击时的伤害和连击几率，提升自己的输出能力。" : "";
      }
   }

   public static void e(StringBuffer var0, String var1, Skill var2, int var3) {
      String var10000 = var1;
      double var4 = Double.parseDouble(var2.getValue());
      double var6 = Double.parseDouble(var2.getGrow());
      int var11 = 3 ^ 3;
      int var8 = 3 >> 2;

      int var9;
      for(var9 = 5 >> 3; (var11 = var10000.indexOf("{公式", var9)) != -4 >> 2; var10000 = var1) {
         var0.append(var1.substring(var9, var11));
         var8 = var1.indexOf("}", var11 + --3);
         String var10 = var1.substring(var11 + --3, var8);
         var0.append("#R");
         StringBuffer var12;
         switch(var10.hashCode()) {
         case 19968:
            while(false) {
            }

            if (!var10.equals("一")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 + var6 * (double)var3));
            }
            break;
         case 19971:
            if (!var10.equals("七")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 + var6 * (double)var3 * 2.0D));
            }
            break;
         case 19977:
            if (!var10.equals("三")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 0.375D));
            }
            break;
         case 20061:
            if (!var10.equals("九")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 - var6 * (double)var3));
            }
            break;
         case 20108:
            if (!var10.equals("二")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 2.5D));
            }
            break;
         case 20116:
            if (!var10.equals("五")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 3.0D));
            }
            break;
         case 20843:
            if (!var10.equals("八")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 + var6 * (double)var3 * 0.5D));
            }
            break;
         case 20845:
            if (!var10.equals("六")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 500.0D));
            }
            break;
         case 21313:
            if (!var10.equals("十")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(50.0D + var4 + var6 * (double)var3));
            }
            break;
         case 22235:
            if (!var10.equals("四")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 + (double)var3));
            }
            break;
         case 640414:
            if (!var10.equals("七十")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)(3 * var3)));
            }
            break;
         case 640600:
            if (!var10.equals("三十")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 0.008D));
            }
            break;
         case 644661:
            if (!var10.equals("二十")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 2.5D));
            }
            break;
         case 644909:
            if (!var10.equals("五十")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)((126 & 31) + (111 & 26) * var3)));
            }
            break;
         case 667508:
            if (!var10.equals("六十")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)(5 * var3)));
            }
            break;
         case 680671:
            if (!var10.equals("十一")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 10.0D));
            }
            break;
         case 680674:
            if (!var10.equals("十七")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(10000.0D + var6 * (double)var3 * 250.0D));
            }
            break;
         case 680680:
            if (!var10.equals("十三")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 800.0D));
            }
            break;
         case 680764:
            if (!var10.equals("十九")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 1000.0D));
            }
            break;
         case 680811:
            if (!var10.equals("十二")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 / 24000.0D));
            }
            break;
         case 680819:
            if (!var10.equals("十五")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 + (double)Math.min(var3, --3)));
            }
            break;
         case 681546:
            if (!var10.equals("十八")) {
               var12 = var0;
            } else {
               var0.append(jb.d(13000.0D + var6 * (double)(var3 <= --4 ? --4 : var3 + (2 ^ 3)) * 500.0D));
               var12 = var0;
            }
            break;
         case 681548:
            if (!var10.equals("十六")) {
               var12 = var0;
            } else {
               var0.append(jb.d(var4 + (double)(var3 > --3 ? var3 - --3 : 0) - 2.0D));
               var12 = var0;
            }
            break;
         case 682938:
            if (!var10.equals("十四")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 / 6.0D));
            }
            break;
         case 19872802:
            if (!var10.equals("七十一")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)(4 * var3)));
            }
            break;
         case 19872805:
            if (!var10.equals("七十七")) {
               var12 = var0;
               break;
            } else {
               var0.append(jb.d((double)(3 + var3)));
            }
         default:
            var12 = var0;
            break;
         case 19872811:
            if (!var10.equals("七十三")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(0.1D * (double)var3));
            }
            break;
         case 19872942:
            if (!var10.equals("七十二")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)((30 & 103) * var3)));
            }
            break;
         case 19872950:
            if (!var10.equals("七十五")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 0.375D));
            }
            break;
         case 19873679:
            if (!var10.equals("七十六")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 2.0D));
            }
            break;
         case 19875069:
            if (!var10.equals("七十四")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(0.2D * (double)var3));
            }
            break;
         case 19878568:
            if (!var10.equals("三十一")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(50.0D + var4 - var6 * (double)var3));
            }
            break;
         case 19878571:
            if (!var10.equals("三十七")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)(var3 + (2 ^ 3)) * 10000.0D));
            }
            break;
         case 19878577:
            if (!var10.equals("三十三")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)((5 >> 1) * var3)));
            }
            break;
         case 19878708:
            if (!var10.equals("三十二")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(20.0D + var4 + var6 * (double)var3));
            }
            break;
         case 19878716:
            if (!var10.equals("三十五")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(60.0D + var6 * (double)var3 * 5.0D));
            }
            break;
         case 19879443:
            if (!var10.equals("三十八")) {
               var12 = var0;
            } else {
               var0.append(jb.d((double)(var3 <= 5 >> 1 ? --1 : (var3 <= --4 ? 1 ^ 3 : 3))));
               var12 = var0;
            }
            break;
         case 19879445:
            if (!var10.equals("三十六")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)(var3 + (5 >> 2))));
            }
            break;
         case 19880835:
            if (!var10.equals("三十四")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 * var6 * (double)var3 * 600.0D));
            }
            break;
         case 20004459:
            if (!var10.equals("二十一")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 0.4D));
            }
            break;
         case 20004462:
            if (!var10.equals("二十七")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 3000.0D));
            }
            break;
         case 20004468:
            if (!var10.equals("二十三")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 0.25D));
            }
            break;
         case 20004552:
            if (!var10.equals("二十九")) {
               var12 = var0;
            } else {
               var0.append(jb.d(100.0D / (var3 <= 5 >> 1 ? var6 * (double)var3 * 10.0D : (double)(10 + --5 * var3))));
               var12 = var0;
            }
            break;
         case 20004599:
            if (!var10.equals("二十二")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 * 2.5D + var6 * (double)var3));
            }
            break;
         case 20004607:
            if (!var10.equals("二十五")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(25.0D + var6 * (double)var3 * 2.5D));
            }
            break;
         case 20005334:
            if (!var10.equals("二十八")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 * 1500.0D + var6 * (double)var3 * 3000.0D));
            }
            break;
         case 20005336:
            if (!var10.equals("二十六")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 + var6 * (double)var3 * 5.0D));
            }
            break;
         case 20006726:
            if (!var10.equals("二十四")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var6 * (double)var3 * 0.75D));
            }
            break;
         case 20012147:
            if (!var10.equals("五十一")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 5.0D));
            }
            break;
         case 20012150:
            if (!var10.equals("五十七")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) / 3.0D * 10.0D));
            }
            break;
         case 20012156:
            if (!var10.equals("五十三")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 15.0D));
            }
            break;
         case 20012240:
            if (!var10.equals("五十九")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)((55 & 127) + --5 * var3)));
            }
            break;
         case 20012287:
            if (!var10.equals("五十二")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)(--5 + var3)));
            }
            break;
         case 20012295:
            if (!var10.equals("五十五")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 10.0D));
            }
            break;
         case 20013022:
            if (!var10.equals("五十八")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 6.0D));
            }
            break;
         case 20013024:
            if (!var10.equals("五十六")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 3.75D));
            }
            break;
         case 20014414:
            if (!var10.equals("五十四")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 4.0D));
            }
            break;
         case 20712716:
            if (!var10.equals("六十一")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 3.0D));
            }
            break;
         case 20712719:
            if (!var10.equals("六十七")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)((12053 & 30714) + (22512 & 12255) * var3)));
            }
            break;
         case 20712725:
            if (!var10.equals("六十三")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((var4 + var6 * (double)var3) * 8.0D));
            }
            break;
         case 20712809:
            if (!var10.equals("六十九")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)(2 * var3)));
            }
            break;
         case 20712856:
            if (!var10.equals("六十二")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)(--1 + var3)));
            }
            break;
         case 20712864:
            if (!var10.equals("六十五")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)((62 & 115) + 5 * var3)));
            }
            break;
         case 20713591:
            if (!var10.equals("六十八")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d(var4 + var6 * (double)var3 + var6));
            }
            break;
         case 20713593:
            if (!var10.equals("六十六")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)((63 & 119) + var3)));
            }
            break;
         case 20714983:
            if (!var10.equals("六十四")) {
               var12 = var0;
            } else {
               var12 = var0;
               var0.append(jb.d((double)((78 & 59) + 2 * var3)));
            }
         }

         var12.append("#G");
         var9 = var8 + (2 ^ 3);
      }

      var0.append(var1.substring(var9));
   }

   public static String getSkillBySMSF(int var0) {
      return var0 < skillSF.length ? skillSF[var0] : null;
   }

   public static String f(int var0, double var1, double var3, double var5) {
      if (var0 == --1) {
         var1 += var3 * var5;
      } else if (var0 == 5 >> 1) {
         var1 = (var1 + var3 * var5) * 1.68D;
      } else if (var0 == --3) {
         var1 = (var1 + var3 * var5) * 2.75D;
      } else if (var0 == --4) {
         var1 = 8.6D + 8.75E-4D * var5;
      } else if (var0 == --5) {
         var1 = (8.6D + 8.75E-4D * var5) * 0.7D;
      } else if (var0 == (95 & 38)) {
         var1 = (var1 + var3 * var5) * 3.36D;
      } else if (var0 == (71 & 63)) {
         var1 = (var1 + var3 * var5) * 2.88D;
      } else if (var0 == (24 & 111)) {
         var1 = 6.4D + 6.4E-4D * var5;
      } else if (var0 == (45 & 91)) {
         var1 = 2.8D + 2.9E-4D * var5;
      } else if (var0 == (26 & 111)) {
         var1 = 12.5D + 0.00124D * var5;
      } else if (var0 == (95 & 43)) {
         var1 = (12.5D + 0.00124D * var5) * 0.67D;
      } else if (var0 == (46 & 93)) {
         var1 = (double)((int)(21.6D + 0.00216D * var5));
      } else if (var0 == (45 & 95)) {
         var1 = 5.5D + 5.6E-4D * var5;
      } else if (var0 == (47 & 94)) {
         var1 = 2.2D + 2.0E-4D * var5;
      } else if (var0 == (95 & 47)) {
         var1 = 18.8D + 0.00186D * var5;
      } else if (var0 == (56 & 87)) {
         var1 = 25.3D + 0.0025D * var5;
      } else if (var0 == (87 & 57)) {
         var1 = 5.4D + 5.35E-4D * var5;
      } else if (var0 == (119 & 26)) {
         var1 = 1.6D + 1.55E-4D * var5;
      } else if (var0 == (95 & 51)) {
         var1 = (var1 + var3 * var5) * 0.7D;
      } else if (var0 == (126 & 21)) {
         var1 = (var1 + var3 * var5) * 2.05D;
      } else if (var0 == (95 & 53)) {
         var1 = (var1 + var3 * var5) * 7.73D;
      } else if (var0 == 22) {
         var1 = (var1 + var3 * var5) * 19.33D;
      } else if (var0 == 23) {
         var1 = (var1 + var3 * var5) * 1.735D;
      } else if (var0 == 24) {
         var1 = (var1 + var3 * var5) * 3.76D;
      } else if (var0 == 25) {
         var1 = 18.1D + 0.0018D * var5;
      } else if (var0 == 26) {
         var1 = 13.8D + 0.0014D * var5;
      } else if (var0 == 27) {
         var1 = 7.8D + 7.9E-4D * var5;
      } else {
         var1 += var3 * var5;
      }

      return "#R" + (var1 < 1000.0D ? hd.ak(var1, 4 ^ 5) : (int)var1) + "#G";
   }

   public static int getFMMax(int var0, GameClient var1) {
      if (var1.gameType == 5 >> 1) {
         if (var0 >= (10225 & 23022)) {
            return 32731 & 10036;
         } else if (var0 >= (14299 & 18943)) {
            return 32630 & 8137;
         } else if (var0 >= (18942 & 14295)) {
            return 6141 & 32626;
         } else {
            return var0 >= (11257 & 21975) ? 20476 & 16291 : 2000;
         }
      } else if (var0 >= (32757 & 510)) {
         return 16157 & 26610;
      } else if (var0 >= (7675 & 25582)) {
         return 24426 & 16341;
      } else if (var0 >= (24551 & 8696)) {
         return 24433 & 14334;
      } else {
         return var0 >= (28150 & 5087) ? 32760 & 4007 : 2000;
      }
   }

   public static String g(Skill var0, int var1) {
      int var6 = Integer.parseInt(var0.getSkillid());
      String var3 = var0.getRemark();
      StringBuffer var4 = new StringBuffer();
      int var5 = 3 >> 2;
      int var2 = 5 >> 3;
      String var10000 = var3;

      StringBuffer var9;
      while(true) {
         if ((var5 = var10000.indexOf("{", var2)) == -4 >> 2) {
            var9 = var4;
            break;
         }

         if ((var2 = var3.indexOf("}", var5 + (4 ^ 5))) == -4 >> 2) {
            var9 = var4;
            break;
         }

         String var7;
         if ((var7 = var3.substring(var5 + --1, var2)).indexOf("{") != -4 >> 2) {
            var10000 = var3;
            ++var5;
         } else {
            int var8 = var3.length();
            var3 = c(var7, var3, var6, var1);
            var2 += var3.length() - var8;
            var10000 = var3;
         }
      }

      var9.append(var3);
      return var4.toString();
   }

   public static String getFMType(int var0) {
      if (var0 == 3 >> 1) {
         return "守中";
      } else if (var0 == 5 >> 1) {
         return "血刃";
      } else if (var0 == --3) {
         return "乱神";
      } else if (var0 == --4) {
         return "神力";
      } else if (var0 == --5) {
         return "机变";
      } else if (var0 == (55 & 78)) {
         return "神力";
      } else if (var0 == (127 & 7)) {
         return "御兽";
      } else if (var0 == (9 & 126)) {
         return "戒定";
      } else if (var0 == (91 & 45)) {
         return "神力";
      } else if (var0 == (78 & 59)) {
         return "灵光";
      } else if (var0 == (15 & 123)) {
         return "攻坚";
      } else if (var0 == (29 & 110)) {
         return "破壁";
      } else if (var0 == (127 & 13)) {
         return "护持";
      } else if (var0 == (127 & 14)) {
         return "正心";
      } else if (var0 == (63 & 79)) {
         return "禁咒";
      } else if (var0 == (61 & 82)) {
         return "潜龙";
      } else if (var0 == (91 & 53)) {
         return "亢龙";
      } else {
         return var0 == (30 & 115) ? "惊龙" : "";
      }
   }

   public static int getFMCS(int var0, double var1) {
      if (var0 == --1) {
         if (var1 >= 8320.0D) {
            return --5;
         } else if (var1 >= 2160.0D) {
            return --4;
         } else {
            return var1 >= 220.0D ? --3 : 2;
         }
      } else if (var0 == --2) {
         if (var1 >= 8780.0D) {
            return 22 & 111;
         } else if (var1 >= 2760.0D) {
            return --5;
         } else {
            return var1 >= 380.0D ? --4 : 3;
         }
      } else if (var0 == --3) {
         if (var1 >= 5060.0D) {
            return --4;
         } else {
            return var1 >= 390.0D ? --3 : 2;
         }
      } else if (var0 == --4) {
         if (var1 >= 8780.0D) {
            return --4;
         } else if (var1 >= 2760.0D) {
            return --3;
         } else {
            return var1 >= 380.0D ? 1 ^ 3 : 1;
         }
      } else if (var0 == --5) {
         if (var1 >= 5060.0D) {
            return --3;
         } else {
            return var1 >= 390.0D ? 5 >> 1 : 1;
         }
      } else if (var0 == (31 & 102)) {
         if (var1 >= 8320.0D) {
            return 103 & 30;
         } else if (var1 >= 2160.0D) {
            return 5;
         } else {
            return var1 >= 220.0D ? 4 : 3;
         }
      } else if (var0 == (39 & 95)) {
         if (var1 >= 8780.0D) {
            return 31 & 103;
         } else if (var1 >= 2760.0D) {
            return 71 & 62;
         } else {
            return var1 >= 380.0D ? 5 : 4;
         }
      } else if (var0 == (110 & 25)) {
         if (var1 >= 8780.0D) {
            return 5;
         } else if (var1 >= 3860.0D) {
            return 4;
         } else {
            return var1 >= 1220.0D ? 3 : 2;
         }
      } else if (var0 == (41 & 95)) {
         if (var1 >= 8320.0D) {
            return 4;
         } else if (var1 >= 2160.0D) {
            return 3;
         } else {
            return var1 >= 220.0D ? 2 : 1;
         }
      } else if (var0 == (79 & 58)) {
         if (var1 >= 5060.0D) {
            return 126 & 7;
         } else {
            return var1 >= 390.0D ? 5 : 4;
         }
      } else if (var0 == (79 & 59)) {
         if (var1 >= 8780.0D) {
            return 5;
         } else if (var1 >= 2760.0D) {
            return 4;
         } else {
            return var1 >= 380.0D ? 3 : 2;
         }
      } else if (var0 == (78 & 61)) {
         if (var1 >= 5060.0D) {
            return 5;
         } else {
            return var1 >= 390.0D ? 4 : 3;
         }
      } else {
         return 1;
      }
   }

   public static int getSepciesIndex(BigDecimal var0) {
      int var1;
      if ((var1 = var0.intValue()) != (24543 & 31225) && var1 != (24574 & 31195) && var1 != (24063 & 31707) && var1 != (24031 & 31743)) {
         if (var1 != (32252 & 23519) && var1 != (24029 & 31743) && var1 != (31710 & 24063) && var1 != (31217 & 24558)) {
            if (var1 != (24569 & 32199) && var1 != (24539 & 32230) && var1 != (24555 & 32215) && var1 != (32231 & 24543)) {
               if (var1 != (24543 & 32228) && var1 != (24519 & 32253) && var1 != (32751 & 24022) && var1 != (32713 & 24062)) {
                  if (var1 != 22001 && var1 != 22002 && var1 != 22003 && var1 != 22007 && var1 != 22009 && var1 != 22011) {
                     if (var1 != 22004 && var1 != 22005 && var1 != 22006 && var1 != 22008 && var1 != 22010 && var1 != 22012) {
                        if (var1 != 21001 && var1 != 21002 && var1 != 21003 && var1 != 21007 && var1 != 21009 && var1 != 21011) {
                           if (var1 != 21004 && var1 != 21005 && var1 != 21006 && var1 != 21008 && var1 != 21010 && var1 != 21012) {
                              if (var1 != 20001 && var1 != 20002 && var1 != 20003 && var1 != 20007 && var1 != 20009 && var1 != 20011) {
                                 return var1 != 20004 && var1 != 20005 && var1 != 20006 && var1 != 20008 && var1 != 20010 && var1 != 20012 ? 0 : 2;
                              } else {
                                 return 1;
                              }
                           } else {
                              return 4;
                           }
                        } else {
                           return 3;
                        }
                     } else {
                        return 6;
                     }
                  } else {
                     return 5;
                  }
               } else {
                  return 10;
               }
            } else {
               return 9;
            }
         } else {
            return 8;
         }
      } else {
         return 7;
      }
   }

   public static String h(Skill var0, double var1) {
      double var3 = getFMSld(var1);
      String var5 = "#G" + var0.getRemark();
      double var6 = Double.parseDouble(var0.getValue());
      double var8 = Double.parseDouble(var0.getGrow());

      int var10000;
      int var10;
      String var11;
      for(var10000 = var10 = --1; var10000 <= 27; var10000 = var10) {
         var11 = MsgUntil.b(var10);
         if (var10 > (94 & 43) && var10 % (110 & 27) == 0) {
            var11 = MsgUntil.b(var10 / (26 & 111)) + "十";
         } else if (var10 > (55 & 92)) {
            var11 = MsgUntil.b(var10 / (79 & 58)) + "十" + MsgUntil.b(var10 % (126 & 11));
         } else if (var10 > (106 & 31)) {
            var11 = "十" + MsgUntil.b(var10 % (58 & 79));
         }

         var11 = "{法门" + var11 + "}";
         var5 = var5.replace(var11, f(var10++, var6, var8, var3));
      }

      for(var10000 = var10 = 4 ^ 5; var10000 <= 12; var10000 = var10) {
         var11 = MsgUntil.b(var10);
         if (var10 > (46 & 91) && var10 % (15 & 122) == 0) {
            var11 = MsgUntil.b(var10 / (79 & 58)) + "十";
         } else if (var10 > (86 & 61)) {
            var11 = MsgUntil.b(var10 / (79 & 58)) + "十" + MsgUntil.b(var10 % (30 & 107));
         } else if (var10 > (122 & 15)) {
            var11 = "十" + MsgUntil.b(var10 % (58 & 79));
         }

         var11 = "{法门重数" + var11 + "}";
         StringBuilder var12 = (new StringBuilder("#R")).append(getFMCS(var10, var1)).append("#G");
         ++var10;
         var5 = var5.replace(var11, var12.toString());
      }

      return var5;
   }

   public static int getSmIndex(int var0, int var1) {
      if (var0 == 3 >> 1) {
         if (var1 == 0) {
            return 1 ^ 3;
         } else {
            return var1 == (3 & 5) ? --3 : 1;
         }
      } else if (var0 == 5 >> 1) {
         if (var1 == 0) {
            return 1 ^ 3;
         } else {
            return var1 == 3 >> 1 ? --3 : 4;
         }
      } else if (var0 == --3) {
         if (var1 == 0) {
            return --5;
         } else {
            return var1 == --1 ? 87 & 46 : 8;
         }
      } else if (var0 == --4) {
         if (var1 == 0) {
            return --5;
         } else {
            return var1 == 3 >> 1 ? 55 & 78 : 7;
         }
      } else if (var0 == --5) {
         if (var1 == 0) {
            return 43 & 94;
         } else {
            return var1 == (3 & 5) ? 27 & 111 : 9;
         }
      } else if (var0 == (103 & 30)) {
         if (var1 == 0) {
            return 79 & 58;
         } else {
            return var1 == (2 ^ 3) ? 27 & 111 : 12;
         }
      } else if (var0 == (119 & 15)) {
         if (var1 == 0) {
            return 47 & 95;
         } else {
            return var1 == (3 & 5) ? 15 & 125 : 14;
         }
      } else if (var0 == (30 & 105)) {
         if (var1 == 0) {
            return 47 & 95;
         } else {
            return var1 == --1 ? 95 & 45 : 16;
         }
      } else if (var0 == (107 & 29)) {
         if (var1 == 0) {
            return 93 & 51;
         } else {
            return var1 == --1 ? 115 & 31 : 20;
         }
      } else if (var0 == 10) {
         if (var1 == 0) {
            return 17;
         } else {
            return var1 == 5 >> 2 ? 19 : 18;
         }
      } else {
         return 0;
      }
   }
}
